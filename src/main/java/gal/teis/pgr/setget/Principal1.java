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
public class Principal1 {

    /**
     * @param args the command line arguments
     * Este código crea las instancias de Coche1 sin utilizar constructor 
     * específico. 
     * Da valor a las propiedades con getter y setter
     */
    public static void main(String[] args) {

        //Crea dos instancias de la clase Coche11
        Coche1 miCoche1 = new Coche1();
        Coche1 miCoche2 = new Coche1();

        //Da valores a las marcas
        miCoche1.setMarca("Ferrari");
        miCoche2.setMarca("Mercedes");
         
        //Arranca los coches
        System.out.println(miCoche1.getMarca() + " " + miCoche1.arrancar());
        System.out.println(miCoche2.getMarca() + " " + miCoche2.arrancar());
        
        //Asignar valocidad máxima
        miCoche1.setVel_max(370);
        System.out.println(miCoche1.getMarca()+" puede alcanzar una velocidad de " + 
                                                miCoche1.getVel_max());
        miCoche2.setVel_max(375);
        System.out.println(miCoche2.getMarca()+"puede alcanzar una velocidad de " + 
                                                miCoche2.getVel_max());
        
        //Inicializa la posición de los coches
        miCoche1.setPosicion((byte)1);
        miCoche2.setPosicion((byte)2);
        
        System.out.println("La posición inicial de salida es "+ 
                "\n " + miCoche1.getMarca() +" --> "+ miCoche1.getPosicion()+
                "\n " + miCoche2.getMarca() + " --> "+ miCoche2.getPosicion());

        
        
        miCoche2.adelantar(miCoche1);
        
         System.out.println("La posición después del adelantamiento es "+ 
                "\n " + miCoche1.getMarca() +" --> "+ miCoche1.getPosicion()+
                "\n " + miCoche2.getMarca() + " --> "+ miCoche2.getPosicion());

    }

}
