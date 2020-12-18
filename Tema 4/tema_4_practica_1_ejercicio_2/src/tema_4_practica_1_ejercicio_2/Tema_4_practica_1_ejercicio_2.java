/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_4_practica_1_ejercicio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Tema_4_practica_1_ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String salida="";
            long suma=0;
            int y;
            int x = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de números que se genererán"));
            long[] numeros = new long [x];
            for (y = 0 ; y < numeros.length ; y++){
                numeros[y] = (long)(Math.random()*10);
                
                System.out.println(numeros[y]);
                suma = suma+numeros[y];
            }
            for (y=0;y<numeros.length;y++){
                salida = salida + "En la posición " + y + " está el valor " + numeros[y] + "\n";
            }
            salida = salida + "Y la suma del total de los números es " + suma;
            JOptionPane.showMessageDialog(null, salida);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error con " + e.getClass() + " en " + e.getMessage());
        }
    }   
}
