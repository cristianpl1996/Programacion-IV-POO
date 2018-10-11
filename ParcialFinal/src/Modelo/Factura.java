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
 * @author familia acosta
 */
public class Factura {
    private String Nombre;
    private long NumeroFac;
    private  List<Pizza> listpizza = new ArrayList<>();
    private  List<Hamburguesa> listhamburguesa = new ArrayList<>();
    private  List<PerroCaliente> listperrocaliente = new ArrayList<>();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getNumeroFac() {
        return NumeroFac;
    }

    public void setNumeroFac(long NumeroFac) {
        this.NumeroFac = NumeroFac;
    }

    public List<Pizza> getListpizza() {
        return listpizza;
    }

    public void setListpizza(List<Pizza> listpizza) {
        this.listpizza = listpizza;
    }

    public List<Hamburguesa> getListhamburguesa() {
        return listhamburguesa;
    }

    public void setListhamburguesa(List<Hamburguesa> listhamburguesa) {
        this.listhamburguesa = listhamburguesa;
    }

    public List<PerroCaliente> getListperrocaliente() {
        return listperrocaliente;
    }

    public void setListperrocaliente(List<PerroCaliente> listperrocaliente) {
        this.listperrocaliente = listperrocaliente;
    }   
}
