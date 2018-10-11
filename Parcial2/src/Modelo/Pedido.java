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
public class Pedido {
    
    private String NumeroPedido;
    private int Cantidad;
    private float PrecioPorUnidad;

    public Pedido() {
        this.NumeroPedido = "";
        this.Cantidad = 0;
        this.PrecioPorUnidad = 0;
    }

    public Pedido(String NumeroPedido, int Cantidad, float PrecioPorUnidad) {
        this.NumeroPedido = NumeroPedido;
        this.Cantidad = Cantidad;
        this.PrecioPorUnidad = PrecioPorUnidad;
    }

    public String getNumeroPedido() {
        return NumeroPedido;
    }

    public void setNumeroPedido(String NumeroPedido) {
        this.NumeroPedido = NumeroPedido;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getPrecioPorUnidad() {
        return PrecioPorUnidad;
    }

    public void setPrecioPorUnidad(float PrecioPorUnidad) {
        this.PrecioPorUnidad = PrecioPorUnidad;
    } 
}
