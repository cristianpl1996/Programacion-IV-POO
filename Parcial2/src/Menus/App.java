/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import Modelo.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Cristian, Valentina
 */
public class App {
    
    public static void aplicacionBanco() throws IOException {      
        Menu menuClienteCorporativo = new MenuClienteCorporativo();
        Menu menuClientePersonal = new MenuClientePersonal();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tipoCliente = 0;
        do {
            try {
                System.out.println("====== MENU PIDELOYA ======\n");
                System.out.println("1- Hacer pedido cliente corporativo.");
                System.out.println("2- Hacer pedido cliente personal.");
                System.out.println("0- Salir.\n");
                System.out.println("Digite Opcion: ");  
                tipoCliente = Integer.parseInt(reader.readLine());
                switch(tipoCliente) {
                    case 1:
                        menuClienteCorporativo.crearCliente(Cliente.getCliente(tipoCliente));
                        break;
                    case 2:
                        menuClientePersonal.crearCliente(Cliente.getCliente(tipoCliente));
                        break;     
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println(e);
            }
        } while (tipoCliente != 0); 
    }    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        aplicacionBanco();        
    }   
}
