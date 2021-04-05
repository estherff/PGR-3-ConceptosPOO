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
public abstract class FiguraGeometrica {
    
    //Método abstracto que será implementado en las clases hijas
    //En el método abstracto solo se indica su firma
    public abstract double area();
   

    @Override
    public String toString(){
        return String.valueOf(this.area());
    }
}
