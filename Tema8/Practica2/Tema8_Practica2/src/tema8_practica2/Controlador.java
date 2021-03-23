/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8_practica2;

import ModeloBD.*;
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
    private static BaseDeDatos bd = new BaseDeDatos();
    
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
    
    public static void irpantallaClientes(String tipo, javax.swing.JFrame anterior)
    {
        anterior.dispose();
        PantallaClientes nuevo;
        int a=0;
        int b=0;
        int c=0;
        switch(tipo)
        {
            case "alta":
                nuevo=new PantallaClientes();
                nuevo.setLocationRelativeTo(null);
                nuevo.setVisible(true);
                break;
            case "baja":
                nuevo=new PantallaClientes(a);
                nuevo.setLocationRelativeTo(null);
                nuevo.setVisible(true);
                break;
            case "modificacion":
                nuevo=new PantallaClientes(a,b);
                nuevo.setLocationRelativeTo(null);
                nuevo.setVisible(true);
                break;
            case "consulta":
                nuevo=new PantallaClientes(a,b,c);
                nuevo.setLocationRelativeTo(null);
                nuevo.setVisible(true);
                break;
            default:
                break;
        }
        
    }
    
    public static void salir()
    {
        System.exit(0);
    }
}
