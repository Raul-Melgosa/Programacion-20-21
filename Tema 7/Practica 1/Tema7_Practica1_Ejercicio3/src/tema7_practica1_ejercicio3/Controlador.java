/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7_practica1_ejercicio3;

import Modelo.*;
import Vista.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 1GDAW09
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    
    private static V1 v1 = new V1();
    private static V2 v2 = new V2();
    private static ArrayList<Persona> listaPersonas = new ArrayList();
    private static ArrayList<Curso> listaCursos = new ArrayList();
    private static int numeroPersona;
    
    public static void main(String[] args) {
        listaCursos.add(new Curso("1A"));listaCursos.add(new Curso("2A"));listaCursos.add(new Curso("3A"));listaCursos.add(new Curso("4A"));
        listaCursos.add(new Curso("1B"));listaCursos.add(new Curso("2B"));listaCursos.add(new Curso("3B"));listaCursos.add(new Curso("4B"));
        listaCursos.add(new Curso("1C"));listaCursos.add(new Curso("2C"));listaCursos.add(new Curso("3C"));listaCursos.add(new Curso("4C"));
        listaCursos.add(new Curso("1D"));listaCursos.add(new Curso("2D"));listaCursos.add(new Curso("3D"));listaCursos.add(new Curso("4D"));
        v1.setLocationRelativeTo(null);
        v2.setLocationRelativeTo(null);
        v1.setVisible(true);
    }
    
    public static void getDatos(String nombre, String apellidos, String dni, String curso)
    {
        int numeroCurso=0;
        for(int x=0; x<listaCursos.size() && !listaCursos.get(x).getCurso().equals(curso); x++)
        {
            numeroCurso++;
        }
        
        if(!listaPersonas.isEmpty())
        {
            for(int x=0; x<listaPersonas.size();x++)
            {
                if(listaPersonas.get(x).getDni().equalsIgnoreCase(dni))
                {
                    numeroPersona = x;
                    v2.ponerDatos(nombre, apellidos, dni, curso);
                    cambiarPantalla();
                }
                else
                {
                    listaPersonas.add(new Persona(nombre,apellidos,dni,listaCursos.get(numeroCurso)));
                }
            }
        }
        else
        {
            listaPersonas.add(new Persona(nombre,apellidos,dni,listaCursos.get(numeroCurso)));
        }
    }
    
    public static void cambiarPantalla()
    {
        if(v1.isVisible())
        {
            v1.setVisible(false);
            v2.setVisible(true);
        }
        else
        {
            v2.setVisible(false);
            v1.setVisible(true);
        }
    }
    
    public static void cambioDatos(String cambiar, String nuevoDato)
    {
        switch (cambiar)
        {
            case "nombre":
                listaPersonas.get(numeroPersona).setNombre(nuevoDato);
                break;
            case "apellidos":
                listaPersonas.get(numeroPersona).setApellidos(nuevoDato);
                break;
            case "dni":
                listaPersonas.get(numeroPersona).setDni(nuevoDato);
                break;
            case "curso":
                int numeroCurso=0;
                for(int x=0; x<listaCursos.size() && !listaCursos.get(x).getCurso().equals(nuevoDato); x++)
                {
                    numeroCurso++;
                }
                listaPersonas.get(numeroPersona).setCurso(listaCursos.get(numeroCurso));
        }
    }
    
    public static void borrarPersona(String dni)
    {
        int x=0;
        for(x=0; x<listaPersonas.size() && !listaPersonas.get(x).getDni().equals(dni);x++);
        listaPersonas.remove(x);
    }
    
    public static void Salir()
    {
        System.exit(0);
    }
}
