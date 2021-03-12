/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.composicion;

import java.time.LocalDate;

/**
 *
 * @author Esther Ferreiro
 */
public class Docente {
     private String nombre;
    //LocalDate representa fechas sin la hora y facilita el manejo para sumar, restar fechas y compararlas.
    //https://www.campusmvp.es/recursos/post/como-manejar-correctamente-fechas-en-java-el-paquete-java-time.aspx
    private LocalDate fecha_nac;
    private String direcion;
    private String localidad;
    private String provincia;

}
