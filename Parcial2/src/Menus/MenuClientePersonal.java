/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import Modelo.*;
import java.io.IOException;

/**
 *
 * @author Cristian, Valentina
 */
public class MenuClientePersonal extends Menu{

    @Override
    public void crearCliente(Cliente tipoCliente) {
        try {
            String Nombre = "", Direccion  = "", NumeroPedido = "", Respuesta = "";
            int Cantidad = 0, i = 1;
            long NumeroTarjetaCredito = 0;
            float PrecioPorUnidad = 0;
            System.out.println("\n====== CLIENTE CORPORATIVO ======\n");
            System.out.println("Digite nombre: ");
            Nombre = reader.readLine();
            System.out.println("Digite direccion: ");
            Direccion = reader.readLine();
            System.out.println("Digite numero tarjeta de credito: ");
            NumeroTarjetaCredito = Integer.parseInt(reader.readLine());
            tipoCliente = new ClientePersonal(NumeroTarjetaCredito, Nombre, Direccion);
            do {                
                System.out.println("\n====== PEDIDO ["+i+"] ======\n");
                System.out.println("Digite numero del pedido: ");
                NumeroPedido = reader.readLine();
                System.out.println("Digite cantidad: ");
                Cantidad = Integer.parseInt(reader.readLine());
                System.out.println("Digite precio por unidad: ");
                PrecioPorUnidad = Float.parseFloat(reader.readLine());
                pedido = new Pedido(NumeroPedido, Cantidad, PrecioPorUnidad);
                tipoCliente.aggPedidos(pedido);
                System.out.println("\nDesea Agregar Mas Pedidos [S/N]:");
                Respuesta = reader.readLine();
                i++;
            } while (Respuesta.equalsIgnoreCase("s"));
            cliente = tipoCliente;
            mostrarCliente();
        } catch (IOException ex) {
            System.out.println(ex);
        }       
    }

    @Override
    public void mostrarCliente() {
        System.out.println("\n====== PIDELOYA ======\n");
        System.out.println("Nombre: "+cliente.getNombre());
        System.out.println("Direccion: "+cliente.getDireccion());
        System.out.println("Numero tarjeta de credito: "+((ClientePersonal)cliente).getNumeroTarjetaCredito());
        System.out.println("\n====== PEDIDOS =======\n");
        for (Pedido pedido :cliente.getPedidos()) {
            System.out.println("Numero de pedido: "+pedido.getNumeroPedido());
            System.out.println("Cantidad: "+pedido.getCantidad());
            System.out.println("Precio unitario: "+pedido.getPrecioPorUnidad()+"\n");
        }
    }  
}
