/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Cristian
 */
public class FicheroAleatorio implements Ficheros {
    
    private File file = new File("personas2.txt");
    private RandomAccessFile fileA;

    @Override
    public void leer(Persona persona) {
        try { 
            this.fileA = new RandomAccessFile(file, "rw");
            this.fileA.seek(this.fileA.length());
            this.fileA.writeBytes(persona.getCedula()+"/"+persona.getNombre()+"/"+persona.getApellido()+"\n");
            this.fileA.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void mostrar() {
        try {
            if (this.file.exists()) {
                this.fileA = new RandomAccessFile(file, "r");
                String Linea = "";
                String [] Contacto;
                System.out.println("====== Personas ======\n");
                while ((Linea = this.fileA.readLine())!= null) {
                    Contacto = Linea.split("/");                   
                    System.out.println("Cedula: "+Contacto[0]);
                    System.out.println("Nombre: "+Contacto[1]);
                    System.out.println("Apellido: "+Contacto[2]+"\n");
                }
                this.fileA.close();
            } else
                System.out.println("¡ATENCION! no hay personas.");      
        } catch (IOException e) {
           System.out.println(e);
        }
    }   
}
