package clases;

// CLASE PRODUCTO.
public class Pizza {
    
    private String masa = "";
    private String salsa = "";
    private String relleno = "";
 
    public void setMasa(String masa) { 
        this.masa = masa; 
    }
    
    public void setSalsa(String salsa) { 
        this.salsa = salsa; 
    }
    
    public void setRelleno(String relleno) { 
        this.relleno = relleno; 
    }
    
    public void mostrarPizza() {
        System.out.println("Caracteristicas de la Pizza");
        System.out.println("Masa: "+this.masa);
        System.out.println("Salsa: "+this.salsa);
        System.out.println("Relleno: "+this.relleno);
    }
}
