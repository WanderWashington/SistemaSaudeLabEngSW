<%-- 
    Document   : pacienteConsultaExame
    Created on : 28/11/2017, 08:13:28
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
        <title>Consulta Exame</title>
           <link rel="stylesheet" type="text/css" href="${contexto}static/css/telasEstilo.css">
        <link rel="stylesheet" type="text/css" href="${contexto}static/css/formularioEstilo.css">
         
           <link rel="stylesheet" type="text/css" href="../../static/css/telasEstilo.css">
                <link rel="stylesheet" type="text/css" href="../../static/css/formularioEstilo.css">
            <script src="../static/js/verificaLogin.js"></script>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <nav>
        <ul id="lista"> 
           
                <li><a href="#">Inicio - Paciente</a></li>
                <li><a href="#">Cadastro e Consulta</a>
                    <ul>
                 
                        <li><a href="pacienteConsultaExame.jsp">Consultar Exame</a></li>
                        <li><a href="pacienteAgendarConsulta.jsp">Agendar Consulta</a></li>
                    </ul>
                </li>
                <li><a href="#">Sobre</a></li>
                <li><a href="/TrabalhoSistemaSaude/">Sair</a></li>
                </ul>
         </nav>
  <form action="../../Exame" method="post">
      <fieldset id="formulario">
            <legend>Consulta Exame</legend>
            <table cellspacing="20" >
             <tr>
              <td>
               <label>CRA: </label>
              </td>
              <td align="left">
               <input type="text" name="cra" size="13" maxlength="13" id="cra"> 
              </td>
             </tr>
             <tr>
                 <td>
                     <input type="submit" value="Pesquisar" id="botaoEnviar">    
                         <input type="reset" value="Limpar" id="botaoResetar">
                 </td>
             </tr>
                
            </table>
           </fieldset>  
    
    </form>
    </body>
</html>
