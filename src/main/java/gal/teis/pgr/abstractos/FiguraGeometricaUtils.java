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
public class FiguraGeometricaUtils {

    public static double areaPromedio(FiguraGeometrica[] arr) {
        double areaTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            areaTotal += arr[i].area();
        }
        return areaTotal / arr.length;
    }
}
