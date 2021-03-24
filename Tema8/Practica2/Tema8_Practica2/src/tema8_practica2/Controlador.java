/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8_practica2;

import ModeloBD.*;
import ModeloUML.*;
import Vista.*;
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
}
