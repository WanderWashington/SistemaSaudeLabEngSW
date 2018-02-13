/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dao;
import api.modelo.ConsultaExame;
import api.modelo.ConsultaMedica;
import api.modelo.ExameMedico;
import api.modelo.Usuario;
import api.modelo.Medico;
import api.modelo.Paciente;

/**
 *
 * @author Wander
 */
public interface MedicoDAO {
    
    public ConsultaMedica agendarRetorno(ConsultaMedica exame);
    public ExameMedico pesquisarExame(String login);
    public ConsultaExame agendarExame(ConsultaExame exame);
}
