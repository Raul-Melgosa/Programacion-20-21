/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_4_practica_1_ejercicio_9;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Tema_4_practica_1_ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int[] codigosValidos = {10,23,30,47,55,65,135,256,526,663};
            int[] udsVendidas = new int[10];
            Arrays.fill(udsVendidas, 0);
            do{
                int codProducto = pedirCodProducto(codigosValidos);
                for(int y=0; y<udsVendidas.length; y++){
                    if(codProducto==codigosValidos[y]){
                        udsVendidas[y]+=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos con este código se han vendido?"));
                    }
                }
            }
            while(JOptionPane.showOptionDialog(null, "¿Quieres introducir más datos?", "¿Continuar?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí","No"}, "Sí")==0);
            String salida = ordenarDatos(codigosValidos, udsVendidas);
            JOptionPane.showMessageDialog(null, salida);
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error con la clase " + e.getClass() + " en " + e.getMessage());
        }
    }
    
    public static String ordenarDatos(int[] codigosValidos, int[] udsVendidas){
        int auxiliar;
        for(int x=0; x<udsVendidas.length-1; x++){
            for( int y=0; y<udsVendidas.length; y++){
                if(udsVendidas[x] < udsVendidas[y]){
                    auxiliar = udsVendidas[x];
                    udsVendidas[x] = udsVendidas[y];
                    udsVendidas[y] = auxiliar;
                    
                    auxiliar = codigosValidos[x];
                    codigosValidos[x] = codigosValidos[y];
                    codigosValidos[y] = auxiliar;
                }
            }
        }
        String salida="";
        for(int a=0; a<udsVendidas.length; a++){
            if(udsVendidas[a]!=0){
                salida+= "Se han vendido " + udsVendidas[a] + " unidades del producto " + codigosValidos[a] + "\n";
            }
        }
        return salida;
    }
    
    public static int pedirCodProducto(int[] codigosValidos) throws Exception {
        boolean errorFuncion=true;
        int codProducto=0;
        do{
            try{
                boolean error=true;
                while(error){
                    codProducto=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el código del producto"));
                    error = comprobarCodCorrecto(codProducto, codigosValidos);
                    errorFuncion=false;
                }
            }
            catch(java.lang.NumberFormatException e){
                JOptionPane.showMessageDialog(null, "No puedes dejar el código sin introducir, además debe ser un código de digitos numéricos");
            }
        }
        while(errorFuncion);
            return codProducto;
    }

    public static boolean comprobarCodCorrecto(int codProducto, int[] codigosValidos){
        boolean incorrecto=true;
        int x=0;
        for(x=0; x<codigosValidos.length; x++){
            if(codProducto==codigosValidos[x]){
                incorrecto=false;
            }
        }
        return incorrecto;
    }
    
}
