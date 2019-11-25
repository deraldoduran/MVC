<%-- 
    Document   : ok
    Created on : 23/11/2019, 19:30:46
    Author     : duran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean  id="usuario" type="Model.Usuario" scope="request"/>
<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ok.....foi redirecionado seja bem vindo!</h1>
        <hr/>
           seu ID: <strong>${Usuario.id}</strong><br/>
    seu user name: <strong>${Usuario.nome}</strong><br/>
    seu nome     : <strong>${Usuario.sobrenome}</strong><br/>
    seu email    : <strong>${Usuario.email}</strong><br/>
    </body>
</html>
