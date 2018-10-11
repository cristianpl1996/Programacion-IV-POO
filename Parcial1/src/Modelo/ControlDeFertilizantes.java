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
public class ControlDeFertilizantes extends ProductosDeControl {
    
    private String FechaUltimaAplicacion;

    public ControlDeFertilizantes() {
        this.FechaUltimaAplicacion = "";
    }

    public ControlDeFertilizantes(String FechaUltimaAplicacion) {
        this.FechaUltimaAplicacion = FechaUltimaAplicacion;
    }

    public ControlDeFertilizantes(String FechaUltimaAplicacion, long RegistroICA, String NombreDelProducto, String FrecuenciaDeAplicacion, long ValorDelProducto) {
        super(RegistroICA, NombreDelProducto, FrecuenciaDeAplicacion, ValorDelProducto);
        this.FechaUltimaAplicacion = FechaUltimaAplicacion;
    }

    public String getFechaUltimaAplicacion() {
        return FechaUltimaAplicacion;
    }

    public void setFechaUltimaAplicacion(String FechaUltimaAplicacion) {
        this.FechaUltimaAplicacion = FechaUltimaAplicacion;
    }   
}
