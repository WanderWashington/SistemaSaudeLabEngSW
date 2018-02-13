/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.servico;

import api.modelo.ConsultaMedica;
import api.modelo.ExameMedico;
import api.modelo.Paciente;


/**
 *
 * @author Wander
 */
public interface ServicoPaciente {
     public ExameMedico pesquisarExame(String cra);
     public ConsultaMedica agendarConsulta(ConsultaMedica consulta);
}
