<%-- 
    Document   : medicoAgendarExame
    Created on : 28/11/2017, 08:24:49
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
        <title>Agendar Exame</title>
           <link rel="stylesheet" type="text/css" href="../../static/css/telasEstilo.css">
           <link rel="stylesheet" type="text/css" href="../../static/css/formularioEstilo.css">
           <link rel="stylesheet" type="text/css" href="${contexto}static/css/telasEstilo.css">
           <link rel="stylesheet" type="text/css" href="${contexto}static/css/formularioEstilo.css">
       
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <nav>
        <ul id="lista"> 
           
                <li><a href="#">Inicio - Médico</a></li>
                <li><a href="#">Cadastro e Consulta</a>
                    <ul>
                       <li><a href="medicoAgendarExame.jsp">Agendar Exame</a></li>
                        <li><a href="medicoAgendarRetorno.jsp">Agendar Retorno</a></li>
                        <li><a href="medicoConsultaExameMedico.jsp">Consultar Exame</a></li>
                    </ul>
                </li>
                <li><a href="#">Sobre</a></li>
                <li><a href="/TrabalhoSistemaSaude/">Sair</a></li>
                </ul>
         </nav>
    <form action="../../MarcarExameMedico" method="post">
      <fieldset id="formulario">
            <legend>Agendamento de Exame</legend>
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
               <label>Data do Exame: </label>
              </td>
              <td align="left">
               <input type="text" name="dia" size="2" maxlength="2" value=""> 
              <input type="text" name="mes" size="2" maxlength="2" value=""> 
              <input type="text" name="ano" size="4" maxlength="4" value="">
              </td>
             </tr>
             <tr>
                 <td>
                  <label for="exame">Exames Disponíveis</label>
                 </td>
                 <td align="left">
                  <select name="exame"> 
                  <option value="hemograma">Hemograma</option> 
                 
                   <option value="urina1">Urina Tipo 1</option> 
                   
                  </select>
                 </td>
                </tr>
                <tr>
              <td>
               <label>Horário: </label>
              </td>
              <td align="left">
                 <input type="text" name="hora" size="2" maxlength="2"> : <input type="text" name="minutos" size="2" maxlength="2">
              </td>
             </tr>
             <tr>
                 <td>
                        <input type="submit" value="Agendar" id="botaoEnviar">    
                         <input type="reset" value="Limpar" id="botaoResetar">
                 </td>
             </tr>
                
            </table>
           </fieldset>  
    
    </form>
    </body>
</html>
