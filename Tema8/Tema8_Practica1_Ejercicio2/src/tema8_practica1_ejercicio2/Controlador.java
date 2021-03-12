/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8_practica1_ejercicio2;

import ModeloBD.*;
import ModeloUML.*;
import Vista.*;
import java.time.LocalDate;
import java.time.LocalTime;
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
    private static TablaEventos te = new TablaEventos();
    
    public static void main(String[] args) {
        VentanaPrincipal v1 = new VentanaPrincipal();
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
    }
    
    public static void insertarEvento (String nombre, String fecha, String horaInicio, String horaFin, String lugar, String numeroPersonas) throws Exception
    {
        bd.conectar();
        te.setCon(bd.getC());
        te.insertarEvento(new Evento(nombre, LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy")), LocalTime.parse(horaInicio), LocalTime.parse(horaFin), lugar, Integer.parseInt(numeroPersonas)));
        bd.desconectar();
    }
    
    public static void borrarEvento (String nombre) throws Exception
    {
        bd.conectar();
        te.setCon(bd.getC());
        te.eliminarEvento(nombre.toUpperCase());
        bd.desconectar();
    }
    
    public static ArrayList<String> pedirNombresEventos() throws Exception
    {
        bd.conectar();
        te.setCon(bd.getC());
        ArrayList<String> nombres = te.getNombres();
        bd.desconectar();
        return nombres;
    }
    
    public static ArrayList<String> consultarDatosEvento(String nombre) throws Exception
    {
        bd.conectar();
        te.setCon(bd.getC());
        ArrayList<String> nombres = te.getEvento(nombre);
        bd.desconectar();
        LocalDate fecha = LocalDate.parse(nombres.get(1));
        String fechaString = fecha.getDayOfMonth() + "-" + fecha.getMonthValue() + "-" + fecha.getYear();
        String fechaString2="";
        if(fechaString.charAt(1)=='-')
        {
            fechaString = "0"+fechaString;
            fechaString2=fechaString;
        }
        if(fechaString.charAt(4)=='-')
        {
            fechaString2="";
            for(int x=0; x<fechaString.length()+1;x++)
            {
                if(x<3)
                {
                    fechaString2+=fechaString.charAt(x);
                }
                if(x==3)
                {
                    fechaString2+="0";
                }
                if(x>3)
                {
                    fechaString2+=fechaString.charAt(x-1);
                }
            }
        }
        nombres.remove(1);
        nombres.add(1,fechaString2);
        return nombres;
    }
    
    public static void irVentanaAnnadir(javax.swing.JFrame antiguo)
    {
        antiguo.dispose();
        VentanaAnnadir nuevo = new VentanaAnnadir();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void irVentanaModificar(javax.swing.JFrame antiguo)
    {
        antiguo.dispose();
        VentanaModificar nuevo = new VentanaModificar();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void irVentanaBorrar(javax.swing.JFrame antiguo)
    {
        antiguo.dispose();
        VentanaBorrar nuevo = new VentanaBorrar();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void irVentanaBienvenida(javax.swing.JFrame antiguo)
    {
        antiguo.dispose();
        VentanaPrincipal nuevo = new VentanaPrincipal();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void salir()
    {
        System.exit(0);
    }
}
