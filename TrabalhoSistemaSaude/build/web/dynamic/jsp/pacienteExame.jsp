<%-- 
    Document   : pacienteExame
    Created on : 13/12/2017, 15:05:46
    Author     : Wander
--%>

<%@page import="api.modelo.ExameMedico"%>
<%@page import="core.servico.ServicoPacienteImpl"%>
<%@page import="api.servico.ServicoPaciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="api.dao.PacienteDAO"%>
<% 
    String contexto = request.getContextPath();
    if (!contexto.equals(""))
        contexto = contexto + "/";
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Exame</title>
        <link rel="stylesheet" type="text/css" href="../../static/css/telasEstilo.css">
        <link rel="stylesheet" type="text/css" href="${contexto}static/css/telasEstilo.css">
        <link rel="stylesheet" type="text/css" href="${contexto}static/css/formularioEstilo.css">
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
                <li><a href="index.html">Sair</a></li>
                </ul>
         </nav>
     <table id="textoUsuario">
         <% 
          ServicoPaciente pPaciente= new ServicoPacienteImpl();
            ExameMedico uBD =(ExameMedico) request.getAttribute("cra");
        %>
        <tr>
                <td>
                    <h2>Exame de Urina tipo 1 :</h2>
                      <h5>EAS(urina tipo 1) normal:
                        
                          <br>CRA:<%out.print(uBD.getCra());%><br>
                        COR ... <%out.print(uBD.getCor());%><br>
                        ASPECTO ... <%out.print(uBD.getAspecto());%><br>
                        DENSIDADE... <%out.print(uBD.getDensidade());%><br>
                        PH ... <%out.print(uBD.getPh());%><br>
                           <br>
                        EXAME QUÍMICO<br>

                        Glicose ... <%out.print(uBD.getGlicose());%><br>
                        Proteínas ... <%out.print(uBD.getProteinas());%><br>
                        Bilirrubina ... <%out.print(uBD.getBilirrubina());%><br>
                        Urobilinogênio ... <%out.print(uBD.getUrobilinogenio());%><br>
                        Leucócitos ... <%out.print(uBD.getLeucocitos());%><br>
                        Hemoglobina ... <%out.print(uBD.getHemoglobina());%><br>
                        Nitrito ... <%out.print(uBD.getNitrito());%><br>
<br>
<br>
                        MICROSCOPIA DO SEDIMENTO(sedimentoscopia)<br>

                        Células epiteliais ... <%out.print(uBD.getCelulasep());%><br>
                        Leucócitos ... <%out.print(uBD.getMleucocitos());%><br>
                        Hemácias ... <%out.print(uBD.getHemacias());%><br>
                        Muco ... <%out.print(uBD.getMuco());%><br>
                        Bactérias ... <%out.print(uBD.getBacterias());%><br>
                        Cristais ... <%out.print(uBD.getCristais());%><br>
                        Cilindros ... <%out.print(uBD.getCilindros());%><br>
                        </h5>
                    <br>    
                    <a href="${contexto}dynamic/jsp/pacienteConsultaExame.jsp">Voltar</a>

                </td>
            </tr>
        </table>
    </body>
</html>
