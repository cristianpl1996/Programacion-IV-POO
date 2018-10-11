/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.io.IOException;

/**
 *
 * @author Cristian Patiño
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       // TODO code application logic here
       CuentaBancaria cuenta = new CuentaBancaria();
       cuenta.ingresar();
       cuenta.actualizarSaldo();
       cuenta.retirar();
       cuenta.mostrar(); 
    }
    
}
