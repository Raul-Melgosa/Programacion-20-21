/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7_practica1_ejercicio2;

import Modelo.Persona;
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
    
    private static ArrayList<Persona> listaPersonas = new ArrayList();
    
    private static V1 v1 = new V1();
    private static V2 v2 = new V2();
    
    public static void main(String[] args) {
        
        v1.setLocationRelativeTo(null);
        v2.setLocationRelativeTo(null);
        v1.setVisible(true);
    }
    
    public static void getDatos(String nombre, String apellidos, String dni)
    {
        Persona p1 = new Persona(nombre,apellidos,dni);
        listaPersonas.add(p1);
    }
    
    public static void devolverPersonas()
    {
        v1.setVisible(false);
        
        String devolver="";
        for(int x=0; x<listaPersonas.size();x++)
        {
            devolver += listaPersonas.get(x).toString() + "\n";
        }
        v2.colocarPersonasEnLista(devolver);
        v2.setVisible(true);
    }
    
    public static void Salir()
    {
        System.exit(0);
    }
    
}
