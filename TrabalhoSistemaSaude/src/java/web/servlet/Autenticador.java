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
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Wander
 */
public class Autenticador extends HttpServlet {   
      
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        
           try{
            req.setCharacterEncoding("UTF-8"); 
        }catch(Exception e){} 
        String nomeUsuario = req.getParameter("usuario");
        String senha = req.getParameter("senha");
        
        ServicoUsuario sUsuario = new ServicoUsuarioImpl();
        Usuario uBD = sUsuario.buscarPeloLogin(nomeUsuario);
        
        ServletContext sc = req.getServletContext();
        
        if(nomeUsuario.equals("") || senha.equals(""))
            {
                 try {
                req.setAttribute("falhaAutenticacao", true);
                sc.getRequestDispatcher("/dynamic/jsp/login.jsp").forward(req, resp);
            }catch(Exception e){
               
            }
            
            }
        

        if ( nomeUsuario.equals(uBD.getLogin()) && senha.equals(uBD.getSenha())){
            if(uBD.getNivel().equals(1)){
            try{
               req.setAttribute("adminLogado",uBD);
                sc.getRequestDispatcher("/dynamic/jsp/adminPrincipal.jsp").forward(req, resp); 
            }catch( Exception e){
           
            }            
           }
            if(uBD.getNivel().equals(2))
                {
                   try{
                     req.setAttribute("medicoLogado",uBD);
                     sc.getRequestDispatcher("/dynamic/jsp/medicoPrincipal.jsp").forward(req, resp);
                   
                   } catch(Exception e)
                   {
                   }
                }
            if(uBD.getNivel().equals(3))
                {
                   try{
                       req.setAttribute("pacienteLogado",uBD);
                     sc.getRequestDispatcher("/dynamic/jsp/pacientePrincipal.jsp").forward(req, resp);
                   
                   } catch(Exception e)
                   {
                   }
                }
            
        }
        else{
            try {
                req.setAttribute("falhaAutenticacao", true);
                sc.getRequestDispatcher("/dynamic/jsp/login.jsp").forward(req, resp);
            }catch(Exception e){
               
            }  
    }
}
}