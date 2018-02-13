/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dao;

import api.modelo.Usuario;
import api.modelo.Medico;
import api.modelo.Paciente;


/**
 *
 * @author Wander
 */
public interface UsuarioDAO {
    public Usuario inserirAdmin(Usuario usuario);
    public Medico inserirMedico(Medico medico);
    public Paciente inserirPaciente(Paciente paciente);
    public Usuario buscarPeloId(Long id);
    public Usuario buscarPeloLogin(String login);
    public Usuario deletar(String rg);
     public Medico deletarMedico(String crm);
     public Usuario atualizarNivel(String nivel,String usuario);
}
