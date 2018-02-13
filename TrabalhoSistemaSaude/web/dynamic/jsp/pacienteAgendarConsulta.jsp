<%-- 
    Document   : pacienteAgendarExame
    Created on : 28/11/2017, 08:13:18
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
        <title>Agendar Consulta</title>
          <link rel="stylesheet" type="text/css" href="${contexto}static/css/telasEstilo.css">
        <link rel="stylesheet" type="text/css" href="${contexto}static/css/formularioEstilo.css">
         
           <link rel="stylesheet" type="text/css" href="../../static/css/telasEstilo.css">
                <link rel="stylesheet" type="text/css" href="../../static/css/formularioEstilo.css">
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
    <form action="../../AgendaConsulta" method="post">
      <fieldset id="formulario">
            <legend>Agendamento de Consulta</legend>
            <table cellspacing="20" >
                 <tr>
              <td>
               <label>CRA: </label>
              </td>
              <td align="left">
               <input type="text" name="cra" size="13" maxlength="13"> 
              </td>
             </tr>

             <tr>
              <td>
               <label>Data de Consulta:</label>
              </td>
              <td align="left">
               <input type="text" name="dia" size="2" maxlength="2" value=""> 
              <input type="text" name="mes" size="2" maxlength="2" value=""> 
              <input type="text" name="ano" size="4" maxlength="4" value="">
              </td>
             </tr>
             
              <td>
               <label>Horário: </label>
              </td>
              <td align="left">
                 <input type="text" name="hora" size="2" maxlength="2"> : <input type="text" name="minutos" size="2" maxlength="2">
              </td>
             </tr>
             <tr>
                 <td>
                  <label for="especialidade">Especialidade:</label>
                 </td>
                 <td align="left">
                  <select name="especialidade" id="consulta"> 
                  <option value="ClinicoGeral">Clinico Geral</option> 
                  <option value="Pediatra">Pediatra</option> 
                  <option value="Dentista">Dentista</option> 
                  </select>
                 </td>
                </tr>
             <tr>
                 <td>
                        <input type="submit" value="Agendar" id="botaoEnviar" onclick="notificar()">
                         <input type="reset" value="Limpar" id="botaoResetar">
                 </td>
             </tr>
                
            </table>
           </fieldset>  
    
    </form>
    </body>
</html>
