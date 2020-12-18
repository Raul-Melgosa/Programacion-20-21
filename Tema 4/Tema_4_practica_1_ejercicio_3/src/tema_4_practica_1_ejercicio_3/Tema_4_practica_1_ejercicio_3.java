/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_4_practica_1_ejercicio_3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Tema_4_practica_1_ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            char[] caracteres = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            String cadena="";
            int numeroCaracter;
            do{    
                numeroCaracter=pedirNumeroCaracter(caracteres);
                if(numeroCaracter>=0){
                    cadena=cadena+caracteres[numeroCaracter];
                }
            }
            while(numeroCaracter>=0);
            JOptionPane.showMessageDialog(null, cadena);
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "El número introducido debe estar entre el 0 y el 26 o ser -1 para finalizar");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error con " + e.getClass() + " en " + e.getMessage());
        }
        
    }
    
    public static int pedirNumeroCaracter(char[] caracteres) throws Exception{
        boolean error=true;
        int seleccion=-2;
        do{
            try{
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición del caracter a añadir a la cadena"));
            error=false;
            }
            catch (java.lang.NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Tu entrada no es válida");
            }
            catch (java.lang.ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "El número introducido debe estar entre el 0 y el 26 o ser -1 para finalizar");
            }
        }while(error);
        return seleccion;
    }
}
