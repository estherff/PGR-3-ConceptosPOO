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
public class Coche {
    // atributos:
    private String marca;
    private double vel_max;
    private int potencia;
    private byte posicion;

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
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setVel_max(double vel_max) {
        this.vel_max = vel_max;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }  
    public void setPosicion(byte posicion) {
        this.posicion = posicion;
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
