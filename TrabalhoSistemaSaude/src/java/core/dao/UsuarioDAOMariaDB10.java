/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;

import api.dao.UsuarioDAO;
import api.modelo.Usuario;
import api.modelo.Medico;
import api.modelo.Paciente;
import api.servico.ServicoUsuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import core.dao.Conexao;
import core.servico.ServicoUsuarioImpl;

/**
 *
 * @author Wander
 */
public class UsuarioDAOMariaDB10 implements UsuarioDAO{

    
   private final String URL = "jdbc:mysql://localhost/fatec",  
         NOME = "root", SENHA = "01101996";  
   private Connection conexao;  
   private Statement comando;
      
    
    public UsuarioDAOMariaDB10(){
        try
        {
                conectar();
        }catch(Exception e)
            {
                imprimeErro("Erro na conexão", e.getMessage());
            }
}
    
    
    
    @Override
    public Usuario inserirAdmin(Usuario usuario) {
          Usuario u = null;
        try{        
            
   
             PreparedStatement comandoSQLp = conexao.prepareStatement("Insert into usuario (nome,sobrenome,rg,cpf,usuario,senha,nivel) values(?,?,?,?,?,?,?)");  
            comandoSQLp.setString(1, usuario.getNome());
            comandoSQLp.setString(2, usuario.getSobrenome());
            comandoSQLp.setString(3, usuario.getRg());
            comandoSQLp.setString(4, usuario.getCpf());
            comandoSQLp.setString(5, usuario.getLogin());
            comandoSQLp.setString(6, usuario.getSenha());
            comandoSQLp.setInt(7, usuario.getNivel());
           
        
            
            comandoSQLp.execute();
            
            System.out.println("Dados inseridos com sucesso...");
            
            comandoSQLp.close();
              fechar();
            return u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...metodo inserirAdmin:"+e.getMessage());
        }
        return u;
         }

    
    @Override
    public Medico inserirMedico(Medico medico)
        {
             Medico u = null;
        try{        
            
   
             PreparedStatement comandoSQLp = conexao.prepareStatement("Insert into medico(nome,sobrenome,data_nasc,rg,cpf,crm,especialidade) values(?,?,?,?,?,?,?)");  
            comandoSQLp.setString(1, medico.getNome());
            comandoSQLp.setString(2, medico.getSobrenome());
            comandoSQLp.setString(3, medico.getData_nasc());
            comandoSQLp.setString(4, medico.getRg());
            comandoSQLp.setString(5, medico.getCpf());
            comandoSQLp.setString(6, medico.getCrm());
            comandoSQLp.setString(7, medico.getEspecialidade());
     
            
            comandoSQLp.execute();
            
            System.out.println("Dados inseridos com sucesso...");
            
         
            comandoSQLp.close();
              fechar();
            return u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...metodo inserirMedico:"+e.getMessage());
        }
        return u;
  
        }
    
    @Override
    public Paciente inserirPaciente(Paciente paciente)
        {
              Paciente u = null;
        try{        
            
   
             PreparedStatement comandoSQLp = conexao.prepareStatement("Insert into paciente(nome,sobrenome,rg,cpf,cra,rua,bairro,estado,cidade,cep,numero_casa,data_nasc) values(?,?,?,?,?,?,?,?,?,?,?,?)");  
            comandoSQLp.setString(1, paciente.getNome());
            comandoSQLp.setString(2,paciente.getSobrenome());
            comandoSQLp.setString(3,paciente.getRg());
            comandoSQLp.setString(4,paciente.getCpf());
            comandoSQLp.setString(5,paciente.getCra());
            comandoSQLp.setString(6,paciente.getRua());
            comandoSQLp.setString(7,paciente.getBairro());
            comandoSQLp.setString(8,paciente.getEstado());
            comandoSQLp.setString(9,paciente.getCidade());
            comandoSQLp.setString(10,paciente.getCep());
            comandoSQLp.setString(11,paciente.getNumero_casa());
            comandoSQLp.setString(12,paciente.getData_nasc());
           
            
           comandoSQLp.execute();
            System.out.println("Dados inseridos com sucesso...");
            
            comandoSQLp.close();
            fechar();
            return u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...metodo inserirPaciente:"+e.getMessage());
        }
        return u;
        }
    
