/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.servico;

import api.dao.UsuarioDAO;


import api.modelo.Usuario;
import api.modelo.Medico;
import api.modelo.Paciente;
import api.servico.ServicoUsuario;

import core.dao.UsuarioDAOMariaDB10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wander
 */
public class ServicoUsuarioImpl implements ServicoUsuario {

    @Override
    public Usuario inserirAdmin(Usuario usuario) {
        UsuarioDAO uDao= new UsuarioDAOMariaDB10();
        Usuario u = uDao.inserirAdmin(usuario);
        return u;
    
    
    }

    @Override
    public Usuario buscarPeloLogin(String login) {
        UsuarioDAO uDao = new UsuarioDAOMariaDB10();
        Usuario u = uDao.buscarPeloLogin(login);
        return u;
    }    
    
    @Override
      public Usuario buscarPeloId(Long id) {
        UsuarioDAO uDao = new UsuarioDAOMariaDB10();
        Usuario u = uDao.buscarPeloId(id);
        return u;
    }    
    
    
    
     @Override
    public Medico inserirMedico(Medico medico) {
        UsuarioDAO uDao= new UsuarioDAOMariaDB10();
        Medico u = uDao.inserirMedico(medico);
        return u;
    
    
    }
    
    @Override
    public Paciente inserirPaciente(Paciente paciente) {
        UsuarioDAO uDao= new UsuarioDAOMariaDB10();
        Paciente u = uDao.inserirPaciente(paciente);
        return u;
    
    }
    @Override
      public Usuario deletar(String rg) {
        UsuarioDAO uDao = new UsuarioDAOMariaDB10();
        Usuario u = uDao.deletar(rg);
        return u;
    }  
      
       @Override
      public Medico deletarMedico(String crm) {
        UsuarioDAO uDao = new UsuarioDAOMariaDB10();
        Medico u = uDao.deletarMedico(crm);
        return u;
    }  
     
}
