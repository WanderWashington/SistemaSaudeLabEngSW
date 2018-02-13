/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.Usuario;
import api.servico.ServicoUsuario;
import core.servico.ServicoUsuarioImpl;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Wander
 */
public class CadastroAdmin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
         request.setCharacterEncoding("UTF-8"); 
        }catch(Exception e){} 
         String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String rg = request.getParameter("rg");
        String cpf = request.getParameter("cpf");
        cpf+=request.getParameter("cpf2");
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        String nivel = request.getParameter("nivelUsuario");
        
        
        Usuario temp = new Usuario();
        temp.setNome(nome);temp.setSobrenome(sobrenome);temp.setRg(rg);temp.setCpf(cpf);temp.setLogin(usuario);
        temp.setSenha(senha);
        temp.setNivel(Integer.parseInt(nivel));
        
        
      
        
       ServicoUsuario sUsuario = new ServicoUsuarioImpl();
        Usuario uBD = sUsuario.inserirAdmin(temp);
            
        ServletContext sc = request.getServletContext();
        
        if(nome.equals("") || sobrenome.equals("") || rg.equals("") || cpf.equals("") ||
                usuario.equals("") || senha.equals("") || nivel.equals(""))
   
        {
           try{
               request.setAttribute("burlando","sim");
               sc.getRequestDispatcher("/dynamic/jsp/adminPrincipal.jsp").forward(request, response); 
            }catch( Exception e){

               System.out.print("erro"+e.getMessage());
            }             
        }
        
        else{
            try{
               request.setAttribute("burlando","nao");   
             sc.getRequestDispatcher("/dynamic/jsp/adminPrincipal.jsp").forward(request, response); 
            }catch( Exception e){
           
               System.out.print("erro"+e.getMessage());
            }             
        }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
