<%-- 
    Document   : adminCadastroMedico
    Created on : 28/11/2017, 07:33:03
    Author     : Wander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    String contexto = request.getContextPath();
    if (!contexto.equals(""))
        contexto = contexto + "/";
%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Cadastro Medico</title>
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
           
                <li><a href="#">Inicio - Administrador</a></li>
                <li><a href="#">Cadastro</a>
                    <ul>
                        <li><a href="adminCadastroUsuario.jsp">Usuario</a></li>
                        <li><a href="adminCadastroMedico.jsp">Medico</a></li>
                        <li><a href="adminCadastroPaciente.jsp">Paciente</a></li>
                    </ul>
                </li>
                <li><a href="#">Excluir</a>
                    <ul>
                        <li><a href="adminDeletarUsuario.jsp">Excluir Usuario</a></li>
                        <li><a href="adminDeletarMedico.jsp">Excluir Medico</a></li>
                       
                    </ul>
                </li>
                <li><a href="#">Sobre</a></li>
                <li><a href="/TrabalhoSistemaSaude/">Sair</a></li>
                </ul>
         </nav>
    <form action="../../CadastroMedico" method="post">
      <fieldset id="formulario">
            <legend>Cadastro Medico</legend>
            <table cellspacing="20" >
             <tr>
              <td>
               <label for="nome">Nome: </label>
              </td>
              <td align="left">
               <input type="text" name="nome">
              </td>
              <td>
               <label for="sobrenome">Sobrenome: </label>
              </td>
              <td align="left">
               <input type="text" name="sobrenome">
              </td>
             </tr>
             <tr>
              <td>
               <label>Data de Nascimento: </label>
              </td>
              <td align="left">
               <input type="text" name="dia" size="2" maxlength="2" value=""> 
              <input type="text" name="mes" size="2" maxlength="2" value=""> 
              <input type="text" name="ano" size="4" maxlength="4" value="">
              </td>
             </tr>
             <tr>
              <td>
               <label for="rg">RG: </label>
              </td>
              <td align="left">
               <input type="text" name="rg" size="13" maxlength="13"> 
              </td>
             </tr>
             <tr>
              <td>
               <label>CPF:</label>
              </td>
              <td align="left">
               <input type="text" name="cpf" size="9" maxlength="9"> - <input type="text" name="cpf2" size="2" maxlength="2">
              </td>
             </tr>
             <tr>
              <td>
               <label>CRM:</label>
              </td>
              <td align="left">
               <input type="text" name="crm" size="9" maxlength="15"> 
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
                        <input type="submit" value="Cadastrar" id="botaoEnviar">    
                         <input type="reset" value="Limpar" id="botaoResetar">
                 </td>
             </tr>
                
            </table>
           </fieldset>  
    
    </form>
      
    </body>
</html>
