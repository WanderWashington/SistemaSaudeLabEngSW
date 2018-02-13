<%-- 
    Document   : pacientePrincipal
    Created on : 28/11/2017, 08:11:26
    Author     : Wander
--%>

<%@page import="core.servico.ServicoPacienteImpl"%>
<%@page import="api.modelo.Usuario"%>
<%@page import="api.modelo.Usuario"%>
<%@page import="api.servico.ServicoPaciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    String contexto = request.getContextPath();
    if (!contexto.equals(""))
        contexto = contexto + "/";
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio - Paciente</title>
           <link rel="stylesheet" type="text/css" href="../../static/css/telasEstilo.css">
           <link rel="stylesheet" type="text/css" href="${contexto}static/css/telasEstilo.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <nav>
        <ul id="lista"> 
           
                <li><a href="#">Inicio - Paciente</a></li>
                <li><a href="#">Cadastro e Consulta</a>
                    <ul>
                        <li><a href="${contexto}dynamic/jsp/pacienteConsultaExame.jsp">Consultar Exame</a></li>
                        <li><a href="${contexto}dynamic/jsp/pacienteAgendarConsulta.jsp">Agendar Consulta</a></li>
                    </ul>
                </li>
                <li><a href="#">Sobre</a></li>
                <li><a href="/TrabalhoSistemaSaude/">Sair</a></li>
                </ul>
         </nav>
     <table id="paginasUsuarios">
            <tr>
                <td>
                    <h2>Bem vindo<br></h2>
                        <br>Esta é uma conta de nível Paciente, você pode :<br><br>
                        -Agendar uma consulta médica <br>-Consultar resultado de exame médico<br>
                </td>
            </tr>
        </table>
    </body>
</html>
