<%-- 
    Document   : procesolog
    Created on : 03-jun-2018, 14:18:54
    Author     : EstIvonneGeovannaCam
--%>
<%@page import="ClsConexion.Empresa"%>
<%@page import="ClsConexion.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   
    <%
        // Validacion login de los candidatos
        String nickname=request.getParameter("nick");
        String password=request.getParameter("pass");
        out.println(nickname);
        out.println(password);
        Usuario us=new Usuario();
        
        String correcto = us.autenticacion(nickname, password);
        
        out.print(correcto);
        
        /*if (correcto.equals("true")){
            HttpSession sess=request.getSession();
            out.print(sess);
            out.print("log correcto");
        }else{
            response.sendRedirect("index.html");
        }
        */
        //Validacion de login empresarial
       /* String email_emp=request.getParameter("correo_e");
        String password_e=request.getParameter("pass_e");
        out.println(email_emp);
        out.println(password_e);
        System.out.println(email_emp+" "+ password_e);
        Empresa emp=new Empresa();
        
        String correcto_log = emp.autenticacion_emp(email_emp, password_e);
        
        out.print(correcto_log);
        System.out.println(correcto_log);
        
        if (correcto_log.equals("true")){
            HttpSession sess=request.getSession();
            out.print(sess);
            out.print("login empresarial correcto");
        }else{
            response.sendRedirect("index.html");
        }*/
        
    %>
       
    
</html>
