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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class Crud {
    
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private List<ProductosDeControl> productos = new ArrayList<>();
    private List<Antibioticos> antibioticos = new ArrayList<>();
    private List<Clientes> clientes = new ArrayList<>();
    private ControlDeFertilizantes fertilizante = new ControlDeFertilizantes();
    private ControlDePlagas plaga = new ControlDePlagas();
    private Antibioticos antibiotico = new Antibioticos();
    private Facturas factura = new Facturas();
    private Clientes cliente = new Clientes();
    private Date fechaActual = new Date();
    private long Valortotal = 0;
    
    public boolean listaProductosDeControlVacia() {
        return this.productos.isEmpty();
    }
    
    public boolean listaAntibioticosVacia() {
        return this.antibioticos.isEmpty();
    }
    
    public void agregarProductosDeControl() throws IOException{
        int i = 1, j = 1, Opcion = 0;
        String registroICA = "", NombreDelProducto  = "", FrecuenciaDeAplicacion = "", valorDelProducto = "", FechaUltimaAplicacion = "", PeriodoDeCarencia = "", opcion = "", Respuesta = "s";
        long RegistroICA = 0, ValorDelProducto = 0;
        do {           
            System.out.println("====== AGREGAR PRODUCTOS DE CONTROL ======\n");
            System.out.println("1. Fertilizantes.");
            System.out.println("2. Control de plagas.\n");
            System.out.println("Opcion: ");
            opcion = this.reader.readLine();
            Opcion = Integer.parseInt(opcion);
            switch(Opcion) {
                case 1:
                    System.out.println("====== PRODUCTOS DE CONTROL FERTILIZANTE[" + i + "] ======\n");
                    System.out.println("Digite el registro ICA: ");
                    registroICA = this.reader.readLine();
                    RegistroICA = Long.parseLong(registroICA);
                    System.out.println("Digite nombre del producto: ");
                    NombreDelProducto = this.reader.readLine(); 
                    System.out.println("Digite la frecuencia de aplicacion: ");
                    FrecuenciaDeAplicacion = this.reader.readLine();
                    System.out.println("Digite el valor del producto: ");
                    valorDelProducto = this.reader.readLine();
                    ValorDelProducto = Long.parseLong(valorDelProducto);
                    System.out.println("Digite fecha de la ultima aplicacion del fertilizante: ");
                    FechaUltimaAplicacion = this.reader.readLine();
                    this.fertilizante = new ControlDeFertilizantes(FechaUltimaAplicacion, RegistroICA, NombreDelProducto, FrecuenciaDeAplicacion, ValorDelProducto);
                    this.productos.add(this.fertilizante);
                    System.out.println("\nDesea ingresar mas productos de control? [S/N]: ");
                    Respuesta = this.reader.readLine();
                    i++;
                    break;
                case 2:
                    System.out.println("====== PRODUCTOS DE CONTROL DE PLAGAS[" + j + "] ======\n");
                    System.out.println("Digite el registro ICA: ");
                    registroICA = this.reader.readLine();
                    RegistroICA = Long.parseLong(registroICA);
                    System.out.println("Digite nombre del producto: ");
                    NombreDelProducto = this.reader.readLine(); 
                    System.out.println("Digite la frecuencia de aplicacion: ");
                    FrecuenciaDeAplicacion = this.reader.readLine();
                    System.out.println("Digite el valor del producto: ");
                    valorDelProducto = this.reader.readLine();
                    ValorDelProducto = Long.parseLong(valorDelProducto);
                    System.out.println("Digite periodo de carencia del producto control de plaga: ");
                    PeriodoDeCarencia = this.reader.readLine();
                    this.plaga = new ControlDePlagas(PeriodoDeCarencia, RegistroICA, NombreDelProducto, FrecuenciaDeAplicacion, ValorDelProducto);
                    this.productos.add(this.plaga);
                    System.out.println("\nDesea ingresar mas productos de control? [S/N]: ");
                    Respuesta = this.reader.readLine();
                    j++;
                    break;
                default:
                    System.out.println("¡ATENCION! Digite opcion de agregar productos de control.\n"); 
            }  
        } while (Respuesta.equalsIgnoreCase("s")); 
    }
    
    public void agregarAntibioticos() throws IOException{
        int i = 1;
        String NombreDelProducto = "", Dosis = "", TipoDeAnimal = "", precio = "", Respuesta = "";
        long Precio = 0;
        do {           
            System.out.println("====== AGREGAR ANTIBIOTICOS ======\n");
            System.out.println("====== ANTIBIOTICOS PARA BOVINOS Y PORCINOS[" + i + "] ======\n");
            System.out.println("Digite el nombre del producto: ");
            NombreDelProducto = this.reader.readLine();
            System.out.println("Digite dosis [Entre 400Kg y 600Kg]: ");
            Dosis = this.reader.readLine(); 
            System.out.println("Digite el tipo de animal [Bovinos, caprinos o porcinos]: ");
            TipoDeAnimal = this.reader.readLine();
            System.out.println("Digite el valor del producto: ");
            precio = this.reader.readLine();
            Precio = Long.parseLong(precio);
            this.antibiotico = new Antibioticos(NombreDelProducto, Dosis, TipoDeAnimal, Precio);
            this.antibioticos.add(this.antibiotico);         
            System.out.println("\nDesea ingresar mas antibioticos? [S/N]: ");
            Respuesta = this.reader.readLine();
            i++;            
        } while (Respuesta.equalsIgnoreCase("s")); 
    }
    
    private void listarProductosDeControl(){
        System.out.println("====== PRODUCTOS DE CONTROL ======\n");
        for (ProductosDeControl producto : this.productos) 
            mostrarProductosDeControl(producto);  
    }
    
    private void listarAntibioticos(){
        System.out.println("====== ANTIBIOTICOS ======\n");
        for (Antibioticos antibiotico: this.antibioticos) 
            mostrarAntibioticos(antibiotico);   
    }
    
    private void mostrarProductosDeControl(ProductosDeControl producto) { 
        System.out.println("Registro ICA: " + producto.getRegistroICA());
        System.out.println("Nombre del producto control: " + producto.getNombreDelProducto());    
        System.out.println("Frecuencia de la aplicacion: " + producto.getFrecuenciaDeAplicacion());
        if (producto instanceof ControlDeFertilizantes)
        System.out.println("Fecha de la ultima aplicacion: "+((ControlDeFertilizantes) producto).getFechaUltimaAplicacion());
        if (producto instanceof ControlDePlagas)
        System.out.println("Periodo Carencia: "+ ((ControlDePlagas) producto).getPeridoDeCarenica());
        System.out.println("Valor del producto: " + producto.getValorDelproducto()+"\n");
    }
    
    private void mostrarAntibioticos(Antibioticos antibiotico) { 
        System.out.println("Nombre del antibiotico: " + antibiotico.getNombreDelProducto());
        System.out.println("Dosis: " + antibiotico.getDosis());
        System.out.println("Tipo de animal: " + antibiotico.getTipoDeAnimal());
        System.out.println("Valor del producto: " + antibiotico.getPrecio()+"\n");
    }
    
    public void comprarProductos() throws IOException {
        String registroICA = "", NombreDelProducto = "", Nombre = "", cedula = "", opcion = "", Respuesta = "s";
        long RegistroICA = 0, Cedula = 0;
        int Opcion = 0;        
        System.out.println("====== CATALOGO DE TIENDA AGRICOLA ======\n");
        if(!listaProductosDeControlVacia())
            listarProductosDeControl();
        if(!listaAntibioticosVacia())
            listarAntibioticos();
        do {
            System.out.println("====== MENU PARA COMPRAR ======\n");
            System.out.println("1.Digite Registro ICA para agregar productos de control a la factura");
            System.out.println("2.Digite nombre del producto para agregar antibioticos a la factura");
            System.out.println("\nDigite Opcion: ");
            opcion = this.reader.readLine();
            Opcion = Integer.parseInt(opcion);           
            switch(Opcion) {
                case 1:
                    if(!listaProductosDeControlVacia()) {
                        System.out.println("Digite Registro ICA:");
                        registroICA = this.reader.readLine();
                        RegistroICA = Long.parseLong(registroICA);
                        buscarProductosDeControlPorRegistroICA(RegistroICA);
                        System.out.println("Desea agregar mas productos? [S/N]: ");
                        Respuesta = this.reader.readLine();
                    } else    
                        System.out.println("¡ATENCION! No hay productos de control en el catalago.\n");
                    break;
                case 2:
                    if (!listaAntibioticosVacia()) {
                        System.out.println("Digite nombre del producto:");
                        NombreDelProducto = this.reader.readLine();                  
                        buscarAntibioticosPorNombreDelProducto(NombreDelProducto);
                        System.out.println("Desea agregar mas productos? [S/N]: ");
                        Respuesta = this.reader.readLine(); 
                    } else 
                        System.out.println("¡ATENCION! No hay antibioticos en el catalago.\n");
                    break;    
                default:
                      System.out.println("¡ATENCION! Digite opcion dentro de menu para comprar.\n"); 
            }                       
        } while (Respuesta.equalsIgnoreCase("s"));
        if (!this.factura.getProductos().isEmpty() || !this.factura.getAntibioticos().isEmpty()) {
            System.out.println("====== COMPRAR PRODUCTOS AGREGADOS ======\n");
            System.out.println("Esta seguro de comprar productos agregados?.");
            System.out.println("1.Comprar");
            System.out.println("2.No Comprar");
            System.out.println("\nDigite Opcion: ");
            opcion = this.reader.readLine();
            Opcion = Integer.parseInt(opcion);
            switch (Opcion) {
                case 1:
                    System.out.println("====== PROCESO DE COMPRA ======\n");
                    System.out.println("Digite nombre del cliente: ");
                    Nombre = this.reader.readLine();
                    System.out.println("Digite cedula del cliente: ");
                    cedula = this.reader.readLine();
                    Cedula = Long.parseLong(cedula);
                    this.factura.setFecha(this.fechaActual);
                    if(clienteExiste(Cedula)) {
                        for (Clientes cliente : this.clientes) {
                            if (cliente.getCedula() == Cedula) {       
                                cliente.aggFacturas(this.factura);
                                break;
                            }  
                        }
                    } else {
                        this.cliente = new Clientes(Nombre, Cedula, this.factura);
                        this.clientes.add(this.cliente);
                    }
                    mostrarFactura(this.factura);
                    break;
                case 2:
                    System.out.println("¡FACTURA! cancelada.");
                    break;
                default:
                    System.out.println("¡ATENCION! Digite opcion dentro de comprar productos agregados.\n");
            }
            this.factura = new Facturas();
            this.Valortotal = 0;
        }     
    }
    
    private boolean clienteExiste(long Cedula){
        for (Clientes cliente : this.clientes) {
            if(cliente.getCedula() == Cedula) 
                return true;   
        }
        return false;
    }

    private void buscarProductosDeControlPorRegistroICA(long RegistroICA) {               
        for (ProductosDeControl producto : this.productos) {
            if (producto.getRegistroICA()== RegistroICA) {
                this.Valortotal = this.Valortotal + producto.getValorDelproducto();
                this.factura.setValorTotal(Valortotal);
                this.factura.aggProductos(producto);
                System.out.println("¡FACTURA! Se agrego producto con exito.");
                return;
            }        
        }
        System.out.println("¡ATENCION! Producto de control no existe.\n");
    }
    
    private void buscarAntibioticosPorNombreDelProducto(String NombreDelProducto) {      
        for (Antibioticos antibiotico: this.antibioticos) {
            if (antibiotico.getNombreDelProducto().equals(NombreDelProducto)) {
                this.Valortotal = this.Valortotal + antibiotico.getPrecio();
                this.factura.setValorTotal(Valortotal);
                this.factura.aggAntibioticos(antibiotico);
                System.out.println("¡FACTURA! Se agrego producto con exito.");
                return;
            }      
        }
        System.out.println("¡ATENCION! Antibiotico no existe.\n");
    }

    private void mostrarFactura(Facturas factura) {
        System.out.println("====== FACTURA ========\n");
        System.out.println("Fecha: "+factura.getFecha());
        System.out.println("Productos agregados: \n");
        for (ProductosDeControl producto : factura.getProductos()) 
            mostrarProductosDeControl(producto);
        for (Antibioticos antibiotico : factura.getAntibioticos())
            mostrarAntibioticos(antibiotico);
        System.out.println("Valor total: "+factura.getValorTotal()+"\n");      
    }
    
    public void buscarHistorialCliente() throws IOException {
        String cedula = "";
        long Cedula = 0;
        System.out.println("====== BUSCAR HISTORIAL DEL CLIENTE ========\n");
        System.out.println("Digite Cedula de Cliente: ");
        cedula = this.reader.readLine();
        Cedula = Long.parseLong(cedula);
        for (Clientes cliente: this.clientes) {
            if(cliente.getCedula()== Cedula) {
                mostrarHistorialCliente(cliente);
                return;
            }       
        }
        System.out.println("¡ATENCION! Cliente no existe.\n");  
    }

    private void mostrarHistorialCliente(Clientes cliente) {
        System.out.println("======= HISTORIAL DE CLIENTE ========\n");
        System.out.println("Nombre: "+cliente.getNombre());
        System.out.println("Cedula: "+cliente.getCedula()+"\n");
        System.out.println("Facturas asociadas al cliente: \n");
         for (Facturas factura : cliente.getFacturas()) 
            mostrarFactura(factura);      
    }
}
