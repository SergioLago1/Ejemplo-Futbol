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
public class Futbolista extends Equipo_Futbol{
    private int dorsal;
    private String demarcacion;
    
    public Futbolista(){
   super ();
    }
    public Futbolista (int id, int edade, String nome, String apellido, int dorsal, String demarcacion){
        super(id,edade,nome,apellido);
        this.dorsal= dorsal;
        this.demarcacion= demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    public void xogarPartido(){
    System.out.println("xogan o partido os Futbolistas");
    }
    public void entrenar(){
      System.out.println("Entrenan os Futbolistas");
    }

    @Override
    public String toString() {
        return "Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
}


