/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.ConsultaMedica;
import api.modelo.Medico;
import api.modelo.Paciente;
import api.modelo.Usuario;
import api.servico.ServicoMedico;
import api.servico.ServicoPaciente;
import api.servico.ServicoUsuario;
import core.servico.ServicoMedicoImpl;
import core.servico.ServicoPacienteImpl;
import core.servico.ServicoUsuarioImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Wander
 */
public class AgendaConsulta extends HttpServlet {

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
        
            String cra = request.getParameter("cra");
            String data_retorno = request.getParameter("dia");
            data_retorno+=request.getParameter("mes");
            data_retorno+=request.getParameter("ano");
            String horario=request.getParameter("hora");
            horario+=request.getParameter("minutos");
            String especialidade=request.getParameter("especialidade");
                    
            
        
        ConsultaMedica temp = new ConsultaMedica();
        
        temp.setCra(cra);temp.setData_retorno(data_retorno);temp.setHorario(horario);
        temp.setEspecialista(especialidade);

        
        ServicoPaciente sPaciente = new ServicoPacienteImpl();
        ConsultaMedica uBD = sPaciente.agendarConsulta(temp);
            
        ServletContext sc = request.getServletContext();
        
        
      if(cra.equals("") || data_retorno.equals("") || horario.equals("") || especialidade.equals(""))
      {
        {
           try{
               request.setAttribute("burlando","sim");
               sc.getRequestDispatcher("/dynamic/jsp/pacientePrincipal.jsp").forward(request, response); 
            }catch( Exception e){
               System.out.print("erro"+e.getMessage());
            }             
        }
      }
     else{            
            try{
              request.setAttribute("medicoLogado",uBD);
             sc.getRequestDispatcher("/dynamic/jsp/pacientePrincipal.jsp").forward(request, response); 
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
