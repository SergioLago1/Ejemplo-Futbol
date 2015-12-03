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
public class Equipo_Futbol {
    private int id,edade;//*solo visible na clase
    protected String nome,apellido;//visible tamen nas subclases

    public Equipo_Futbol(int id, int edade, String nome, String apellido) {
        this.id = id;
        this.edade = edade;
        this.nome = nome;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }
  public void concentrarse(){
      System.out.println("Concentrase o Equipo de Futbol");
  }
  public void viaxar(){
      System.out.println("Viaxa o Equipo de Futbol");
  }
  
}
