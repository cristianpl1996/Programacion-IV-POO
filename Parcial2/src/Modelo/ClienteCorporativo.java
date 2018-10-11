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
public class ClienteCorporativo extends Cliente {
    
    private String NombreRepresentanteLegal;
    
     public ClienteCorporativo() {
         this.NombreRepresentanteLegal = "";
    }

    public ClienteCorporativo(String NombreRepresentanteLegal) {
        this.NombreRepresentanteLegal = NombreRepresentanteLegal;
    }

    public ClienteCorporativo(String NombreRepresentanteLegal, String Nombre, String Direccion) {
        super(Nombre, Direccion);
        this.NombreRepresentanteLegal = NombreRepresentanteLegal;
    } 

    public String getNombreRepresentanteLegal() {
        return NombreRepresentanteLegal;
    }

    public void setNombreRepresentanteLegal(String NombreRepresentanteLegal) {
        this.NombreRepresentanteLegal = NombreRepresentanteLegal;
    }   
}
