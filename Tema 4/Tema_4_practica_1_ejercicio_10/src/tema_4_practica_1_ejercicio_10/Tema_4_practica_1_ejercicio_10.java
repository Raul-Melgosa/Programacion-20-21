/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_4_practica_1_ejercicio_10;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Tema_4_practica_1_ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    private static double[][] matriz = new double[4][4];
    private static int rellenada = 0, repetir=0;;
    
    public static void main(String[] args) {
        boolean error=true;
            do{
                try{
                    int eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                            "¿Cuál de las siguientes operaciones deseas realizar?\n"
                            + "1.- Rellenar la matriz de los números que vayas indicando\n"
                            + "2.- Sumar una fila que indiques\n"
                            + "3.- Sumar una columna que indiques\n"
                            + "4.- Sumar la diagonal principal\n"
                            + "5.- Sumar la diagonal inversa\n"
                            + "6.- Media de los valores de la matriz\n"
                            + "7.- Salir\n"));
                    switch(eleccion){
                        case 1:
                            error=false;
                            rellenarMatriz();
                            break;
                        case 2:
                            error=false;
                            sumarFila();
                            break;
                        case 3:
                            error=false;
                            sumarColumna();
                            break;
                        case 4:
                            error=false;
                            sumarDiagonalPrincipal();
                            break;
                        case 5:
                            error=false;
                            sumarDiagonalInversa();
                        case 6:
                            error=false;
                            mediaMatriz();
                            break;
                        case 7:
                            error=false;
                            Salir();
                            break;
                        default:
                            error=true;
                            break;
                    }
                }
                catch(java.lang.NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Debes introducir un núnmero del 1 al 7");
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error con la clase " + e.getClass() + " con el mensaje " + e.getMessage());
                }
            }
            while(error || repetir==0);
    }
    
    
    
    
    public static void rellenarMatriz() throws Exception{
        boolean error=true;
        do{
            try{
                for(int x=0; x<matriz.length; x++){
                    for(int y=0; y<matriz[x].length; y++){
                        matriz[x][y]=Double.parseDouble(JOptionPane.showInputDialog("Introduce el número situado en la "+ (y+1) +" posición en la " + (x+1) + " fila"));
                    }
                }
                JOptionPane.showMessageDialog(null,"Esta es tu matriz:\n" + 
                        matriz[0][0] + " | " + matriz[0][1] + " | " + matriz[0][2] + " | " + matriz[0][3] + "\n" +
                        matriz[1][0] + " | " + matriz[1][1] + " | " + matriz[1][2] + " | " + matriz[1][3] + "\n" +
                        matriz[2][0] + " | " + matriz[2][1] + " | " + matriz[2][2] + " | " + matriz[2][3] + "\n" +
                        matriz[3][0] + " | " + matriz[3][1] + " | " + matriz[3][2] + " | " + matriz[3][3]);
                rellenada=1;
                error=false;
                repetir = 0;
            }
            catch(java.lang.NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Debes introducir números enteros o decimales");
            }
        }
        while (error);
    }
    
    
    
    
    public static void sumarFila() throws Exception{
        if(rellenada==0){
            JOptionPane.showMessageDialog(null, "Tu matriz aún está vacía, rellénala y podremos sumar las filas");
            rellenarMatriz();
        }
        int nFila = Integer.parseInt(JOptionPane.showInputDialog("¿Qué fila quieres sumar?"));
        double suma=0;
        for(int x=0; x<matriz[nFila-1].length; x++){
            suma += matriz[nFila-1][x];
        }
        JOptionPane.showMessageDialog(null, "El resultado es: " + suma);
        repetir = JOptionPane.showOptionDialog(null, "¿Quieres repetir la ejecución del programa?", "Repetir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object []{"SÍ","NO"}, "SÍ");
    }
    
    
    
    
    public static void sumarColumna() throws Exception{
        if(rellenada==0){
            JOptionPane.showMessageDialog(null, "Tu matriz aún está vacía, rellénala y podremos sumar las filas");
            rellenarMatriz();
        }
        int nColumna = Integer.parseInt(JOptionPane.showInputDialog("¿Qué columna quieres sumar?"));
        double suma=0;
        for(int x=0; x<matriz.length; x++){
            suma += matriz[x][nColumna-1];
        }
        JOptionPane.showMessageDialog(null, "El resultado es: " + suma);
        repetir = JOptionPane.showOptionDialog(null, "¿Quieres repetir la ejecución del programa?", "Repetir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object []{"SÍ","NO"}, "SÍ");
    }
    
    
    
    
    public static void sumarDiagonalPrincipal() throws Exception{
    if(rellenada==0){
            JOptionPane.showMessageDialog(null, "Tu matriz aún está vacía, rellénala y podremos sumar las filas");
            rellenarMatriz();
        }
    double suma=0;
        for(int x=0; x<matriz.length; x++){
            suma += matriz[x][x];
        }
        JOptionPane.showMessageDialog(null, "El resultado es: " + suma);
        repetir = JOptionPane.showOptionDialog(null, "¿Quieres repetir la ejecución del programa?", "Repetir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object []{"SÍ","NO"}, "SÍ");
    }
    
    
    
    
    public static void sumarDiagonalInversa() throws Exception{
        if(rellenada==0){
            JOptionPane.showMessageDialog(null, "Tu matriz aún está vacía, rellénala y podremos sumar las filas");
            rellenarMatriz();
        }
    double suma=0;
        for(int x=0; x<matriz.length; x++){
            int y = matriz.length-x-1;
            suma += matriz[x][y];
        }
        JOptionPane.showMessageDialog(null, "El resultado es: " + suma);
        repetir = JOptionPane.showOptionDialog(null, "¿Quieres repetir la ejecución del programa?", "Repetir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object []{"SÍ","NO"}, "SÍ");
    }
    
    
    
    
    public static void mediaMatriz() throws Exception{
        if(rellenada==0){
            JOptionPane.showMessageDialog(null, "Tu matriz aún está vacía, rellénala y podremos sumar las filas");
            rellenarMatriz();
        }
    double suma=0;
    double media=0;
        for(int x=0; x<matriz.length; x++){
            for(int y=0; y<matriz[x].length; y++){
                suma += matriz[x][y];
            }
        }
        media = suma/(matriz.length*matriz[0].length);
        JOptionPane.showMessageDialog(null, "El resultado es: " + media);
        repetir = JOptionPane.showOptionDialog(null, "¿Quieres repetir la ejecución del programa?", "Repetir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object []{"SÍ","NO"}, "SÍ");
    }
    
    
    
    public static void Salir() throws Exception{
        repetir = 1;
    }
    
}
