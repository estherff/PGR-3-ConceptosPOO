/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.pgr.setget;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Crea dos instancias de la clase Coche11
        Coche11 miCoche1 = new Coche11("Ferrari",370,900,(byte)1);
        Coche11 miCoche2 = new Coche11("Mercedes", 375,905,(byte)2);

        
         
        //Arranca los coches
        System.out.println(miCoche1.getMarca() + " " + miCoche1.arrancar());
        System.out.println(miCoche2.getMarca() + " " + miCoche2.arrancar());
        
        //Asignar valocidad máxima
        System.out.println(miCoche1.getMarca()+" puede alcanzar una velocidad de " + 
                                                miCoche1.getVel_max());
        System.out.println(miCoche2.getMarca()+"puede alcanzar una velocidad de " + 
                                                miCoche2.getVel_max());
        
      
        System.out.println("La posición inicial de salida es "+ 
                "\n " + miCoche1.getMarca() +" --> "+ miCoche1.getPosicion()+
                "\n " + miCoche2.getMarca() + " --> "+ miCoche2.getPosicion());

        
        
        miCoche2.adelantar(miCoche1);
        
        System.out.println("La posición después del adelantamiento es "+ 
                "\n " + miCoche1.getMarca() +" --> "+ miCoche1.getPosicion()+
                "\n " + miCoche2.getMarca() + " --> "+ miCoche2.getPosicion());

    }

}
