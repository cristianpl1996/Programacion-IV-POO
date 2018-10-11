/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Cristian Patiño
 */
public class CorreoElectronico {
    
    private String Id;
    private String Dominio;
    private String Password;

    public CorreoElectronico() {
       Id = "";
       Dominio = "";
       Password = "";
    }

    public CorreoElectronico(String Id, String Dominio, String Password) {
        this.Id = Id;
        this.Dominio = Dominio;
        this.Password = Password;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getDominio() {
        return Dominio;
    }

    public void setDominio(String Dominio) {
        this.Dominio = Dominio;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
