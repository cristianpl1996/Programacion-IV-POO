/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Cristian Patiño
 */
public class Ejercicio3 {
    
    public void metodoPrincipal() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MetodosPersona metodo = new MetodosPersona();
        String opcion = "";
        int Opcion = 0;
        do {
            System.out.println("====== MENU DE CONTACTOS ======\n");
            System.out.println("1- Agregar contactos de personas.");
            System.out.println("2- Buscar contacto por nombre de persona.");
            System.out.println("3- Buscar contacto por apellido de persona.");
            System.out.println("4- Buscar contacto por telefono de persona.");
            System.out.println("5- Eliminar contacto por nombre de persona.");
            System.out.println("6- Listar contactos de personas");
            System.out.println("7- Salir del menu de contactos\n");
            System.out.println("Digite Opcion: ");
            opcion = reader.readLine();
            Opcion = Integer.parseInt(opcion);
            switch(Opcion) {
                case 1:
                    metodo.agregarContactos();
                    break;
                case 2:
                    if(metodo.listaContactosVacia())
                        System.out.println("La lista de contactos esta vacia!!!.");
                    else {
                        System.out.println("==== BUSCAR CONTACTO POR NOMBRE ====");
                        System.out.println("Digite el nombre que desea buscar: ");
                        String nombre = reader.readLine();
                        metodo.buscarPorNombre(nombre);
                    }
                    break;
                case 3:
                    if(metodo.listaContactosVacia())
                        System.out.println("La lista de contactos esta vacia!!!.");
                    else {
                        System.out.println("==== BUSCAR CONTACTO POR APELLIDO ====");
                        System.out.println("Digite los apellidos que desea buscar: ");
                        String apellidos = reader.readLine();
                        metodo.buscarPorApellidos(apellidos);
                    }
                    break;
                case 4:
                    if(metodo.listaContactosVacia())
                        System.out.println("La lista de contactos esta vacia!!!.");
                    else {
                        System.out.println("==== BUSCAR CONTACTO POR TELEFONO ====");
                        System.out.println("Digite el telefono que desea buscar: ");
                        String telefono = reader.readLine();
                        long Telefono = Long.parseLong(telefono);
                        metodo.buscarPorTelefono(Telefono);
                    }
                    break;
                case 5:
                    if(metodo.listaContactosVacia())
                        System.out.println("La lista de contactos esta vacia!!!.");
                    else {
                        System.out.println("==== ELIMINAR CONTACTO ====");
                        System.out.println("Digite el nombre que desea eliminar: ");
                        String nombre = reader.readLine();
                        if (metodo.eliminarContacto(nombre))
                            System.out.println("Contacto eliminado!!!.");
                        else
                            System.out.println("No se pudo eliminar el contacto!!!.");
                    }
                    break;
                case 6:
                    if(metodo.listaContactosVacia())
                        System.out.println("La lista de contactos esta vacia!!!.");
                    else {
                        metodo.listarContactos();
                    }
                    break;    
                case 7:
                    Opcion = 99;
                    break;
                default:
                      System.out.println("Digite Opcion dentro de menu de contactos!!!.\n"); 
            }               
        } while (Opcion != 99); 
    } 
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         new Ejercicio3().metodoPrincipal();
    }
}
