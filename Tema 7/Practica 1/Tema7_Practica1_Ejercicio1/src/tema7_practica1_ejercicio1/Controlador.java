/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7_practica1_ejercicio1;

import Vista.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        V1 v1 = new V1();
        v1.setLocationRelativeTo(null);
        
        v1.setVisible(true);
    }
    
    public static String generarNumero()
    {
        int i1 = (int)Math.round(Math.random()*1000);
        String a = ""+i1;
        return a;
    }
    
    public static boolean recibirDatos(int i1, int i2)
    {
        boolean acierto;
        System.out.println(i1+i2);
        int guess = Integer.parseInt(JOptionPane.showInputDialog("Introdue el resultado"));
        if(guess==(i1+i2))
        {
            acierto = true;
        }
        else
        {
            acierto = false;
        }
        return acierto;
    }
    
    public static void salir()
    {
        System.exit(0);
    }
    
}
