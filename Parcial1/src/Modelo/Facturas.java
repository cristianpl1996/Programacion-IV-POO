/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class Facturas {
    
    private Date Fecha;
    private long ValorTotal;
    private List<ProductosDeControl> productos;
    private List<Antibioticos> antibioticos;
    
    public Facturas() {
        this.Fecha = null;
        this.ValorTotal = 0;
        productos = new ArrayList<>();
        antibioticos = new ArrayList<>();
    }

    public Facturas(Date Fecha, long ValorTotal, String Nombre, long Cedula) {
        this.Fecha = Fecha;
        this.ValorTotal = ValorTotal;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public long getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(long ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public List<ProductosDeControl> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductosDeControl> productos) {
        this.productos = productos;
    }

    public List<Antibioticos> getAntibioticos() {
        return antibioticos;
    }

    public void setAntibioticos(List<Antibioticos> antibioticos) {
        this.antibioticos = antibioticos;
    }
    
    public void aggProductos(ProductosDeControl producto) {
        getProductos().add(producto);
    }

    public void aggAntibioticos(Antibioticos antibiotico) {
        getAntibioticos().add(antibiotico);
    }
}
