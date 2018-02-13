/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.Medico;
import api.modelo.Paciente;
import api.modelo.Usuario;
import api.servico.ServicoUsuario;
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
public class CadastroPaciente extends HttpServlet {

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
        String data_nasc=request.getParameter("dia");
        data_nasc+=request.getParameter("mes");
        data_nasc+=request.getParameter("ano");
        String rg=request.getParameter("rg");
        String cpf=request.getParameter("cpf");
        cpf+=request.getParameter("cpf2");
        String cra= request.getParameter("cra");
        String rua= request.getParameter("rua");;
        String bairro= request.getParameter("bairro");;
        String cidade= request.getParameter("cidade");;
        String estado= request.getParameter("estado");;
        String cep= request.getParameter("cep");;
        cep+=request.getParameter("cep2");
        String num_casa= request.getParameter("numero");;
        
        Paciente temp = new Paciente();
        
        temp.setNome(nome);temp.setSobrenome(sobrenome);temp.setData_nasc(data_nasc);temp.setRg(rg);
        temp.setCpf(cpf);temp.setCra(cra);temp.setRua(rua);temp.setBairro(bairro);temp.setCidade(cidade);
        temp.setEstado(estado);temp.setCep(cep);temp.setNumero_casa(num_casa);
        
        ServicoUsuario sUsuario = new ServicoUsuarioImpl();
        Paciente uBD = sUsuario.inserirPaciente(temp);
            
        ServletContext sc = request.getServletContext();
        
          if(nome.equals("") || sobrenome.equals("") || data_nasc.equals("") || rg.equals("") ||
                cpf.equals("") || cra.equals("") || rua.equals("") || bairro.equals("") || cidade.equals("") 
                  || estado.equals("") || cep.equals("") || num_casa.equals(""))
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
