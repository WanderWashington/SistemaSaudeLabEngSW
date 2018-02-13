<%-- 
    Document   : login
    Created on : 09/12/2017, 15:38:46
    Author     : Wander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    String contexto = request.getContextPath();
    if (!contexto.equals(""))
        contexto = contexto + "/";
%>

<!DOCTYPE html>

<html>
    <head>
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="${contexto}static/css/loginEstilo.css">
        <script src="verificaLogin.js"></script>
        <meta charset="UTF-8">    
    </head>
    <body>
      
         <div id ="login">
        <!--<div class ="message"</div>
        <div class ="logo" </div>-->
              <form class="baseForm" action="Autenticador.action" method="post">
                 <label for="usuario">Usuario :</label><input id="usuario" type ="text" class="texto" name="usuario" value=""/>
                 <label for="senha">Senha :</label><input id="senha" type="password" class="texto" name="senha" value=""/>
                 <button type="submit" class="sb" value ="Entrar" >Entrar</button>
             </form>

         </div>
    </body>
</html>
