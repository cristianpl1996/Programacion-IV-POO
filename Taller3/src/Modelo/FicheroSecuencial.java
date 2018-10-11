/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Cristian
 */
public class FicheroSecuencial implements Ficheros {
    
    private File file = new File("personas.txt");
    private FileWriter filewriter;
    private BufferedWriter bufferwriter;
    private FileReader filereader;
    private BufferedReader bufferreader;
    
    @Override
    public void leer(Persona persona) {
        try {          
            if (this.file.exists()) {
                this.filewriter = new FileWriter(this.file, true);
                this.bufferwriter =  new BufferedWriter(this.filewriter);
                this.bufferwriter.newLine();
                this.bufferwriter.write(persona.getCedula()+"/"+persona.getNombre()+"/"+persona.getApellido());    
            } else{
                this.filewriter = new FileWriter(this.file);
                this.bufferwriter =  new BufferedWriter(this.filewriter);
                this.bufferwriter.write(persona.getCedula()+"/"+persona.getNombre()+"/"+persona.getApellido());
            }    
            this.bufferwriter.close();
            this.filewriter.close();          
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void mostrar() {
        try {
            if (this.file.exists()) {
                this.filereader = new FileReader(this.file);
                this.bufferreader = new BufferedReader(filereader);
                String Linea = "";
                String [] Contacto;
                System.out.println("====== Personas ======\n");
                while ((Linea = this.bufferreader.readLine()) != null) {
                    Contacto = Linea.split("/");                   
                    System.out.println("Cedula: "+Contacto[0]);
                    System.out.println("Nombre: "+Contacto[1]);
                    System.out.println("Apellido: "+Contacto[2]+"\n");
                }
                this.bufferreader.close();
                this.filereader.close();              
            }
            else
                System.out.println("¡ATENCION! no hay personas.");           
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
