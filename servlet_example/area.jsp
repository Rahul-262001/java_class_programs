<%-- 
    Document   : area
    Created on : 09-Jan-2024, 11:58:15 AM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area of Rectangle</title>
    </head>
    <body>
        <h1>Area of Rectangle</h1>
        <%! //this is the declarative tag 
            int l, b;
            int rarea(int a, int b){return a*b;}
        %>
        <% //scriptlet tag
            l = Integer.parseInt(request.getParameter("l"));
            b = Integer.parseInt(request.getParameter("b"));
        %>
        <!--using expression tag for printing, it does not have semicolon-->
        <%="Length: "+l+"\nBreadth: "+b+"\nArea: "+rarea(l,b)%>
    </body>
</html>
