/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05_practica01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Tema05_Practica01 {
    
    private static ArrayList <Double> valores = new ArrayList();
    private static boolean repetir=true;
    
    public static void main(String[] args)
    {
        secuenciaInicial();
        boolean error=true;
        do{
            try
            {
                do
                {
                    int eleccion = mostrarMenu();
                    switch (eleccion)
                    {
                        case 1:
                            maximoMinimo();
                            error=false;
                            break;
                        case 2:
                            buscarNro();
                            error=false;
                            break;
                        case 3:
                            borrarNro();
                            error=false;
                            break;
                        case 4:
                            convertirArray();
                            error=false;
                            break;
                        case 5:
                            mostrarNroElementos();
                            error=false;
                            break;
                        case 6:
                            insertarFinal();
                            error=false;
                            break;
                        case 7:
                            insertarPosicion();
                            error=false;
                            break;
                        case 8:
                            borrarPosicion();
                            error=false;
                            break;
                        case 9:
                            sumaMedia();
                            error=false;
                            break;
                        case 10:
                            finalizar();
                            error=false;
                            break;
                        default:
                            error=true;
                    }
                }
                while(repetir);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Problemas con " + e.getClass() + " en " + e.getMessage());
                error=true;
            }
        }
        while(error);
    }
    
    
    public static void secuenciaInicial()
    {
        boolean error;
        do
        {
            try
             {
                 int continuar = 0;
                 while(continuar==0)
                 {
                     valores.add(Double.parseDouble(JOptionPane.showInputDialog("Introduce un valor")));
                     continuar = JOptionPane.showOptionDialog(null, "¿Quieres continuar?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí","No"}, "Sí");
                 }
                 error=false;
             } 
            catch (java.lang.NullPointerException | java.lang.NumberFormatException e)
            {
                 JOptionPane.showMessageDialog(null, "No puedes cancelar la introducción de datos ni tampoco introducir un dato no numérico");
                 error=true;
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Problemas con " + e.getClass() + " en " + e.getMessage());
                error=true;
            } 
        }
        while(error);        
    }
    
    
    public static int mostrarMenu() throws Exception
    {
        int eleccion;
        eleccion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:" + "\n"
                + "1.- Ver el valor máximo y mínimo" + "\n"
                + "2.- Buscar un valor" + "\n"
                + "3.- Borrar un número" + "\n"
                + "4.- Convertir el ArrayList en un Array" + "\n"
                + "5.- Mostrar el número de elementos" + "\n"
                + "6.- Insertar un nuevo elemento al final" + "\n"
                + "7.- Insertar un nuevo elemento en una posición a elegir" + "\n"
                + "8.- Borrar una posición en concreto" + "\n"
                + "9.- Calcular la suma y la media de todos los valores" +"\n"
                + "10.- Finalizar"));
        return eleccion;
    }

    public static void maximoMinimo() throws Exception
    {
        Double mayor = valores.get(0), menor = valores.get(0);
        for(int x=0; x<valores.size(); x++)
        {
            if(valores.get(x)>mayor)
            {
                mayor = valores.get(x);
            }
            if(valores.get(x)<menor)
            {
                menor = valores.get(x);
            }
        }
        JOptionPane.showMessageDialog(null, "El mayor es " + mayor + "\n" + "El menor es " + menor);
    }
    
    
    public static void buscarNro() throws Exception
    {
        Double numero = Double.parseDouble(JOptionPane.showInputDialog("¿Qué número quieres buscar?"));
        boolean encontrado = valores.contains(numero);
        if(encontrado==true)
        {
            JOptionPane.showMessageDialog(null, "El número que buscabas sí se ha podido encontrar");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el numero introducido");
        }
    }
    
    
    public static void borrarNro() throws Exception
    {
        Double numero = Double.parseDouble(JOptionPane.showInputDialog("¿Qué número quieres borrar?"));
        boolean encontrado = valores.contains(numero);
        if(encontrado==true)
        {
            valores.remove(numero);
            JOptionPane.showMessageDialog(null, "Número borrado con éxito");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se puede borrar el numero introducido porque no se ha encontrado");
        }
    }
    
    
    public static void convertirArray() throws Exception
    {
        Double[] valoresArray = new Double[valores.size()];
        valores.toArray(valoresArray);
    }
    
    
    public static void mostrarNroElementos() throws Exception
    {
        if(!valores.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Hay un total de " + valores.size() + "elementos");
        }
    }
    
    
    public static void insertarFinal() throws Exception
    {
        valores.add(Double.parseDouble(JOptionPane.showInputDialog("¿Qué valor quieres añadir?")));
    }
    
    
    public static void insertarPosicion() throws Exception
    {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("¿Qué valor quieres añadir?"));
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("¿En qué posición quieres introducir el nuevo valor?"))-1;
        if(posicion > valores.size())
        {
            JOptionPane.showMessageDialog(null, "No se puede introducir el valor introducido porque la posición no es correcta");
        }
        else if (0<=posicion)
        {
            valores.add(posicion, valor);
        }
    }
    
    
    public static void borrarPosicion() throws Exception
    {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué posición quieres borrar?"))-1;
        if(posicion > valores.size())
        {
            JOptionPane.showMessageDialog(null, "No se puede borrar porque la posición no es correcta");
        }
        else if (0<=posicion)
        {
            valores.remove(posicion);
        }
    }
    
    private static double suma=0;
    
    public static void sumaMedia () throws Exception
    {
        valores.forEach((elemento)->{suma+=elemento;});
        double media=suma/valores.size();
        JOptionPane.showMessageDialog(null, "La suma de todos los elementos del ArrayList es " + suma + "\n" + "La media aritmética de todos los valores del ArrayList es " + media);
    }
    
    
    public static void finalizar() throws Exception
    {
        repetir=false;
    }
}
