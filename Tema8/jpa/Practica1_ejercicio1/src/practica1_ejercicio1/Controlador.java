/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_ejercicio1;

import ModeloDB.PersonaJpaController;
import ModeloUML.Persona;
import Vista.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;

/**
 *
 * @author 1GDAW09
 */
public class Controlador {

    private static PersonaJpaController personadb;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            personadb = new PersonaJpaController(Persistence.createEntityManagerFactory("BaseDeDatos"));
            VentanaPrincipal v1 = new VentanaPrincipal();
            v1.setLocationRelativeTo(null);
            v1.setVisible(true);
        }
        catch(Exception e)
        {
            
        }
    }
    
    public static void hacerAltaPersona(String dni, String nombre, String edad, String profesion, String telefono) throws Exception
    {
        personadb.create(new Persona(dni,nombre,edad,profesion,telefono));
    }
    
    public static ArrayList<String> hacerConsultaPersona(String dni) throws Exception
    {
        Persona p=personadb.findPersona(dni);
        ArrayList<String> per = new ArrayList();
        per.add(p.getDni());
        per.add(p.getNombre());
        per.add(p.getEdad());
        per.add(p.getProfesion());
        per.add(p.getTelefono());
        return per;
    }
    
    public static ArrayList<ArrayList<String>> hacerConsultaTodasPersonas() throws Exception
    {
        List<Persona> a = personadb.findPersonaEntities();
        ArrayList<ArrayList<String>> datos=new ArrayList();
        for(int x=0;x<a.size();x++)
        {
            datos.add(new ArrayList());
            datos.get(x).add(a.get(x).getDni());
            datos.get(x).add(a.get(x).getNombre());
            datos.get(x).add(a.get(x).getEdad());
            datos.get(x).add(a.get(x).getProfesion());
            datos.get(x).add(a.get(x).getTelefono());
        }
        return datos;
    }
    
    public static void irVentanaPrincipal(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        VentanaPrincipal nuevo = new VentanaPrincipal();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void irVentanaAlta(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        VentanaAlta nuevo = new VentanaAlta();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void irVentanaConsultaUnica(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        VentanaConsultaUnica nuevo = new VentanaConsultaUnica();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void irVentanaConsultaTodos(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        VentanaConsultaTodos nuevo = new VentanaConsultaTodos();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void salir()
    {
        System.exit(0);
    }
}
