/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8_practica2;

import Vista.PantallaAltaClientes;
import Vista.PantallaConsultaClientes;
import Vista.PantallaBajaClientes;
import Vista.PantallaModificarClientes;
import ModeloBD.*;
import ModeloUML.*;
import Vista.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    private static BaseDeDatos bd = new BaseDeDatos();
    private static TablaClientes tc = new TablaClientes();
    private static TablaCasos tcaso = new TablaCasos();
    private static TablaAbogados ta = new TablaAbogados();
    
    public static void main(String[] args) {
        PantallaPrincipal v1 = new PantallaPrincipal();
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
    }
    
    public static void irPantallaPrincipal(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaPrincipal nuevo= new PantallaPrincipal();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void irpantallaAltaClientes(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaAltaClientes nuevo;
        nuevo=new PantallaAltaClientes();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);        
    }
    
    public static void irpantallaBajaClientes(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaBajaClientes nuevo=new PantallaBajaClientes();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);        
    }
    
    public static void irpantallaModificarClientes(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaModificarClientes nuevo=new PantallaModificarClientes();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);        
    }
    
    public static void irpantallaConsultaClientes(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaConsultaClientes nuevo=new PantallaConsultaClientes();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);        
    }
    
    public static void irpantallaAltaAbogados(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaAltaAbogados nuevo=new PantallaAltaAbogados();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);        
    }
    
    public static void irpantallaBajaAbogados(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaBajaAbogados nuevo=new PantallaBajaAbogados();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);        
    }
    
    public static void irpantallaModificarAbogados(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaModificarAbogados nuevo=new PantallaModificarAbogados();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);        
    }
    
    public static void irpantallaConsultaAbogados(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaConsultaAbogados nuevo=new PantallaConsultaAbogados();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);        
    }
    
    public static void irpantallaAltaCasos(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaAltaCasos nuevo=new PantallaAltaCasos();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);        
    }
    
    public static void irpantallaBajaCasos(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaBajaCasos nuevo=new PantallaBajaCasos();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);        
    }
    
    public static void irpantallaModificarCasos(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaModificarCasos nuevo=new PantallaModificarCasos();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);        
    }
    
    public static void irpantallaConsultaCasos(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaConsultaCasos nuevo=new PantallaConsultaCasos();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);        
    }
    
    public static void salir()
    {
        System.exit(0);
    }
    
    public static void hacerAltaCliente(String dni, String nombre, String apellidos, String direccion, String telefono, String correo) throws Exception
    {
        Cliente c=new Cliente(dni, nombre, apellidos, direccion, telefono, correo);
        tc.altaCliente(bd.conectar(), c);
        bd.desconectar();
    }
    
    public static void hacerAltaAbogado(String dni, String nombre, String apellidos, String direccion) throws Exception
    {
        Abogado a=new Abogado(dni, nombre, apellidos, direccion);
        ta.altaAbogado(bd.conectar(), a);
        bd.desconectar();
    }

    public static ArrayList<String> realizarConsultaClienteUnico(String dni) throws Exception
    {
        Cliente c = tc.consultaClienteUnico(bd.conectar(), dni);
        bd.desconectar();
        ArrayList<String> datos = new ArrayList();
        datos.add(c.getDni());
        datos.add(c.getNombre());
        datos.add(c.getApellidos());
        datos.add(c.getDireccion());
        datos.add(c.getTelefono());
        datos.add(c.getCorreo());
        return datos;
    }

    public static ArrayList<String> realizarConsultaAbogadoUnico(String dni) throws Exception
    {
        Abogado a = ta.consultaAbogadoUnico(bd.conectar(), dni);
        bd.desconectar();
        ArrayList<String> datos = new ArrayList();
        datos.add(a.getDni());
        datos.add(a.getNombre());
        datos.add(a.getApellidos());
        datos.add(a.getDireccion());
        return datos;
    }

    public static ArrayList<ArrayList<String>> hacerConsultaTodosClientes() throws Exception
    {
        ArrayList<ArrayList<String>> datos = tc.consultaTodosClientes(bd.conectar());
        bd.desconectar();        
        return datos;
    }

    public static ArrayList<ArrayList<String>> hacerConsultaTodosAbogados() throws Exception
    {
        ArrayList<ArrayList<String>> datos = ta.consultaTodosAbogados(bd.conectar());
        bd.desconectar();        
        return datos;
    }
    
    public static void hacerBajaCliente(String dni) throws Exception
    {
        tc.bajaCliente(bd.conectar(), dni);
        bd.desconectar();
    }

    public static void modificarCliente(String dni, String nombre, String apellidos, String direccion, String telefono, String correo) throws Exception
    {
        Cliente c = new Cliente(dni,nombre,apellidos,direccion,telefono,correo);
        tc.modificarCliente(bd.conectar(), c);
    }
    
    public static void modificarAbogado(String dni, String nombre, String apellidos, String direccion) throws Exception
    {
        Abogado c = new Abogado(dni,nombre,apellidos,direccion);
        ta.modificarAbogado(bd.conectar(), c);
    }
    
    public static void hacerAltaCaso(String numeroExpediente, String estado, String fechaInicio, String fechaFin, String dni) throws Exception
    {
        Caso c = new Caso(numeroExpediente, LocalDate.parse(fechaInicio, DateTimeFormatter.ISO_DATE), LocalDate.parse(fechaFin), estado, tc.consultaClienteUnico(bd.conectar(), dni));
        tcaso.hacerAltaCaso(bd.conectar(),c);
        bd.desconectar();
    }
    
    public static void hacerBajaCaso(String numeroExpediente) throws Exception
    {
        tcaso.hacerBajaCaso(bd.conectar(),numeroExpediente);
        bd.desconectar();
    }
    
    public static ArrayList<String> realizarConsultaCasoUnico(String numeroExpediente) throws Exception
    {
        ArrayList<String> c = tcaso.hacerConsultaCaso(bd.conectar(),numeroExpediente);
        bd.desconectar();
        return c;
    }
    
    public static ArrayList<String> hacerConsultaDniAbogados() throws Exception
    {
        ArrayList<String> c = ta.hacerConsultaDniAbogados(bd.conectar());
        bd.desconectar();
        return c;
    }
}
