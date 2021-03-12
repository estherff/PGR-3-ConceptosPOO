/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.composicion;

import java.util.ArrayList;

/**
 *
 * @author Esther Ferreiro
 */
public class Modulo {
    private String nombre;
    private String descripcion;
    private byte horas;
    
    private Docente docente;
    private ArrayList<Alumno> alumnado;

    public Modulo(String nombre, byte horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    public Modulo(String nombre, byte horas, Docente docente) {
        this.nombre = nombre;
        this.horas = horas;
        this.docente = docente;
    }

    public Modulo(String nombre, byte horas, ArrayList<Alumno> alumnado) {
        this.nombre = nombre;
        this.horas = horas;
        this.alumnado = alumnado;
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public byte getHoras() {
        return horas;
    }

    public Docente getDocente() {
        return docente;
    }

    public ArrayList<Alumno> getAlumnado() {
        return alumnado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setHoras(byte horas) {
        this.horas = horas;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void setAlumnado(ArrayList<Alumno> alumnado) {
        this.alumnado = alumnado;
    }
    
    
    
}
