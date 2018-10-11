/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Modelo.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Cristian
 */
public class Main {
    
    private static void metodoPrincipal() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Ficheros ficherosecuencial = new FicheroSecuencial();
        Ficheros ficheroaleatorio = new FicheroAleatorio();
        int Opcion = 0;
        do {
            try {
                System.out.println("====== MENU FICHEROS ======\n");
                System.out.println("1- Fichero de acceso secuencial o acesso directo.");
                System.out.println("2- Mostrar Fichero de acceso secuencial o acesso directo.");
                System.out.println("3- Fichero de acesso aleatorio.");
                System.out.println("4- Mostrar Fichero de acesso aleatorio.");
                System.out.println("5- Salir.\n");
                System.out.println("Digite Opcion: ");
                Opcion = Integer.parseInt(reader.readLine());
                switch(Opcion) {
                    case 1:
                        ficherosecuencial.leer(crearPersona(reader));
                        break;
                    case 2:
                        ficherosecuencial.mostrar();
                        break;
                    case 3:
                        ficheroaleatorio.leer(crearPersona(reader));
                        break;
                    case 4:
                        ficheroaleatorio.mostrar();
                        break;    
                    case 5:
                        Opcion = 99;
                        break;                  
                    default:
                          System.out.println("¡ATENCION! Digite opcion dentro del menu ficheros.\n"); 
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println(e);
            }
        } while (Opcion != 99); 
    }
    
    private static Persona crearPersona(BufferedReader reader) throws IOException {
        String Cedula = "", Nombre = "", Apellido = "";
        System.out.println("====== Crear Persona ======\n");
        System.out.println("Digite cedula: ");
        Cedula = reader.readLine();
        System.out.println("Digite nombre: ");
        Nombre = reader.readLine();
        System.out.println("Digite apellido: ");
        Apellido = reader.readLine();
        Persona persona;
        persona = new Persona(Cedula, Nombre, Apellido);
        return persona;      
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodoPrincipal();
    }
    
}
