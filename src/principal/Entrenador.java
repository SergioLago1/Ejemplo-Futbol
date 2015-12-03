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
public class Entrenador extends Equipo_Futbol {
    private String idfederacion;

    public Entrenador(){
    super();
       
}
    public Entrenador(int id, int edade, String nome, String apellido, idfederacion){
        super(id,edade,nome,apellido);
        this.idfederacion=idfederacion;
    }

    public Entrenador(String idfederacion, int id, int edade, String nome, String apellido) {
        super(id, edade, nome, apellido);
        this.idfederacion = idfederacion;
    }

    public String getIdfederacion() {
        return idfederacion;
    }

    public void setIdfederacion(String idfederacion) {
        this.idfederacion = idfederacion;
    }
    public void dirixirPArtido(){
        System.out.println("Entrenar dirixir os partidos");
    }
    public void dirixirEntrenamento(){
        System.out.println("Dirixir os Entrenos");
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idfederacion=" + idfederacion + '}';
    }
}
