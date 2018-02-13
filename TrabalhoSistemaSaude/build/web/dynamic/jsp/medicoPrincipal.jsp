<%-- 
    Document   : medicoPrincipal
    Created on : 28/11/2017, 08:21:33
    Author     : Wander
--%>

<%@page import="api.modelo.Usuario"%>
<%@page import="core.servico.ServicoPacienteImpl"%>
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
        <title>Inicio - Médico </title>
           <link rel="stylesheet" type="text/css" href="${contexto}static/css/telasEstilo.css">
           <link rel="stylesheet" type="text/css" href="../../static/css/telasEstilo.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <nav>
        <ul id="lista"> 
           
                <li><a href="#">Inicio - Médico</a></li>
                <li><a href="#">Cadastro e Consulta</a>
                    <ul>
                        <li><a href="${contexto}dynamic/jsp/medicoAgendarExame.jsp">Agendar Exame</a></li>
                        <li><a href="${contexto}dynamic/jsp/medicoAgendarRetorno.jsp">Agendar Retorno</a></li>
                        <li><a href="${contexto}dynamic/jsp/medicoConsultaExameMedico.jsp">Consultar Exame</a></li>
                    </ul>
                </li>
                <li><a href="#">Sobre</a></li>
                <li><a href="/TrabalhoSistemaSaude/">Sair</a></li>
                </ul>
         </nav>
     <table id="paginasUsuarios">
   
            <tr>
                <td>
                   <h2>Bem vindo!<br></h2>
                        <br>Esta é uma conta de nível Médico, você pode :<br><br>
                        -Agendar um exame <br>-Agendar retorno do paciente<br>-Consultar exame médico do paciente<br>
                </td>
            </tr>
        </table>
    </body>
</html>