    @Override
    public Usuario buscarPeloId(Long id) {
        Usuario u = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from usuario where id_usuario = ?");  
            comandoSQLp.setString(1, id.toString());
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Busca feita com sucesso..");
            rs.next();
            u = new Usuario();
      //      u.setId(rs.getLong(1));
            u.setLogin(rs.getString(2));
            u.setSenha(rs.getString(3));  
        
            
            comandoSQLp.close();
            rs.close();
            fechar();

            return u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...buscarPeloId ");
          u.setLogin("");
          u.setSenha("");
        }
        return u;
    }

    @Override
    public Usuario buscarPeloLogin(String login){
        Usuario u = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from usuario where usuario = ?");  
            comandoSQLp.setString(1, login);
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Busca realizada com sucesso...");
            rs.next();
            u = new Usuario();

            u.setId(rs.getInt(1));
            u.setNome(rs.getString(2));
            u.setSobrenome(rs.getString(3));
            u.setRg(rs.getString(4));
            u.setCpf(rs.getString(5));
            u.setLogin(rs.getString(6));
            u.setSenha(rs.getString(7));    
            u.setNivel(rs.getInt(8));
       
         
            comandoSQLp.close();
            rs.close();
            fechar();

            return u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...metodo buscarPeloLogin");
        }
        return u;
    }

    public Usuario deletar(String rg)
        {
            Usuario u = null;
          
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from usuario where rg = ?");  
            comandoSQLp.setString(1, rg);
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Consulta feita com sucesso...");
            rs.next();
            u = new Usuario();
            u.setId(rs.getInt(1));
            u.setNome(rs.getString(2));
            u.setSobrenome(rs.getString(3));
            u.setRg(rs.getString(4));
            u.setCpf(rs.getString(5));
            u.setLogin(rs.getString(6));
            u.setSenha(rs.getString(7));    
            u.setNivel(rs.getInt(8));
            
          if(rg.equals(u.getRg()))
            {
                try
                    {
                         PreparedStatement comandoSQLDelete = conexao.prepareStatement("delete from usuario where rg = ?");  
                         comandoSQLDelete.setString(1, rg);
                         comandoSQLDelete.execute();
                         System.out.println("Excluido com sucesso!");
                         comandoSQLDelete.close();
                         comandoSQLp.close();
                         rs.close();
                     }
                catch (Exception e)
                     {
                          System.out.print("\nErro de conexão...metodo deletar");
                           }
            }
          
          else {
               comandoSQLp.close();
               rs.close();
              return u;
          }
        
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...metodo deletar");
        }
     return u;

}
    
    
    public Medico deletarMedico(String crm)
        {
            Medico u = null;
          
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from medico where crm = ?");  
            comandoSQLp.setString(1, crm);
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Consulta feita com sucesso...");
            rs.next();
            u = new Medico();
            u.setId(rs.getInt(1));
            u.setNome(rs.getString(2));
            u.setSobrenome(rs.getString(3));
            u.setRg(rs.getString(4));
            u.setCpf(rs.getString(5));
            u.setEspecialidade(rs.getString(6));
            u.setCrm(rs.getString(7));
            u.setData_nasc(rs.getString(8));

            
          if(crm.equals(u.getCrm()))
            {
                try
                    {
                         PreparedStatement comandoSQLDelete = conexao.prepareStatement("delete from medico where crm = ?");  
                         comandoSQLDelete.setString(1, crm);
                         comandoSQLDelete.execute();
                         System.out.println("Excluido com sucesso!");
                         comandoSQLDelete.close();
                         comandoSQLp.close();
                          rs.close();
                     }
                catch (Exception e)
                     {
                          System.out.print("\nErro de conexão...metodo deletarMedico");
                           }
            }
          
          else {
               comandoSQLp.close();
               rs.close();
              return u;
          }
        
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...metodo deletarMedico");
        }
     return u;

}
    
    
      public Usuario atualizarNivel(String nivel, String usuario)
        {
            Usuario u = null;
            Integer nivelInt;
            nivelInt= Integer.parseInt(nivel);
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("update usuario set nivel = ? where usuario= ?");  
            comandoSQLp.setString(1, nivel);
            comandoSQLp.setString(2, usuario);
            comandoSQLp.execute();
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Atualizado ...");
            rs.next();
            u = new Usuario();
            u.setId(rs.getInt(1));
            u.setNome(rs.getString(2));
            u.setSobrenome(rs.getString(3));
            u.setRg(rs.getString(4));
            u.setCpf(rs.getString(5));
            u.setLogin(rs.getString(6));
            u.setSenha(rs.getString(7));    
            u.setNivel(rs.getInt(8));
            
            
            comandoSQLp.close();
            rs.close();
       
        }  catch (Exception e)
              {
                     System.out.print("\nErro de conexão...metodo atualizarNivel");
         }

     return u;

}
    
    
    
    
    
    
    
     private void conectar() {  
       try {  
         conexao = Conexao.conexao(URL, NOME, SENHA, Conexao.MYSQL);  
         comando = conexao.createStatement();  
         System.out.println("Conectado!");  
      } catch (ClassNotFoundException e) {  
         imprimeErro("Erro ao carregar o driver", e.getMessage());  
      } catch (SQLException e) {  
         imprimeErro("Erro ao conectar", e.getMessage());  
      } 
   }  
  
   private void fechar() {  
      try {  
         comando.close();  
         conexao.close();  
         System.out.println("Conexão Fechada");  
      } catch (SQLException e) {  
         imprimeErro("Erro ao fechar conexão", e.getMessage());  
      }  
   }  
  
   private void imprimeErro(String msg, String msgErro) {  
      JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);  
      System.err.println(msg);  
      System.out.println(msgErro);  
      System.exit(0);  
   }  

 
}  
    
    
    
    
    

