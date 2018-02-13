<%-- 
    Document   : adminCadastroUsuario
    Created on : 09/12/2017, 15:52:55
    Author     : Wander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="web.servlet.*"%>
<% 
    String contexto = request.getContextPath();
    if (!contexto.equals(""))
        contexto = contexto + "/";
%>

<!DOCTYPE html>

<html>
    <head>
        <title>Cadastro de Usuarios</title>
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
    <form action="../../CadastroAdmin" method="post">
      <fieldset id="formulario">
            <legend>Cadastro de Usuario</legend>
            <table cellspacing="20" >
             <tr>
              <td>
               <label for="nome">Nome: </label>
              </td>
              <td align="left">
               <input type="text" name="nome" size="25">
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
               <label for="rg">RG: </label>
              </td>
              <td align="left">
               <input type="text" name="rg" size="20" maxlength="13"> 
              </td>
             </tr>
             <tr>
              <td>
               <label>CPF:</label>
              </td>
              <td align="left">
               <input type="text" name="cpf" size="15" maxlength="9" > - <input type="text" name="cpf2" size="3" maxlength="2">
              </td>
             </tr>
               <tr>
              <td>
               <label>Usuário: </label>
              </td>
              <td align="left">
                  <input type="text" name="usuario" size="20">
              </td>
             </tr>
                <tr>
              <td>
               <label>Senha: </label>
              </td>
              <td align="left">
                  <input type="password" name="senha" size="20">
              </td>
             </tr>
             <tr>
                 <td>
                  <label for="tipoUsuario">Tipo de Usuário</label>
                 </td>
                 <td align="left">
                  <select name="nivelUsuario" id="nivelUsuario"> 
                  <option value="1">1- Administrador</option> 
                  <option value="2">2- Medico</option> 
                  <option value="3">3- Paciente</option> 
                  </select>
                 </td>
                </tr>

             <tr>
                 <td>
                    <input type="submit" value="Enviar" id="botaoEnviar">    
                    <input type="reset" value="Limpar" id="botaoResetar">
                  </td>
             </tr>
                
            </table>
           </fieldset>  
       </form>
    </body>
</html>
