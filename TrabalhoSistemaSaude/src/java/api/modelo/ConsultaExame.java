/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.modelo;

/**
 *
 * @author Wander
 */
public class ConsultaExame {
     private String id;
    private String cra;
    private String data_retorno;
    private String horario;
    private String exametipo;
    
    public ConsultaExame(){}

    public String getCra() {
        return cra;
    }

    public void setCra(String cra) {
        this.cra = cra;
    }

    public String getData_retorno() {
        return data_retorno;
    }

    public void setData_retorno(String data_retorno) {
        this.data_retorno = data_retorno;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getExametipo() {
        return exametipo;
    }

    public void setExametipo(String exametipo) {
        this.exametipo = exametipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
