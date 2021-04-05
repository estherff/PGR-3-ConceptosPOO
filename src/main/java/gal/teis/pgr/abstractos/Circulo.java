/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.pgr.abstractos;

/**
 *
 * @author Esther Ferreiro
 */
public class Circulo extends FiguraGeometrica {

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

  
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

   
}
