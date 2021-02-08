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
 * Hay un método privado y estático para calcular el interes.
 * En la anterior había un método de instancia para el cálculo del interes en
 * el constructor, ahora se lo hemos convertido en estático... y no hay ningún 
 * cambio en su uso dentro de la clase, en el constructor
 */
public class CuentaBancaria11 {

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
    public CuentaBancaria11(){//Acceso de constructor a propiedad estática
        totalCuentas++;//incrementa el contador de cuentas creadas
    }

    /**
     * Crea una instancia de la clase incrementando a la vez el total de cuentas
     * creadas a partir de esta clase
     **/
    public CuentaBancaria11(String nombre, String nCuenta, double saldo){//Acceso de constructor a propiedad estática
        this.nombre = nombre;
        this.nCuenta = nCuenta;
        this.saldo = saldo;
        //Se llama a un método privado y estático para calcular el interes inicial
        this.tipoInteres = calculoDeInteres(this.saldo);
        
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
     * Es un método privado porque solo se usará desde dentro de la clase
     * @param laCuenta CuentaBancaria111 objeto en el que se va a calcular el interes
     * */
    private static double calculoDeInteres(double saldo){
        double aux_comision;
        if (saldo < 2000){
            aux_comision = 0.03;
        }else if (saldo < 6000){
            aux_comision = 0.02;
        }else{
            aux_comision = 0.01;
        }
        return aux_comision;
    }

}
