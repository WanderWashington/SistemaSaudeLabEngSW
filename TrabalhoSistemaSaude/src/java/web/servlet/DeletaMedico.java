/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.ExameMedico;
import api.modelo.Medico;
import api.modelo.Paciente;
import api.modelo.Usuario;
import api.servico.ServicoPaciente;
import api.servico.ServicoUsuario;
import core.servico.ServicoPacienteImpl;
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
public class DeletaMedico extends HttpServlet {   
      
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        
           try{
            req.setCharacterEncoding("UTF-8"); 
        }catch(Exception e){} 
        
           
        String crm = req.getParameter("crm");
        
        ServicoUsuario sUsuario= new ServicoUsuarioImpl();
        Medico uBD= sUsuario.deletarMedico(crm);
         ServletContext sc = req.getServletContext();
        
        
        if(crm.equals(""))
            {
                try {
                   
                   sc.getRequestDispatcher("/dynamic/jsp/adminDeletarMedico.jsp").forward(req, resp);
               }catch(Exception e){
                   System.out.println("Houve um erro aqui: "+e.getMessage());
                
               }
            }
       
        if(crm.equals(uBD.getRg())){
         try {

                   sc.getRequestDispatcher("/dynamic/jsp/adminPrincipal.jsp").forward(req, resp);
               }catch(Exception e){
                   System.out.println("Houve um erro aqui: "+e.getMessage());
                
               }
        
        
        }
        
        else{
            try {
                
                sc.getRequestDispatcher("/dynamic/jsp/adminPrincipal.jsp").forward(req, resp);
            }catch(Exception e){
                System.out.println("Houve um erro aqui: "+e.getMessage());
          
            }  
    }
        
        
        
    }
}