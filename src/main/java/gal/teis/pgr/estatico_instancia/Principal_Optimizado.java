/*
 * This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package gal.teis.pgr.estatico_instancia;

import gal.teis.libreriadam.ControlData;
import gal.teis.libreriadam.Menu;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Esther Ferreiro
 */
public class Principal_Optimizado {

    /*Estas variables estáticas son para facilitar el acceso a los elementos 
    definidos desde el método main y los otros métoso de esta clase*/
    
    //para que pueda utilizarse en el método que pinta el menú
    static Scanner sc = new Scanner(System.in);
    //el tope de cuentas que se pueden crear con este programa
    static int topeCuentas = 100;
    //donde se almacenan las cuentas bancarias creadas 
    static ArrayList<CuentaBancaria111> todasLasCuentas = new ArrayList<CuentaBancaria111>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean finalizar = false; //para controlar la salida del programa

        //Para trabajar on los datos de una cuenta
        String nCuenta;
        String titular;
        double saldo;

        //El indice de la Cuenta en el ArrayList
        int indiceCuenta;

        try {
            do {
                switch (pintarMenu()) {

                    case 1://Crear cuenta bancaria con datos
                        if (CuentaBancaria111.getTotalCuentas() < topeCuentas) {
                            System.out.println("\n***************************************************n"
                                    + "SE CREA UNA CUENTA BANCARIA CON DATOS INICIALES\n");

                            //Pedir los datos para la creación de la cuenta
                            System.out.println("Introduce el titular de la cuenta");
                            titular = ControlData.lerString(sc);
                            System.out.println("Introduce el número de cuenta");
                            nCuenta = ControlData.lerString(sc);
                            System.out.println("Introduce el saldo inicial");
                            saldo = ControlData.lerDouble(sc);

                            //Se crea una nueva cuenta
                            CuentaBancaria111 nuevaCuenta = new CuentaBancaria111(titular, nCuenta, saldo);

                            //Se añade la nuevaCuenta al arrayList de todasLasCuentas
                            todasLasCuentas.add(nuevaCuenta);

                            System.out.println("El interés inicial aplicacdo es de "
                                    + nuevaCuenta.getTipoInteres());
                        } else {
                            System.out.println("No se pueden crear más cuentas en esta sucursal. "
                                    + "Consulte con el Dpto. de Administración");
                        }

                        break;

                    case 2://Ingresar en una cuenta bancaria

                        System.out.println("\n***************************************************n"
                                + "SE VA A REALIZAR UN INGRESO EN UNA CUENTA BANCARIA\n");

                        System.out.println("Introduce el número de cuenta donde se va a realizar el ingreso");
                        nCuenta = ControlData.lerString(sc);

                        //Buscar la cuenta en el ArrayList, si devuelve un -1 es que no existe
                        //Si existe devuelve el índice de la misma en el ArrayList
                        indiceCuenta = buscarCuenta(nCuenta);

                        //Si se ha encontrado la cuenta se solicita el dinero a ingresar
                        if (indiceCuenta >= 0) {
                            realizarIngreso(indiceCuenta);
                        } else {//No se ha encontrado la cuenta que se solicitó
                            System.out.println("Ese número de cuenta no existe");
                        }

                        break;

                    case 3://Retirar dinero de una cuenta bancaria
                        System.out.println("\n***************************************************n"
                                + "SE VA A REALIZAR UN REINTEGRO EN UNA CUENTA BANCARIA\n");

                        System.out.println("Introduce el número de cuenta donde se va a realizar el reintegro");
                        nCuenta = ControlData.lerString(sc);

                        //Buscar la cuenta en el ArrayList, si devuelve un -1 es que no existe
                        //Si existe devuelve el índice de la misma en el ArrayList
                        indiceCuenta = buscarCuenta(nCuenta);

                        //Si se ha encontrado la cuenta se solicita el dinero a retirar
                        if (indiceCuenta >= 0) {
                            realizarReintegro(indiceCuenta);
                        } else {//No se ha encontrado la cuenta que se solicitó
                            System.out.println("Ese número de cuenta no existe");
                        }

                        break;

                    case 4://Recalcular el interés aplicado en una cuenta bancaria
                        System.out.println("\n***************************************************n"
                                + "SE VA A RECALCULAR EL INTERÉS APLICADO EN UNA CUENTA BANCARIA\n");

                        System.out.println("Introduce el número de cuenta a operar");
                        nCuenta = ControlData.lerString(sc);

                        //Buscar la cuenta en el ArrayList, si devuelve un -1 es que no existe
                        //Si existe devuelve el índice de la misma en el ArrayList
                        indiceCuenta = buscarCuenta(nCuenta);

                        //Si se ha encontrado la cuenta se recalcula el interes
                        if (indiceCuenta >= 0) {

                            //Cálculo del interes de una cuenta bancaria
                            //Método estático que modifica al propiedad privada
                            //tipoInteres del objeto que se pasa por parámetro
                            CuentaBancaria111.calcularInteres(todasLasCuentas.get(indiceCuenta));

                            System.out.println("El interés que se aplicará a "
                                    + "la cuenta en la situació actual es de "
                                    + todasLasCuentas.get(indiceCuenta).getTipoInteres());

                        } else {//No se ha encontrado la cuenta que se solicitó
                            System.out.println("Ese número de cuenta no existe");
                        }

                        break;

                    case 5://Ver información de una cuenta bancaria
                        System.out.println("\n************************************\n"
                                + "INFORMACIÓN DE UNA CUENTA BANCARIA\n");

                        System.out.println("Introduce el número de cuenta a operar");
                        nCuenta = ControlData.lerString(sc);

                        //Buscar la cuenta en el ArrayList, si devuelve un -1 es que no existe
                        //Si existe devuelve el índice de la misma en el ArrayList
                        indiceCuenta = buscarCuenta(nCuenta);

                        //Si se ha encontrado la cuenta muestra su información
                        if (indiceCuenta >= 0) {
                            System.out.println("La información de la cuenta es "
                                    + todasLasCuentas.get(indiceCuenta).cuentaComoString());

                        } else {//No se ha encontrado la cuenta que se solicitó
                            System.out.println("Ese número de cuenta no existe");
                        }

                        break;

                    case 6://Ver información de todas las cuentas bancarias
                        System.out.println("\n********************************************\n"
                                + "INFORMACIÓN DE TODAS LAS CUENTAS BANCARIAS\n");
                        
                        //Recorre todo el ArrayList y muestra la información de todas las cuentas
                        recorrerTodasLasCuentas();
                        break;

                    case 7:

                        finalizar = true;
                }
            } while (!finalizar);
        } catch (Exception e) {
            System.out.println("Se ha producido un problema " + e.getMessage());
        } finally {
            sc.close();
        }

    }

    /**
     * Dibuja un menú en la consola a partir con unas opciones determinadas
     */
    static byte pintarMenu() {
        byte opcion;
        boolean correcta;
        System.out.println("\n\n************************************************");
        /* Solo sale del While cuando se selecciona una opción correcta en rango y tipo*/
        do {
            ArrayList<String> misOpciones = new ArrayList<String>() {
                {
                    add("Crear una cuenta bancaria con datos iniciales");
                    add("Ingresar en una cuenta bancaria");
                    add("Retirar dinero en una cuenta bancaria");
                    add("Recalcular el interés aplicado en una cuenta bancaria");
                    add("Ver información de una cuenta bancaria");
                    add("Ver información de todas las cuentas bancarias");
                    add("Finalizar");
                }
            };

            /*La clase Menu permite imprimir el menú a partir de los datos de un ArrayList<String>
            y utilizar métodos para control de rango*/
            Menu miMenu = new Menu(misOpciones);
            miMenu.printMenu();

            /*La clase ControlData permite hacer un control de tipo leído*/
            opcion = ControlData.lerByte(sc);
            correcta = miMenu.rango(opcion);

        } while (!correcta);

        return opcion;
    }

    /**
     * Busca una cuenta en el ArrayList por número de cuenta en el caso
     *
     * @param numCuenta String número de cuenta a localizar en el
     * @return int devuelve la posición de la cuenta en el ArrayList, en el caso
     * de que la cuenta no exista devuelve -1
     */
    static int buscarCuenta(String numCuenta) {
        //Buscar el número de cuenta en el arraylist donde se almacenan
        boolean encontrado = false;
        int iCuenta = 0;
        do {

            CuentaBancaria111 unaCuenta = todasLasCuentas.get(iCuenta);
            if (unaCuenta.getNCuenta().equals(numCuenta)) {
                encontrado = true; // Terminar ciclo, pues ya lo encontramos
            } else {
                iCuenta++;
            }
        } while (!encontrado && iCuenta < todasLasCuentas.size());
        if (!encontrado) {
            iCuenta = -1;
        }

        return iCuenta;
    }

    /**
     * Realiza un ingreso en una cuenta del ArrayList
     *
     * @param indiceCuenta int Índice de la cuenta en el que va a hacer el
     * ingreso
     */
    static void realizarIngreso(int indiceCuenta) {
        boolean ingresoCorrecto = false;
        do {
            System.out.println("Introduce la cantidad de dinero a ingresar");
            double aIngresar = ControlData.lerDouble(sc);
            boolean realizado = todasLasCuentas.get(indiceCuenta).hacerIngreso(aIngresar);
            //Si el ingreso se ha realizado con éxito
            if (realizado) {
                System.out.println("El ingreso se ha realizado con éxito. "
                        + "El saldo actual de la cuenta es "
                        + todasLasCuentas.get(indiceCuenta).getSaldo());
                ingresoCorrecto = true;
            } else {//Si se ha introducido una cantidad negativa el ingreso no se realiza
                System.out.println("No es un ingreso correcto, vuelva a realizar la operación");
            }
        } while (!ingresoCorrecto);
    }

    /**
     * Realiza un reintegro en una cuenta del ArrayList
     *
     * @param indiceCuenta int Índice de la cuenta en el que va a hacer el
     * reintegro
     */
    static void realizarReintegro(int indiceCuenta) {
        boolean reintegroCorrecto = false;
        do {
            System.out.println("Introduce la cantidad de dinero a retirar");
            double aRetirar = ControlData.lerDouble(sc);
            boolean realizado = todasLasCuentas.get(indiceCuenta).hacerReintegro(aRetirar);
            //Si el ingreso se ha realizado con éxito
            if (realizado) {
                System.out.println("El reintegro se ha realizado con éxito. "
                        + "El saldo actual de la cuenta es "
                        + todasLasCuentas.get(indiceCuenta).getSaldo());
                reintegroCorrecto = true;
            } else {//Si se ha introducido una cantidad negativa el ingreso no se realiza
                System.out.println("No es un reintegro correcto, no hay suficiente saldo");
            }
        } while (!reintegroCorrecto);
    }

    /**
     * Recorre todo el ArrayList de cuentas y ejecuta sobre cada una de ellas 
     * el método que permite visualizar los datos relevantes de las cuentas
     */
    static void recorrerTodasLasCuentas() {
        //Recorrido de un ArrayList
        for (CuentaBancaria111 unaCuenta : todasLasCuentas) {
            System.out.println(unaCuenta.cuentaComoString());
        }

    }
}
