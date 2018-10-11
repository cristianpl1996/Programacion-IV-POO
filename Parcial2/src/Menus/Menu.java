/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import Modelo.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Cristian, Valentina
 */
public abstract class Menu {
    
    protected BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    protected Pedido pedido;
    protected Cliente cliente;
    public abstract void crearCliente(Cliente tipoCliente);
    public abstract void mostrarCliente();        
}
