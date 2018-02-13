/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.ExameMedico;
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
public class Exame extends HttpServlet {   
      
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        
           try{
            req.setCharacterEncoding("UTF-8"); 
        }catch(Exception e){} 
        
           
        String cra = req.getParameter("cra");
        
        ServicoPaciente pPaciente= new ServicoPacienteImpl();
        ExameMedico uBD= pPaciente.pesquisarExame(cra);
       
        
        ServletContext sc = req.getServletContext();
        
        
        if(cra.equals(""))
            {
                try {
                      
                   sc.getRequestDispatcher("/dynamic/jsp/pacientePrincipal.jsp").forward(req, resp);
               }catch(Exception e){
                   System.out.println("Houve um erro aqui: "+e.getMessage());
                
               }
            }
        
        
        if(cra.equals(uBD.getCra())){
            try{
               req.setAttribute("cra",uBD);
       
                sc.getRequestDispatcher("/dynamic/jsp/pacienteExame.jsp").forward(req, resp); 
                
            }catch( Exception e){
                System.out.println("Houve um erro aqui: "+e.getMessage()); 
           }
        }
       else{
            try {
             
                sc.getRequestDispatcher("/dynamic/jsp/pacientePrincipal.jsp").forward(req, resp);
            }catch(Exception e){
                System.out.println("Houve um erro aqui: "+e.getMessage());
          
            }  
    }
}
}