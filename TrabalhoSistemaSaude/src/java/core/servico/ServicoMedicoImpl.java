/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.servico;

import api.dao.MedicoDAO;
import api.dao.PacienteDAO;
import api.modelo.ConsultaExame;
import api.modelo.ConsultaMedica;
import api.modelo.ExameMedico;
import api.modelo.Paciente;
import api.servico.ServicoMedico;
import core.dao.MedicoDAOMariaDB;
import core.dao.PacienteDAOMariaDB;

/**
 *
 * @author Wander
 */
public class ServicoMedicoImpl implements ServicoMedico{
     @Override
    public ConsultaMedica agendarRetorno(ConsultaMedica exame) {
        MedicoDAO uDao= new MedicoDAOMariaDB();
        ConsultaMedica u = uDao.agendarRetorno(exame);
        return u;
    
    
    }
    
       public ExameMedico pesquisarExame(String cra){
        MedicoDAO uDao = new MedicoDAOMariaDB();
        ExameMedico u = uDao.pesquisarExame(cra);
        return u;
    }    
   
       
     public ConsultaExame agendarExame(ConsultaExame exame) {
        MedicoDAO uDao= new MedicoDAOMariaDB();
        ConsultaExame u = uDao.agendarExame(exame);
        return u;
    }
       
    
}
