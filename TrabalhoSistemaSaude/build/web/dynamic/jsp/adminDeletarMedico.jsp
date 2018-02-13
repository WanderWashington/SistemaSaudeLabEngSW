<%-- 
    Document   : adminDeletarMedico
    Created on : 13/12/2017, 20:49:32
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
        <title>Deletar Medico</title>
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
  <form action="../../DeletaMedico" method="post">
      <fieldset id="formulario">
            <legend>Deletar Medico</legend>
            <table cellspacing="20" >
             <tr>
              <td>
               <label>CRM: </label>
              </td>
              <td align="left">
               <input type="text" name="crm" size="13" maxlength="13" id="cra"> 
              </td>
             </tr>
             <tr>
                 <td>
                     <input type="submit" value="Deletar" id="botaoEnviar">    
                         <input type="reset" value="Limpar" id="botaoResetar">
                 </td>
             </tr>   
            </table>
           </fieldset>  
    
    </form>
    </body>
</html>
