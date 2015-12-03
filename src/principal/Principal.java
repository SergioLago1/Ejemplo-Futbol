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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo_Futbol equipo1= new Equipo_Futbol(1,20,"equiA","equiA");
        Futbolista nolito= new Futbolista(2,29,"nolito","nolito",10,"dianteiro");
        Entrenador berizzo= new Entrenador(3,40,"Toto","Berizzo","Primeira");
        Maxasista Eva= new Maxasista ("Maxasista",15,4,25,"eva","eva");
    }

    
}
