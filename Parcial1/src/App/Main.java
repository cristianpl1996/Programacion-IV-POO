/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
    

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Cristian
 */
public class Main {
    
    public void metodoPrincipal() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Crud metodo = new Crud();
        String opcion = "";
        int Opcion = 0;
        do {
            try {
                System.out.println("====== MENU DE TIENDA AGRICOLA ======\n");
                System.out.println("1- Agregar productos de control.");
                System.out.println("2- Agregar antibioticos.");
                System.out.println("3- Comprar productos de control o antibioticos");
                System.out.println("4- Buscar historial del cliente.");
                System.out.println("5- Salir.\n");
                System.out.println("Digite Opcion: ");
                opcion = reader.readLine();
                Opcion = Integer.parseInt(opcion);
                switch(Opcion) {
                    case 1:
                        metodo.agregarProductosDeControl();
                        break;
                    case 2:
                        metodo.agregarAntibioticos();
                        break;
                    case 3:
                        if(metodo.listaProductosDeControlVacia() && metodo.listaAntibioticosVacia())
                            System.out.println("¡ATENCION! Primero agregar productos.\n");
                        else 
                            metodo.comprarProductos();
                        break;
                    case 4:
                        metodo.buscarHistorialCliente();
                        break;    
                    case 5:
                        Opcion = 99;
                        break;
                    default:
                          System.out.println("¡ATENCION! Digite opcion dentro del menu de tienda agricola.\n"); 
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("¡ATENCION! Digite un entero.\n");
            }
        } while (Opcion != 99); 
    } 
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        new Main().metodoPrincipal();
    }  
}
