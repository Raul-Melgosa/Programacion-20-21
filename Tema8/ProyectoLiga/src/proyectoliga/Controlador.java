/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoliga;

import Vista.*;
import ModeloUML.*;
import ModeloBD.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    
    private static BaseDeDatos bd;
    private static TablaEquipos te;
    private static TablaJugadores tj;
    
    public static void main(String[] args) {
        bd=new BaseDeDatos();
        te=new TablaEquipos();
        tj=new TablaJugadores();
        PantallaInicio v1 = new PantallaInicio();
        v1.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        v1.setVisible(true);
    }
    
    public static void llenarComboBoxEquipos(javax.swing.JComboBox cbEquipos) throws Exception
    {
        ArrayList<Equipo> equipos = te.selectTodosEquipos(bd.conectar());
        bd.desconectar();
        for(int x=0;x<equipos.size();x++)
        {
            cbEquipos.addItem(equipos.get(x).getNombre());
        }
    }
    
    public static void hacerAltaEquipo(String nombre, String colores, String fecha,String presupuesto, String ciudad,String clasificacion) throws Exception
    {
        Equipo e = new Equipo(nombre,ciudad,LocalDate.parse(fecha),colores ,Integer.parseInt(presupuesto),Integer.parseInt(clasificacion));
        te.altaEquipo(bd.conectar(),e);
        //String nombre, String ciudad, LocalDate fechaFundacion, String colores, int presupuesto, int clasificacion
    }
    
    public static void hacerAltaJugador(String nombre, String apellidos, String dorsal,String posicion, String id,String equipo) throws Exception
    {
        Equipo e = te.selectEquipo(bd.conectar(),equipo);
        bd.desconectar();
        Jugador j = new Jugador(Integer.parseInt(id), nombre, apellidos, Integer.parseInt(dorsal), posicion, e);
        tj.altaJugador(bd.conectar(),j);
        bd.desconectar();
    }
    
    private static Equipo equipoActual;
    
    public static void buscarEquipo(String nombre) throws Exception
    {
        equipoActual = te.selectEquipo(bd.conectar(),nombre);
        
    }
    
    public static String getClasificacionEquipoActual() throws Exception
    {
        return equipoActual.getClasificacion()+"";
    }
    
    public static ArrayList<ArrayList<String>> getPlantillaEquipoActual() throws Exception
    {
        ArrayList<Jugador> datos=tj.buscarJugadoresEquipo(bd.conectar(),equipoActual.getNombre());
        bd.desconectar();
        ArrayList<ArrayList<String>> devolver = new ArrayList();
        for(int x=0; x<datos.size();x++)
        {
            ArrayList<String> jugador = new ArrayList();
            jugador.add(datos.get(x).getNombre());
            jugador.add(datos.get(x).getApellidos());
            jugador.add(datos.get(x).getDorsal()+"");
            jugador.add(datos.get(x).getPosicion());
            devolver.add(jugador);
        }
        return devolver;
    }
    
    public static String getFechaEquipoActual() throws Exception
    {
        LocalDate fechaDate = equipoActual.getFechaFundacion();
        String fecha = fechaDate.getDayOfMonth()+"/"+fechaDate.getMonthValue()+"/"+fechaDate.getYear();
        return fecha;
    }
    
    public static String getColoresEquipoActual() throws Exception
    {
        return equipoActual.getColores();
    }
    
    public static String getPresupuestoEquipoActual() throws Exception
    {
        return equipoActual.getPresupuesto()+"";
    }
    
    public static String getCiudadEquipoActual() throws Exception
    {
        return equipoActual.getCiudad();
    }
    
    public static void irPantallaEquipos(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaEquipos nuevo = new PantallaEquipos();
        nuevo.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        nuevo.setVisible(true);
    }
    
    public static void irPantallaPlantilla(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaPlantilla nuevo = new PantallaPlantilla();
        nuevo.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        nuevo.setVisible(true);
    }
    
    public static void irPantallaNuevoEquipo(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaNuevoEquipo nuevo = new PantallaNuevoEquipo();
        nuevo.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        nuevo.setVisible(true);
    }
    
    public static void irPantallaNuevoJugador(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaNuevoJugador nuevo = new PantallaNuevoJugador();
        nuevo.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        nuevo.setVisible(true);
    }
    
    public static void irPantallaInicio(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaInicio nuevo = new PantallaInicio();
        nuevo.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        nuevo.setVisible(true);
    }
    
    public static void salir()
    {
        System.exit(0);
    }
}
