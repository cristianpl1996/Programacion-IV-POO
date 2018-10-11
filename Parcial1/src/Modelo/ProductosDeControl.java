/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Cristian
 */
public class ProductosDeControl {
    
    private long RegistroICA;
    private String NombreDelProducto;
    private String FrecuenciaDeAplicacion;
    private long ValorDelproducto;

    public ProductosDeControl() {
        this.RegistroICA = 0;
        this.NombreDelProducto = "" ;
        this.FrecuenciaDeAplicacion = "" ;
        this.ValorDelproducto = 0;
    }

    public ProductosDeControl(long RegistroICA, String NombreDelProducto, String FrecuenciaDeAplicacion, long ValorDelProducto) {
        this.RegistroICA = RegistroICA;
        this.NombreDelProducto = NombreDelProducto;
        this.FrecuenciaDeAplicacion = FrecuenciaDeAplicacion;
        this.ValorDelproducto = ValorDelProducto;
    }

    public long getRegistroICA() {
        return RegistroICA;
    }

    public void setRegistroICA(long RegistroICA) {
        this.RegistroICA = RegistroICA;
    }

    public String getNombreDelProducto() {
        return NombreDelProducto;
    }

    public void setNombreDelProducto(String NombreDelProducto) {
        this.NombreDelProducto = NombreDelProducto;
    }

    public String getFrecuenciaDeAplicacion() {
        return FrecuenciaDeAplicacion;
    }

    public void setFrecuenciaDeAplicacion(String FrecuenciaDeAplicacion) {
        this.FrecuenciaDeAplicacion = FrecuenciaDeAplicacion;
    }

    public long getValorDelproducto() {
        return ValorDelproducto;
    }

    public void setValorDelproducto(long ValorDelproducto) {
        this.ValorDelproducto = ValorDelproducto;
    }   
}
