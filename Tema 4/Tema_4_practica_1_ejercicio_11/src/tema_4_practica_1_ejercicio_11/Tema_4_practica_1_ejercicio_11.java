/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_4_practica_1_ejercicio_11;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Tema_4_practica_1_ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    private static int repetir=0;
    private static String[][] productos = new String[4][4];
    private static float[][] precios = new float[4][4];
    private static int[][] stock = new int[4][4];
    private static int[][] ventas = new int [4][4];
    
    public static void inicializarProductos() {
        productos[0][0]="Kit Kat";              productos[0][1]="Chicles de fresa";         productos[0][2]="Lacasitos negros";     productos[0][3]="Palotes";
        productos[1][0]="Kinder Bueno blanco";  productos[1][1]="Bolsa variada Haribo";     productos[1][2]="Cheetos";              productos[1][3]="Twix";
        productos[2][0]="Kinder Bueno negro";   productos[2][1]="M&M";                      productos[2][2]="Papa Delta";           productos[2][3]="Chicles de menta";
        productos[3][0]="Lacasitos variados";   productos[3][1]="Crunch";                   productos[3][2]="Milkybar";             productos[3][3]="KitKat negro";
    }
    
    public static void inicializarPrecios() {
        precios[0][0]=1.1f;    precios[0][1]=0.8f;    precios[0][2]=1.5f;    precios[0][3]=0.9f;
        precios[1][0]=1.8f;    precios[1][1]=1.0f;    precios[1][2]=1.2f;    precios[1][3]=1.0f;
        precios[2][0]=1.8f;    precios[2][1]=1.3f;    precios[2][2]=1.2f;    precios[2][3]=0.8f;
        precios[3][0]=1.5f;    precios[3][1]=1.1f;    precios[3][2]=1.1f;    precios[3][3]=1.1f;
        
    }
    
    public static void inicializarStockVentas() {
        for(int x=0; x<stock.length; x++){
            for(int y=0; y<stock.length; y++){
                stock[x][y]=5;
                ventas[x][y]=0;
            }
        }
    }
    
    public static void main(String[] args) {
        boolean error=true;
        inicializarStockVentas();
        inicializarProductos();
        inicializarPrecios();
            do{
                try{
                    int eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                            "¿Cuál de las siguientes operaciones deseas realizar?\n"
                            + "1.- Ver el catálogo de la máquina\n"
                            + "2.- Pedir una golosina\n"
                            + "3.- Rellenar la máquina\n"
                            + "4.- Apagar la máquina\n"));
                    switch(eleccion){
                        case 1:
                            error=false;
                            mostrarGolosina();
                            break;
                        case 2:
                            error=false;
                            pedirGolosina();
                            break;
                        case 3:
                            error=false;
                            rellenarGolosinas();
                            break;
                        case 4:
                            error=false;
                            apagarMaquina();
                            break;
                        default:
                            error=true;
                            break;
                    }
                }
                catch(java.lang.NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Debes introducir un núnmero del 1 al 4");
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error con la clase " + e.getClass() + " con el mensaje " + e.getMessage());
                }
            }
            while(error || repetir==0);
    }
    
    public static void mostrarGolosina() {
        String salida="";
        for(int x=0; x<productos.length; x++){
            for(int y=0; y<productos[x].length; y++)
            {
                salida += x + "" + y + " .- " + productos[x][y] + "  -  " + precios[x][y] + " €" + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, salida);
    }
    
    public static void pedirGolosina() {
        boolean error=true;
        do{
            try{
                String eleccionString = JOptionPane.showInputDialog("¿Qué producto quieres? (Introduce el código)");
                if(eleccionString.length()>2)
                {
                    throw new java.lang.StringIndexOutOfBoundsException();
                }
                int x = Integer.parseInt(""+eleccionString.charAt(0));
                int y = Integer.parseInt(""+eleccionString.charAt(1));
                if(stock[x][y]>0){
                    String salida = "El producto elegido es: " + productos[x][y] + " que tiene un precio de " + precios [x][y] + " €";
                    stock[x][y]--;
                    JOptionPane.showMessageDialog(null, salida);
                    ventas[x][y]++;
                    error=false;
                }
                else{
                    JOptionPane.showMessageDialog(null, "No queda stock del producto solicitado, elija otro");
                    error=true;
                }
            }
            catch(java.lang.StringIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "El código debe ser de dos dígitos");
            }
            catch(java.lang.ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "Ese código no es válido");
            }
        }
        while(error);
    }
    
    public static void rellenarGolosinas() {
        boolean error=true;
        do
        {
            try
            {
                if(JOptionPane.showInputDialog("Introduzca la contraseña").compareTo("MaquinaExpendedora2020")==0)
                {
                    JOptionPane.showMessageDialog(null, "Contraseña correcta");
                    String eleccionString = JOptionPane.showInputDialog("¿Que producto vamos a rellenar? (codigo)");
                    int x = Integer.parseInt(""+eleccionString.charAt(0));
                    int y = Integer.parseInt(""+eleccionString.charAt(1));
                    int sumando1 = stock[x][y];
                    int sumar = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos vas a reponer?"));
                    stock[x][y]=sumar + sumando1;
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                }
                error=false;
            }
            catch(java.lang.ArrayIndexOutOfBoundsException e)
            {
                JOptionPane.showMessageDialog(null, "Codigo no valido");
            }
        }
        while(error);
    }
        
    public static void apagarMaquina() {
        String salida="";
        for(int x=0; x<ventas.length; x++)
        {
            for(int y=0; y<ventas.length; y++)
            {
                if(ventas[x][y]!=0)
                {
                    salida += "Producto.-  " + productos[x][y] + " - unidades vendidas: " + ventas[x][y] + " - beneficio generado: " + (ventas[x][y]*precios[x][y] + " €\n");
                }
            }
        }
        if(salida.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "No ha habido ventas");
        }
        else
        {
            JOptionPane.showMessageDialog(null, salida);
        }
        repetir=1;        
    }
}
