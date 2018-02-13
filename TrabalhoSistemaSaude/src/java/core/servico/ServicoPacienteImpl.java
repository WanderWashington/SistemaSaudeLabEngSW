/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.servico;

import api.dao.PacienteDAO;
import api.modelo.ConsultaMedica;
import api.modelo.ExameMedico;
import api.modelo.Paciente;
import api.servico.ServicoPaciente;
import core.dao.PacienteDAOMariaDB;

/**
 *
 * @author Wander
 */
public class ServicoPacienteImpl implements ServicoPaciente{
    @Override
    public ExameMedico pesquisarExame(String cra){
        PacienteDAO uDao = new PacienteDAOMariaDB();
        ExameMedico u = uDao.pesquisarExame(cra);
        return u;
    }    
   
     public ConsultaMedica agendarConsulta(ConsultaMedica consulta) {
        PacienteDAO uDao= new PacienteDAOMariaDB();
        ConsultaMedica u = uDao.agendarConsulta(consulta);
        return u;
    
    
    }
    
    
}
