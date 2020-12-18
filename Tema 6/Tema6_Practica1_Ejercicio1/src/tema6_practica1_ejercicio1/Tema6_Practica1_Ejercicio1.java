/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_practica1_ejercicio1;

import Clases.Circunferencia;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Tema6_Practica1_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean error=false;
        Circunferencia circunferencia = new Circunferencia(Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio de la circunferencia")));
        do
        {
            int eleccion = Integer.parseInt(JOptionPane.showInputDialog("Elige una de las siguientes opciones:\n"
                    + "1.- Calcular longitud de la circunferencia\n"
                    + "2.- Calcular área de la circunferencia\n"
                    + "3.- Calcular volumen de la esfera correspondiente"));
            switch(eleccion)
            {
                case 1:
                    JOptionPane.showMessageDialog(null, circunferencia.calcularLongitud());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, circunferencia.calcularArea());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, circunferencia.calcularVolumenEsfera());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, elige una opción válida");
                    error=true;
                    break;
            }
        }while(error);
    }
    
}
