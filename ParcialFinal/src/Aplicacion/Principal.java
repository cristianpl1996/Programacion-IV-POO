/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Modelo.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Cristian
 */
public class Principal {
    
     public static void metodoPrincipal() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int Opcion = 0, Opc = 0;
        Cocina cocina = new Cocina(); // Director.
        do {
            try {
                System.out.println("====== MENU DE TIENDA DE COMIDAS RAPIDAS ======\n");
                System.out.println("1- Hamburguesa.");
                System.out.println("2- Perros calientes.");
                System.out.println("3- Pizza");
                System.out.println("4- Salir.\n");
                System.out.println("Digite Opcion: ");
                Opcion = Integer.parseInt(reader.readLine());
                switch(Opcion) {
                    case 1:
                        System.out.println("====== HAMBURGUESAS ======\n");
                        System.out.println("1- Hamburguesa sencilla.");
                        System.out.println("2- Hamburguesa especial.");
                        System.out.println("3- salir");
                        System.out.println("Digite Opcion: ");
                        Opc = Integer.parseInt(reader.readLine());
                        if (Opc == 1) {
                          HamburguesaBuilder sencillahamburguesa = new SencillaHamburguesaBuilder();
                          cocina.setHamburguesaBuilder(sencillahamburguesa);
                          cocina.construirHamburguesa();
                        }
                        if (Opc == 2) {
                          HamburguesaBuilder especialhamburguesa = new EspecialHamburguesaBuilderAdapter();
                          cocina.setHamburguesaBuilder(especialhamburguesa);
                          cocina.construirHamburguesa();                          
                        }
                        break;
                    case 2:
                        System.out.println("====== PERROS CALIENTES ======\n");
                        System.out.println("1- Perro caliente sencillo.");
                        System.out.println("2- Perro caliente especial.");
                        System.out.println("3- salir");
                        System.out.println("Digite Opcion: ");
                        Opc = Integer.parseInt(reader.readLine());
                        if (Opc == 1) {
                          PerroCalienteBuilder sencilloperrocaliente = new SencilloPerroCalienteBuilder();
                          cocina.setPerroCalienteBuilder(sencilloperrocaliente);
                          cocina.construirPerroCaliente();
                        }
                        if (Opc == 2) {
                          PerroCalienteBuilder especialperrocaliente = new EspecialPerroCalienteBuilderAdapter();
                          cocina.setPerroCalienteBuilder(especialperrocaliente);
                          cocina.construirPerroCaliente();                          
                        }
                        break;
                    case 3:
                        System.out.println("====== PIZZA ======\n");
                        System.out.println("1- Pizza Hawaiana.");
                        System.out.println("2- Pizza Picante.");
                        System.out.println("3- Pizza Pollo ");
                        System.out.println("4- Salir ");
                        System.out.println("Digite Opcion: ");
                        Opc = Integer.parseInt(reader.readLine());
                        if (Opc == 1) {
                          HawaiPizzaBuilder pizzahawaiana = new HawaiPizzaBuilder();
                          cocina.setPizzaBuilder(pizzahawaiana);
                          cocina.construirPizza();
                        }
                        if (Opc == 2) {
                          PicantePizzaBuilder pizzapicante = new PicantePizzaBuilder();
                          cocina.setPizzaBuilder(pizzapicante);
                          cocina.construirPizza();                         
                        }
                        if (Opc == 3) {
                          PolloPizzaBuilderAdapter pizzapollo = new PolloPizzaBuilderAdapter();
                          cocina.setPizzaBuilder(pizzapollo);
                          cocina.construirPizza();                         
                        }                  
                        break;    
                    case 4:
                        Opcion = 99;
                        break;
                    default:
                          System.out.println("¡ATENCION! Digite opcion dentro del menu de tiendas de comidas rapidas.\n"); 
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("¡ATENCION! Digite un entero.\n");
            }
        } while (Opcion != 99); 
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        metodoPrincipal();
        //Pizza pizza = cocina.getPizza();
    }
    
}
