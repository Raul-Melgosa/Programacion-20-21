/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8_practica1_ejercicio1;

import ModeloBaseDatos.*;
import ModeloUML.*;
import Vista.*;

/**
 *
 * @author 1GDAW09
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    private static BaseDatos bd;
    private static TablaPersonas tp;
    
    public static void main(String[] args) throws Exception {
        bd = new BaseDatos();
        bd.conectar();
        tp = new TablaPersonas(bd.getConnection());
        VentanaPrincipal p = new VentanaPrincipal();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
//        VentanaPrincipal p = new VentanaPrincipal();
//        p.setLocationRelativeTo(null);
//        p.setVisible(true);
    }
    
    public static boolean hacerAltaPersona(String nombre, String dni, String edad, String profesion, String telefono) throws Exception
    {
        Persona p = new Persona(nombre,dni,edad,profesion,telefono);
        boolean correcto=tp.insertar(p);
        return correcto;
    }
    
    public static Persona hacerSelectPersonaUnica(String dni) throws Exception
    {
        Persona p = tp.selectUnica(dni);
        return p;
    }
    private static String dniConsulta="";
    public static String[] pedirDatos() throws Exception
    {
        String[] p = new String[5];
        VentanaPedirDni pedirDni = new VentanaPedirDni();
        pedirDni.setLocationRelativeTo(null);
        pedirDni.setVisible(true);
        Persona per = hacerSelectPersonaUnica(dniConsulta);
        p[0]=per.getDni();
        p[1]=per.getNombre();
        p[2]=per.getEdad();
        p[3]=per.getProfesion();
        p[4]=per.getTelefono();
        return p;
    }
    
    public static void recibirDniConsulta(String dni)
    {
        dniConsulta=dni;
    }
    
    public static void irVentanaPersonasAlta(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        VentanaPersonas nuevo = new VentanaPersonas();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void irVentanaPersonasConsultaTodos(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        VentanaPersonasConsultaTodos nuevo = new VentanaPersonasConsultaTodos();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void irVentanaPersonasConsultaUno(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        VentanaPersonasConsultaUnica nuevo = new VentanaPersonasConsultaUnica();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
       
    public static void irVentanaPrincipal(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        VentanaPrincipal nuevo = new VentanaPrincipal();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void salir()
    {
        System.exit(0);
    }
}
