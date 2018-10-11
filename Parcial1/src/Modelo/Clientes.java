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
 * @author Cristian
 */
public class Clientes{
    
    private String Nombre;
    private long Cedula;
    private List<Facturas> facturas = new ArrayList<>();
    
    public Clientes() {
        this.Nombre = "";
        this.Cedula = 0;
    }

    public Clientes(String Nombre, long Cedula, Facturas factura) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.facturas.add(factura);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getCedula() {
        return Cedula;
    }

    public void setCedula(long Cedula) {
        this.Cedula = Cedula;
    }

    public List<Facturas> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Facturas> facturas) {
        this.facturas = facturas;
    }
    
    public void aggFacturas(Facturas factura) {
        getFacturas().add(factura);
    }
}
