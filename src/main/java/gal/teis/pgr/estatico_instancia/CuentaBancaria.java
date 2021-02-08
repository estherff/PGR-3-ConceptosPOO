/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.pgr.estatico_instancia;

/**
 *
 * @author Esther Ferreiro
 * Clase para la gestión de cuentas bancarrias
 */
public class CuentaBancaria {

    // Atributos o variables miembro
    private String nombre;
    private String nCuenta;
    private double tipoInteres;
    private double saldo;
    private double comision;

    // Variable de clase
    private static int totalCuentas; 
    
    /**
     * Crea una instancia de la clase incrementando a la vez el total de cuentas
     * creadas a partir de esta clase
     **/
    public CuentaBancaria(){//Acceso de constructor a propiedad estática
        totalCuentas++;//incrementa el contador de cuentas creadas
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Para el nivel = 1 permite modidificar el nº de cuenta
     * 
     * @param nCuenta String Número de cuenta
     * @param nivel Byte nivel de acceso
    **/
    public void setNumeroCuenta(String nCuenta, Byte nivel) {
        if (nivel == 1) {
            this.nCuenta = nCuenta;
        }
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
    public void setComision(double comision) {
        this.comision = comision;
    }
    /*No existe setTotalCuentas porque no quiero que ese
    valor se pueda modificar por medio de un método. 
    Solo se modifica en los constructores*/

    public String getNombre() {
        return nombre;
    }

    public String getNCuenta() {
        return nCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getComision() {
        return comision;
    }

    /**
     * Permite conocer el total de cuentas creadas
     * @return int devuelve el total de cuentas creadas
     */
    public static int getTotalCuentas() {//Acceso de método estático a propiedad estática
        return totalCuentas;
    }
    
    
    /**
     * Permite ingresar dinero en la cuenta
     * @param dineroIngresar double cantidad a incrementar el saldo
     * @return boolean indica si se ha podido realizar el ingreso
     * */
    public boolean hacerIngreso(double dineroIngresar) {
        boolean ingresoCorrecto = true;
        if (dineroIngresar < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + dineroIngresar;
        }
        return ingresoCorrecto;
    }

    /**
     * Permite sacar dinero de la cuenta
     * @param dineroReintegro double cantidad a retirar del saldo
     * @return boolean indica si se ha podido realizar el reintegro
     * */
    public boolean hacerReintegro(double dineroReintegro) {
        boolean reintegroCorrecto = true;
        if (dineroReintegro < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= dineroReintegro) {
            saldo -= dineroReintegro;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }
    
    
     /**
     * Calcula el interes de la cuenta en función del saldo
     * @param laCuenta CuentaBancaria objeto en el que se va a calcular el interes
     * */
    public static void calcularInteres(CuentaBancaria laCuenta){//Acceso de método estático a propiedades de instancia de un objeto pasado por parámetro
        if (laCuenta.getSaldo() < 2000){
            laCuenta.comision = 0.03;
        }else if (laCuenta.getSaldo() < 6000){
            laCuenta.comision = 0.02;
        }else{
            laCuenta.comision = 0.01;
        }
    }

}
