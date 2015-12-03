/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author slagogonzalez
 */
public class Maxasista extends Equipo_Futbol {
private String anosExperienza;    

public Maxasista(){

super();
}    
    
    
   public Maxasista(int id, int edade, String nome, String apellido, String anosExperienza) {
        super(id, edade, nome, apellido);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        
    }

    public String getAnosExperienza() {
        return anosExperienza;
    }

    public void setAnosExperienza(String anosExperienza) {
        this.anosExperienza = anosExperienza;
    }
    
      
    public void masaxes() {
         System.out.println("= Maxasista da masaxes");
      }

    @Override
    public String toString() {
        return "Maxasista{" + "anosExperienza=" + anosExperienza + '}';
    }
}

