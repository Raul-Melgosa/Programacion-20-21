/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_4_practica_1_ejercicio_6;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Tema_4_practica_1_ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    private static int x;
    
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Introduce tu entrada de texto").toLowerCase();
        String[] entradaArray = new String[entrada.length()];
        boolean repetir=true;
        String salida = "";
        
        for(int y=0;y<entrada.length();y++){
            String intermediario="";
            intermediario = intermediario + entrada.charAt(y);
            entradaArray[y]=intermediario;
        }
        Arrays.sort(entradaArray);
        x=1;
        do{
            int repetidos = contarRepetidos(entradaArray);
            if(!Character.isDigit(entradaArray[x-1].charAt(0))){
                if(Character.isLetter(entradaArray[x-1].charAt(0))){
                    salida = salida + "El número de letras " + entradaArray[x-1] + " es " + repetidos + "\n";
                }
            }
            if (x<entradaArray.length){
                x++;
                repetir=true;
            }
            else{
                repetir=false;
            }
        }while(repetir);
        JOptionPane.showMessageDialog(null, salida);
    }
    
    public static int contarRepetidos(String[] entradaArray){
        int contador = 1;
        for (x=x; x<entradaArray.length && entradaArray[x].equalsIgnoreCase(entradaArray[x-1]);x++){
            if(!Character.isDigit(entradaArray[x].charAt(0))){
                contador++;
            }
        }
        return contador;
    }
}
