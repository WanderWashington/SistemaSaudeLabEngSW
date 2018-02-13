/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dao;

import api.modelo.ConsultaMedica;
import api.modelo.ExameMedico;


/**
 *
 * @author Wander
 */
public interface PacienteDAO {
     public ExameMedico pesquisarExame(String cra);
     public ConsultaMedica agendarConsulta(ConsultaMedica consulta);
}
