/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author root
 */
@WebServlet(urlPatterns = {"/create_account"})
public class create_account extends HttpServlet {
//    public static void main(String[] args){
//        String username  = "a";
//        String password  = "b";
//        String h = new Hash().hash(username+password);
//        String i = new Create().insert(username, h);
//        System.out.println(new Hash().hash("username+password"));
//        System.out.println(new Create().insert("u", new Hash().hash("username+password")));
//    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String h = new Hash().hash(username+password);
        System.out.println(h);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Created Account</title>");            
            out.println("</head>");
            out.println("<body>");
            String i = new Create().insert(username, h, out);
            out.println("<h1>Servlet Create Account, Welcome " + username + password+h+"<hr>"+i+"</h1>"+"<br>"+i);
            out.println("</body>");
            out.println("</html>");
        }
    }
}

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>


class Create{
    final String url = "jdbc:mysql://localhost:3306/mcasem3";
    String username = "root";
    String password = "";
    Connection conn;
//    PreparedStatement st;
    Statement st;
    Create() {
        try {
            conn = DriverManager.getConnection(url, username, password);
            
//            st = conn.prepareStatement("insert into servletjdbc values(?, ?)"); 
              st = conn.createStatement();
        } catch (Exception e) {
            System.out.println("Error connecting to database" + e.getMessage());
        }
    }
    public String insert(String u, String h, PrintWriter p){
        try {
              
//            st.setString(1, u);
//            st.setString(2, h);
//            st.executeUpdate();
           if (conn == null)
               p.print("FAILED");
            p.print(u+"|"+h);
            st.executeUpdate("insert into servletjdbc values('"+u+"','"+h+"')");
//            st.close(); 
//            conn.close();
            return "OK";
        } catch (Exception e) {
            System.out.println("\n\tERROR:\t" + e.getMessage() + "\n");
            e.printStackTrace();
            return "Fail";
//            return e.getMessage();
        }
    }
}
    
  

class Hash{
    public String hash(String messagedigest){
        try{
            String algo="SHA-256";
            MessageDigest md = MessageDigest.getInstance(algo);
            byte[] hashedBytes = md.digest(messagedigest.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(2 * hashedBytes.length);
            for (byte b : hashedBytes) {
                String hex = Integer.toHexString(0xff & b);
//                sb.append(String.format("%02x", b));
                if(hex.length() == 1) {
                    sb.append('0');
                }
                sb.append(hex);
            }
            return sb.toString();   
        }
        catch(Exception e){
            System.out.println("\n\tERROR: "+e.getMessage()+"\n\n");
            return "Fail";
        }
    } 
}