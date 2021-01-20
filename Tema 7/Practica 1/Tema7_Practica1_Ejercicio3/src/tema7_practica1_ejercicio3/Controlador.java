/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7_practica1_ejercicio3;

import Modelo.*;
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
    
    private static V1 v1 = new V1();
    private static V2 v2 = new V2();
    private static ArrayList<Persona> listaPersonas = new ArrayList();
    
    public static void main(String[] args) {
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
    }
    
    public static void getDatos(String nombre, String apellidos, String dni, String curso)
    {
        for(int x=0 ; x<listaPersonas.size() ; x++)
        {
            if(!listaPersonas.get(x).getDni().equalsIgnoreCase(dni))
            {
                System.out.println("dni distinto");
                listaPersonas.add(new Persona(nombre, apellidos, dni, curso));
            }
            else
            {
                v1.setVisible(false);
            }
        }
    }
    
    public static void Salir()
    {
        System.exit(0);
    }
}
