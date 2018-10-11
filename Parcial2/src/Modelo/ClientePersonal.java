/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Cristian, Valentina
 */
public class ClientePersonal extends Cliente {
    
    private long NumeroTarjetaCredito;
    
     public ClientePersonal() {
         this.NumeroTarjetaCredito = 0;
    }

    public ClientePersonal(long NumeroTarjetaCredito) {
        this.NumeroTarjetaCredito = NumeroTarjetaCredito;
    }

    public ClientePersonal(long NumeroTarjetaCredito, String Nombre, String Direccion) {
        super(Nombre, Direccion);
        this.NumeroTarjetaCredito = NumeroTarjetaCredito;
    }

    public long getNumeroTarjetaCredito() {
        return NumeroTarjetaCredito;
    }

    public void setNumeroTarjetaCredito(long NumeroTarjetaCredito) {
        this.NumeroTarjetaCredito = NumeroTarjetaCredito;
    }   
}
