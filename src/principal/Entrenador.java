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

    public Entrenador();{
    super();
       
}
    public Entrenador(int id, int edade, String nome, String apellido, idfederacion){
        super(id,edade,nome,apellido);
        this.idfederacion=idfederacion;
    }
}
