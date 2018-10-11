/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Cristian
 */
// CLASE PRODUCTO.
public class Coche {
    
    private int Cilindrada = 0;
    private int Potencia = 0;
    private String Tipo = "";
    private int Numero_Asientos = 0;

    public void setCilindrada(int Cilindrada) {
        this.Cilindrada = Cilindrada;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setNumero_Asientos(int Numero_Asientos) {
        this.Numero_Asientos = Numero_Asientos;
    }
    
    public void mostrarCoche() {
        System.out.println("Caracterisiticas del coche: ");
        System.out.println("Cilindraje: "+this.Cilindrada);
        System.out.println("Potencia: "+this.Potencia);
        System.out.println("Tipo: "+this.Tipo);
        System.out.println("Numero de asientos: "+this.Numero_Asientos);
    }
}
