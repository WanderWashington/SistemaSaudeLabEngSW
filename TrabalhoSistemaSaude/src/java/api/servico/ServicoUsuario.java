/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.servico;

import api.modelo.Usuario;
import api.modelo.Medico;
import api.modelo.Paciente;

/**
 *
 * @author Wander
 */
public interface ServicoUsuario {
    public Usuario inserirAdmin(Usuario usuario);
    public Usuario buscarPeloLogin(String login);
    public Medico inserirMedico(Medico medico);
    public Paciente inserirPaciente(Paciente paciente);
     public Usuario buscarPeloId(Long id);
      public Usuario deletar(String rg);
       public Medico deletarMedico(String crm);
}
