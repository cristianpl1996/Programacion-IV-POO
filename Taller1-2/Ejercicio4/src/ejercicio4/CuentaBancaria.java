/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Cristian Patiño
 */
public class CuentaBancaria {
    
    private long Numero_de_cuenta;
    private long Dni_cliente;
    private long Saldo;
    private long Interes;
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public CuentaBancaria() {
        Numero_de_cuenta = 0;
        Dni_cliente = 0;
        Saldo = 0;
        Interes = 0;
    }

    public CuentaBancaria(long Numero_de_cuenta, long Dni_cliente, long Saldo, long Interes) {
        this.Numero_de_cuenta = Numero_de_cuenta;
        this.Dni_cliente = Dni_cliente;
        this.Saldo = Saldo;
        this.Interes = Interes;
    }

    public long getNumero_de_cuenta() {
        return Numero_de_cuenta;
    }

    public long getDni_cliente() {
        return Dni_cliente;
    }

    public void setDni_cliente(long Dni_cliente) {
        this.Dni_cliente = Dni_cliente;
    }

    public long getSaldo() {
        return Saldo;
    }

    public void setSaldo(long Saldo) {
        this.Saldo = Saldo;
    }

    public long getInteres() {
        return Interes;
    }

    public void setInteres(long Interes) {
        this.Interes = Interes;
    }
    
    public void actualizarSaldo() throws IOException{
        System.out.println("Digite Saldo a actualizar: ");
        String sal = reader.readLine();
        long saldo = Long.parseLong(sal);
        this.Saldo = saldo;
        this.Interes = saldo/365;
    }
    
    public void ingresar() throws IOException{
        System.out.println("Ingrese Numero de Cuenta: ");
        String numcue = reader.readLine();
        long numero_de_cuenta = Long.parseLong(numcue);
        this.Numero_de_cuenta = numero_de_cuenta;
        System.out.println("Ingrese DNI del Cliente: ");
        String dni = reader.readLine();
        long dni_del_cliente = Long.parseLong(dni);
        this.Dni_cliente = dni_del_cliente;
        System.out.println("Digite Saldo a Ingresar: ");
        System.out.println("Digite Saldo a Ingresar: ");
        String sal = reader.readLine();
        long saldo = Long.parseLong(sal);
        this.Saldo = this.Saldo+saldo;    
    }
    
    public void retirar() throws IOException{
        System.out.println("Digite Saldo a Retirar: ");
        String sal = reader.readLine();
        long saldo = Long.parseLong(sal);
        if (this.Saldo-saldo > 0)
            this.Saldo = this.Saldo-saldo;
        else
             System.out.println("Transacion No Disponible!!!");
    }
    
    public void mostrar(){
        System.out.println("======= CUENTA BANCARIA ========");
        System.out.println("Numero de Cuenta: " + this.Numero_de_cuenta);
        System.out.println("DNI del Cliente: " + this.Dni_cliente);
        System.out.println("Saldo: " + this.Saldo);
        System.out.println("Intereses: " + this.Interes); 
    }
}
