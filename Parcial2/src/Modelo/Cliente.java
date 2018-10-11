/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian, Valentina
 */
public class Cliente {
 
    private String Nombre;
    private String Direccion;
    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente() {
        this.Nombre = "";
        this.Direccion = "";
    }

    public Cliente(String Nombre, String Direccion) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void aggPedidos(Pedido pedido) {
        getPedidos().add(pedido);
    }
 
    public static Cliente getCliente(int tipoCliente) {
        if (tipoCliente == 1) 
            return new ClientePersonal();
        if (tipoCliente == 2)
            return new ClienteCorporativo();
        return null;           
    }
}
