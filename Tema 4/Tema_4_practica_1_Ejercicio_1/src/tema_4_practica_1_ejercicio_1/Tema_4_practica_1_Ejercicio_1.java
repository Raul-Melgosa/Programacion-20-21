/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_4_practica_1_ejercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Tema_4_practica_1_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] numeros = new double[10];
        double mayor = numeros[0], menor = numeros[0];
        for (int x=0; x < numeros.length; x++){
            numeros[x]=Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
        }
        for (int y=0; y < numeros.length; y++){
            if(numeros[y] > mayor){
                mayor=numeros[y];
            }
            else{
                if (numeros[y] < menor){
                    menor=numeros[y];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El menor es " + menor + " y el mayor " + mayor);
    }
}
