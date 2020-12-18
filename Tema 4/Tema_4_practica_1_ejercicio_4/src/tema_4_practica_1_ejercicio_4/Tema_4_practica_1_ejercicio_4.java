/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_4_practica_1_ejercicio_4;

import javax.swing.JOptionPane;
import Excepciones.*;
/**
 *
 * @author 1GDAW09
 */
public class Tema_4_practica_1_ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean error=true;
        do{
            try{
                String[] meses = {"Enero", "Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
                String entrada=JOptionPane.showInputDialog("Introduce un mes en letra");
                int comprobar = comprobarEntradaCorrecta(meses, entrada);
                if(comprobar==1){
                    JOptionPane.showMessageDialog(null, "El mes introducido NO es válido");
                    throw new mesInvalido();
                }
                else{
                    JOptionPane.showMessageDialog(null, "El mes introducido SÍ es válido");
                }
                error=false;
            }
            catch(mesInvalido e){
                error=true;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "error con " + e.getClass() + " en " + e.getMessage());
                error=true;
            }
        }
        while(error);
    }
    
    public static int comprobarEntradaCorrecta(String[] meses, String entrada){
        int correcto=1;
        boolean encontrado=false;
        for(int x=0; x<meses.length && !encontrado; x++){
            if(entrada.equalsIgnoreCase(meses[x])){
                correcto=0;
            }
        }
        return correcto;
    }
}
