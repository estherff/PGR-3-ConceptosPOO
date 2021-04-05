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
public class Triangulo extends FiguraGeometrica{

    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }

   
}
