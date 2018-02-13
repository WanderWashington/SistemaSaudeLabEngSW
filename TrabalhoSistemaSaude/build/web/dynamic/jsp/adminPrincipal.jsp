<%-- 
    Document   : adminPrincipal
    Created on : 09/12/2017, 15:48:17
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
        <title>Inicio - Administrador</title>
          <link rel="stylesheet" type="text/css" href="${contexto}static/css/telasEstilo.css">
        <link rel="stylesheet" type="text/css" href="../../static/css/telasEstilo.css">
          <meta charset="UTF-8">
          <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
    </head>
    <body>
       <nav>
        <ul id="lista"> 
           
                <li><a href="#">Inicio - Administrador</a></li>
                <li><a href="#">Cadastro</a>
                    <ul>
                        <li><a href="${contexto}dynamic/jsp/adminCadastroUsuario.jsp">Usuario</a></li>
                        <li><a href="${contexto}dynamic/jsp/adminCadastroMedico.jsp">Medico</a></li>
                        <li><a href="${contexto}dynamic/jsp/adminCadastroPaciente.jsp">Paciente</a></li>
                    </ul>
                </li>
                <li><a href="#">Excluir</a>
                    <ul>
                        <li><a href="${contexto}dynamic/jsp/adminDeletarUsuario.jsp">Excluir Usuario</a></li>
                        <li><a href="${contexto}dynamic/jsp/adminDeletarMedico.jsp">Excluir Medico</a></li>
                       
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
                        <br>Esta é uma conta de Administrador, você pode :<br><br>
                        -Cadastrar Adminstradores <br>-Cadastrar Medicos<br>-Cadastrar Pacientes<br>
                        -Cadastrar novos Logins<br>
                    -Deletar Usuários
                </td>
            </tr>
        </table>
    </body>
</html>
