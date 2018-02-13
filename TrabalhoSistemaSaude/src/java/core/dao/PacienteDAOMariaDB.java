/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;
import api.dao.PacienteDAO;
import api.dao.UsuarioDAO;
import api.modelo.ConsultaMedica;
import api.modelo.ExameMedico;
import api.modelo.Paciente;
import api.modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import core.dao.Conexao;


/**
 *
 * @author Wander
 */
public class PacienteDAOMariaDB implements PacienteDAO{
    
       
   private final String URL = "jdbc:mysql://localhost/fatec",  
         NOME = "root", SENHA = "01101996";  
   private Connection conexao;  
   private Statement comando;
      
    
    public PacienteDAOMariaDB(){
        try
        {
                conectar();
        }catch(Exception e)
            {
                imprimeErro("Erro na conexão", e.getMessage());
            }
}
    
    
    @Override
    public ExameMedico pesquisarExame(String login){
        ExameMedico u = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from exameurina where cra = ?");  
            comandoSQLp.setString(1, login);
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectado...");
            rs.next();
             u = new ExameMedico();
             u.setExameID(rs.getInt(1));
             u.setCra(rs.getString(2));
             u.setCor(rs.getString(3));
             u.setAspecto(rs.getString(4));
             u.setDensidade(rs.getString(5));
             u.setPh(rs.getString(6));
             u.setGlicose(rs.getString(7));
             u.setProteinas(rs.getString(8));
             u.setBilirrubina(rs.getString(9));
             u.setUrobilinogenio(rs.getString(10));
             u.setLeucocitos(rs.getString(11));
             u.setHemoglobina(rs.getString(12));
             u.setNitrito(rs.getString(13));
             u.setCelulasep(rs.getString(14));
             u.setMleucocitos(rs.getString(15));
             u.setHemacias(rs.getString(16));
             u.setMuco(rs.getString(17));
             u.setBacterias(rs.getString(18));
             u.setCristais(rs.getString(19));
             u.setCilindros(rs.getString(20));
             
            comandoSQLp.close();
            rs.close();
             fechar();
            
            return u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...metodo findbynome");
        }
        return u;
    }
    
    
    @Override
    public ConsultaMedica agendarConsulta(ConsultaMedica consulta)
        {
              ConsultaMedica u = null;
        try{        
            
   
             PreparedStatement comandoSQLp = conexao.prepareStatement("Insert into consultaMedica(cra,data_retorno,horario,especialista) values(?,?,?,?)");  
            comandoSQLp.setString(1,consulta.getCra());
            comandoSQLp.setString(2,consulta.getData_retorno());
            comandoSQLp.setString(3,consulta.getHorario());
            comandoSQLp.setString(4,consulta.getEspecialista());
           
    
            comandoSQLp.execute();
            System.out.println("Conectado...");
            
            comandoSQLp.close();
            fechar();
            return u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...metodo Insert:"+e.getMessage());
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
