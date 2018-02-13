<%-- 
    Document   : adminCadastroPaciente
    Created on : 28/11/2017, 07:33:15
    Author     : Wander
--%>
<%@page import="api.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    String contexto = request.getContextPath();
    if (!contexto.equals(""))
        contexto = contexto + "/";
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro Paciente</title>
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
    <form action="../../CadastroPaciente" method="post">
      <fieldset id="formulario">
            <legend>Cadastro de Paciente</legend>
                <table cellspacing="10">
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
                   <label>CRA: </label>
                  </td>
                   <td align="left">
                    <input type="text" name="cra" size="13" maxlength="13">
                   </td>
                 </tr>
                   <tr>
                 <td>
                  <label for="rua">Rua:</label>
                 </td>
                 <td align="left">
                  <input type="text" name="rua">
                 </td>
                 <td>
                  <label for="numero">Numero:</label>
                 </td>
                 <td align="left">
                  <input type="text" name="numero" size="4">
                 </td>
                </tr>
                <tr>
                 <td>
                  <label for="bairro">Bairro: </label>
                 </td>
                 <td align="left">
                  <input type="text" name="bairro">
                 </td>
                </tr>
                <tr>
                 <td>
                  <label for="estado">Estado:</label>
                 </td>
                 <td align="left">
                  <select name="estado"> 
                  <option value="sp">São Paulo</option> 

                 </select>
                 </td>
                </tr>
                <tr>
                 <td>
                  <label for="cidade">Cidade: </label>
                 </td>
                 <td align="left">
                  <input type="text" name="cidade">
                 </td>
                </tr>
                <tr>
                 <td>
                  <label for="cep">CEP: </label>
                 </td>
                 <td align="left">
                  <input type="text" name="cep" size="5" maxlength="5"> - <input type="text" name="cep2" size="3" maxlength="3">
                 </td>
                </tr>
                <tr>
                    <td><br>
                        <input type="submit" value="Cadastrar" id="botaoEnviar">
                        <input type="reset" value="Limpar" id="botaoLimpar">
                </tr>
            </table>
           </fieldset>  
        </form>
    </body>
</html>
