<%-- 
    Document   : saludo
    Created on : 06-jun-2018, 12:57:54
    Author     : EstIvonneGeovannaCam
--%>

<%@page import="Pruebas.Metodos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! <%= new java.util.Date() %></h1>
        <%=Metodos.hola()%>
                    
        
    </body>
</html>
