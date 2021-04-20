/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_ejercicio2;

import Excepciones.*;
import ModeloDB.*;
import ModeloUML.*;
import Vista.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;

/**
 *
 * @author 1GDAW09
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    private static EmpresaJpaController empresaBD;
    private static EventoJpaController eventoBD;
    private static PersonaJpaController personaBD;
    
    public static void main(String[] args) {
        try
        {
            empresaBD = new EmpresaJpaController(Persistence.createEntityManagerFactory("BaseDeDatos"));
            eventoBD = new EventoJpaController(Persistence.createEntityManagerFactory("BaseDeDatos"));
            personaBD = new PersonaJpaController(Persistence.createEntityManagerFactory("BaseDeDatos"));
            VentanaPrincipal v1 = new VentanaPrincipal();
            v1.setLocationRelativeTo(null);
            v1.setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println(e.getClass());
        }
    }
    
    public static void hacerAltaEvento(String nombre, String fechaString, String horaInicioString, String horaFinString, String lugar, String aforo) throws Exception
    {
        Evento e = crearEvento(nombre, fechaString, horaInicioString, horaFinString, lugar, aforo);
        eventoBD.create(e);
    }
    
    public static ArrayList<String> pedirDatosEvento(String nombre)
    {
        Evento e = eventoBD.findEvento(nombre);
        
        LocalDate fecha=e.getFecha().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalTime horaInicio=e.getHoraInicio().toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        LocalTime horaFin=e.getHoraFin().toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        
        ArrayList<String> datos = new ArrayList();
        datos.add(fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        datos.add(horaInicio.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        datos.add(horaFin.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        datos.add(e.getLugar());
        datos.add(e.getNumeroPersonas()+"");
        return datos;
    }
    
    private static Evento crearEvento(String nombre, String fechaString, String horaInicioString, String horaFinString, String lugar, String aforo)
    {
        LocalDate fechaLocalDate = LocalDate.parse(fechaString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Time horaInicio = Time.valueOf(LocalTime.parse(horaInicioString, DateTimeFormatter.ofPattern("HH:mm")));
        Time horaFin = Time.valueOf(LocalTime.parse(horaFinString, DateTimeFormatter.ofPattern("HH:mm")));
        Evento e = new Evento(nombre, Date.valueOf(fechaLocalDate), horaInicio, horaFin, lugar, Integer.parseInt(aforo));
        e.setPersonaList(new ArrayList<Persona>());
        return e;
    }
    
    public static void editarEvento(String nombre, String fechaString, String horaInicioString, String horaFinString, String lugar, String aforo) throws Exception
    {
        Evento e = crearEvento(nombre, fechaString, horaInicioString, horaFinString, lugar, aforo);
        eventoBD.edit(e);
    }
    
    public static void eliminarEvento(String nombre) throws Exception
    {
        eventoBD.destroy(nombre);
    }
    
    public static ArrayList<String> buscarPersona(String dni) throws Exception
    {
        Persona p = personaBD.findPersona(dni);
        ArrayList<String> datos = new ArrayList();
        datos.add(p.getNombre());
        datos.add(p.getApellidos());
        datos.add(p.getTelefono());
        datos.add(p.getNif().getNif());
        datos.add(p.getNif().getNombre());
        return datos;
    }
    
    public static String buscarEmpresa(String nif) throws Exception
    {
        Empresa e = empresaBD.findEmpresa(nif);
        return e.getNombre();
    }
    
    public static void hacerAltaEmpresa(String nif, String nombre) throws Exception
    {
        Empresa e = new Empresa(nif, nombre);
        empresaBD.create(e);
    }
    
    public static void hacerAltaPersona(String dni, String nombre, String apellidos, String numeroTelefono, String nif, String nombreEmpresa) throws Exception
    {
        Empresa e = new Empresa(nif, nombreEmpresa);
        Persona p = new Persona(dni, nombre, apellidos, numeroTelefono);
        p.setNif(e);
        personaBD.create(p);
    }
    
    public static void agregarPersonaEvento(String dni, String nombreEvento) throws Exception
    {
        Evento e = eventoBD.findEvento(nombreEvento);
        Persona p = personaBD.findPersona(dni);
        if(e.getPersonaList().size()==e.getNumeroPersonas())
        {
            throw new eventoCompletoException();
        }
        for(int x=0; x<e.getPersonaList().size();x++)
        {
            if(e.getPersonaList().get(x).getDni().equalsIgnoreCase(p.getDni()))
            {
                throw new PersonaRepetidaException();
            }
        }
        
        e.getPersonaList().add(p);
        p.getEventoList().add(e);
        eventoBD.edit(e);
        personaBD.edit(p);
    }
    
    public static void rellenarComboBox(javax.swing.JComboBox combo)
    {
        List<Evento> a = eventoBD.findEventoEntities();
        for(int x=0; x<a.size();x++)
        {
            combo.addItem(a.get(x).getNombre());
        }
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
    
    public static void irVentanaApuntarse(javax.swing.JFrame antiguo)
    {
        antiguo.dispose();
        VentanaApuntarse nuevo = new VentanaApuntarse();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void salir()
    {
        System.exit(0);
    }
    
}
