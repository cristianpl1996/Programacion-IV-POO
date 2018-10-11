/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Cristian Patiño
 */
public class MetodosCorreoElectronico {
    
    public void ingresarCorreoElectronico() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("====== CORREO ELECTRONICO ======");
        System.out.println("Cuenta: Id@Dominio");
        System.out.println("Password: ********\n");
        System.out.println("Correo Electronico 1:");
        System.out.println("Id: ");
        String Id = reader.readLine();
        System.out.println("Dominio: ");
        String Dominio = reader.readLine();
        System.out.println("Password: ");
        String Password = reader.readLine();
        CorreoElectronico correoelectronico1 = new CorreoElectronico(Id, Dominio, Password);
        System.out.println("Correo Electronico 2:");
        System.out.print("Id: ");
        String Id2 = reader.readLine();
        System.out.println("Dominio: ");
        String Dominio2 = reader.readLine();
        System.out.println("Password: ");
        String Password2 = reader.readLine();
        CorreoElectronico correoelectronico2 = new CorreoElectronico(Id2, Dominio2, Password2);
        System.out.println("====== DATOS ======");
        System.out.println("Correo Electronico 1:");
        System.out.println("Cuenta: " + correoelectronico1.getId() + "@" + correoelectronico1.getDominio());
        System.out.println("Password: " + correoelectronico1.getPassword());
        System.out.println("Correo Electronico 2:");
        System.out.println("Cuenta: " + correoelectronico2.getId() + "@" + correoelectronico2.getDominio());
        System.out.println("Password: " + correoelectronico2.getPassword());
    }   
}
