/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_practica1_ejercicio3;

import Clases.Persona;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Tema6_Practica1_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList <Persona> personasLista = new ArrayList();
    
    public static void main(String[] args) {
        boolean continuar=true;
        do
        {
            personasLista.add(new Persona(pedirString("el nombre"),pedirString("el día de nacimiento"),pedirString("el mes de nacimiento"),pedirString("el año de nacimiento"),pedirString("la dirección"),pedirInt("el código postal"),pedirString("la ciudad")));
            int continuarInt=JOptionPane.showOptionDialog(null, "¿Quieres seguir introduciendo personas?", "¿Quieres seguir introduciendo personas?", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Sí","No"},"Sí");
            if(continuarInt==0)
            {
                continuar=true;
            }
            else if(continuarInt==1)
            {
                continuar=false;
            }
        }
        while(continuar);
        programaMostrar();
    }
    
    
    public static String pedirString(String a)
    {
        return (JOptionPane.showInputDialog("Introduce " + a + " de la persona"));
    }
    
    public static int pedirInt(String a)
    {
        return (Integer.parseInt(JOptionPane.showInputDialog("Introduce " + a + " de la persona")));
    }
    
    
    public static void programaMostrar(){
        JOptionPane.showMessageDialog(null, "La persona de mayor edad introducida es " + mayorEdad() + "\n"
                + "Las personas que viven en elche son:\n" + personasElche()
                + "Hay " + mayor18() + " mayores de edad (mayores de 18 años)");
    }
    
    public static String mayorEdad(){ //Referido a la persona de más edad
        int x,y=01;
        LocalDate fechaMayor=LocalDate.now();
        for (x=0; x<personasLista.size(); x++)
        {
            if(fechaMayor.isAfter(personasLista.get(x).getFechaDeNacimiento()))
            {
                fechaMayor=personasLista.get(x).getFechaDeNacimiento();
                y=x;
            }
        }
        return personasLista.get(y).getNombre();
    }
    
    
    public static String personasElche(){
        String personasElche = "";
        for (int x=0; x<personasLista.size(); x++)
        {
            if(personasLista.get(x).getCiudad().equalsIgnoreCase("ELCHE"))
            {
                personasElche += "     " + personasLista.get(x).getNombre() + "\n";
            }
        }
        return personasElche;
    }
    
    
    
    public static int mayor18(){
        int x,y=0;
        for(x=0; x<personasLista.size(); x++)
        {
            if(personasLista.get(x).getFechaDeNacimiento().until(LocalDate.now()).getYears()>=18)
            {
                y++;
            }
        }
        return y;
    }
}
