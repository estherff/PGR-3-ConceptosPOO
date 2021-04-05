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
public class Principal {

    public static void main(String[] args) {
        //Muestra el área de distintas figuras y muestra el promedio de los valores
        FiguraGeometrica[] figuras = new FiguraGeometrica[]{new Triangulo(3, 3), new Rectangulo(2, 4), new Circulo(6 / Math.sqrt(Math.PI))};
        System.out.println(FiguraGeometricaUtils.areaPromedio(figuras));

        //Muestra el área de distintas figuras y muestra el promedio de los valores
        FiguraGeometrica[] figuras2 = new FiguraGeometrica[]{new Triangulo(2, 5), new Rectangulo(5, 6), new Circulo(3 / Math.sqrt(Math.PI))};
        System.out.println(FiguraGeometricaUtils.areaPromedio(figuras2));

    }

}
