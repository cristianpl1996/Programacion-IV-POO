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
public class ControlDePlagas extends ProductosDeControl {
    
    private String PeridoDeCarenica;

    public ControlDePlagas() {
        this.PeridoDeCarenica = "";
    }

    public ControlDePlagas(String PeridoDeCarenica) {
        this.PeridoDeCarenica = PeridoDeCarenica;
    }

    public ControlDePlagas(String PeridoDeCarenica, long RegistroICA, String NombreDelProducto, String FrecuenciaDeAplicacion, long ValorDelProducto) {
        super(RegistroICA, NombreDelProducto, FrecuenciaDeAplicacion, ValorDelProducto);
        this.PeridoDeCarenica = PeridoDeCarenica;
    }

    public String getPeridoDeCarenica() {
        return PeridoDeCarenica;
    }

    public void setPeridoDeCarenica(String PeridoDeCarenica) {
        this.PeridoDeCarenica = PeridoDeCarenica;
    }   
}
