/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Cristian Patiño
 */
public class Vehiculo extends Vendedor{
    
    private  String Placa;
    private  String Marca;
    private  String Linea;
    private  int Modelo;
    private  int Cilindraje;
    private  String Color;
    private  String Clase_de_vehiculo;
    
    public Vehiculo(){
        Placa = "";
        Marca = "";
        Linea = "";
        Modelo = 0;
        Cilindraje = 0;
        Color = "";
        Clase_de_vehiculo = "";
    }

    public Vehiculo(String Placa, String Marca, String Linea, int Modelo, int Cilindraje, String Color, String Clase_de_vehiculo) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Linea = Linea;
        this.Modelo = Modelo;
        this.Cilindraje = Cilindraje;
        this.Color = Color;
        this.Clase_de_vehiculo = Clase_de_vehiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getLinea() {
        return Linea;
    }

    public void setLinea(String Linea) {
        this.Linea = Linea;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public int getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(int Cilindraje) {
        this.Cilindraje = Cilindraje;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getClase_de_vehiculo() {
        return Clase_de_vehiculo;
    }

    public void setClase_de_vehiculo(String Clase_de_vehiculo) {
        this.Clase_de_vehiculo = Clase_de_vehiculo;
    }
     
}

