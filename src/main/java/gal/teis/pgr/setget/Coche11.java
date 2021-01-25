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
public class Coche11 {
    // atributos:
    private String marca;
    private double vel_max;
    private int potencia;
    private byte posicion;

    public Coche11(String marca, double vel_max, int potencia, byte posicion) {
        this.marca = marca;
        this.vel_max = vel_max;
        this.potencia = potencia;
        this.posicion = posicion;
    }
    
    

    //Métodos get que permiten la consulta 
    //del valor de los atributos
    public String getMarca() {
        return marca;
    }
    public double getVel_max() {
        return vel_max;
    }
    public int getPotencia() {
        return potencia;
    }
    public byte getPosicion() {
        return posicion;
    }

    //Métodos set que permiten la modificación 
    //del valor de los atributos
    
    private void setPosicion(byte posicion) {
        this.posicion = posicion;
    }  

    public void adelantar (Coche11 cocheAdelantado){
        byte auxPosicion=posicion;
        posicion=cocheAdelantado.getPosicion();
        cocheAdelantado.setPosicion(auxPosicion);
    }
    
        
    // métodos:
    String arrancar() {
        // instrucciones para arrancar el coche     
        return "Esta arrancando";
    }
    String frenar() {
        // instrucciones para frenar el coche
         return "Esta frenando";
    }
    String acelerar() {
        // instrucciones para acelerar el coche
         return "Esta acelerando";
    }
    String girar_derecha(short grados) {
        // instr. para girar a la derecha
         return "Esta girando a la derecha";
    }
}
