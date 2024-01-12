<%-- 
    Document   : hashlogin
    Created on : 10-Jan-2024, 9:59:47 PM
    Author     : root
--%>
<%@ page import="java.sql.*"%>
<%@ page import="java.security.MessageDigest"%>
<%@ page import="java.nio.charset.StandardCharsets"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%! 
            class Create{
                final String url = "jdbc:mysql://localhost:3306/mcasem3";
                String username = "root";
                String password = "";
                Connection conn;
                Statement st;
                Create() {
                    try {
                        conn = DriverManager.getConnection(url, username, password); 
                        st = conn.createStatement(); 
                    } catch (Exception e) {
                        System.out.println("Error connecting to database" + e.getMessage());
                    }
                }
                public String insert(String u, String p){
                    try {
                        String query = "insert into servletjdbc values('"+u+"' , '"+hash(u+p)+"')";
                        st.executeUpdate(query);
                        return "OK";
                    } catch (Exception e) {
                        System.out.println("\n\tERROR:\t" + e.getMessage() + "\n");
                        e.printStackTrace();
                        return e.getMessage();
                    }
                            }
                public String hash(String messagedigest){
                    try{
                        String algo="SHA-256";
                        MessageDigest md = MessageDigest.getInstance(algo);
                        byte[] hashedBytes = md.digest(messagedigest.getBytes(StandardCharsets.UTF_8));
                        StringBuilder sb = new StringBuilder(2 * hashedBytes.length);
                        for (byte b : hashedBytes) {
                            String hex = Integer.toHexString(0xff & b);
                            if(hex.length() == 1) {
                                sb.append('0');
                            }
                            sb.append(hex);
                        }
                        return sb.toString();   
                    }
                    catch(Exception e){
                        System.out.println("\n\tERROR: "+e.getMessage()+"\n\n");
                    }
                    return "";
                } 
            }
        %>
        
        
    </body>
</html>
