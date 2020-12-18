/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_practica1_ejercicio2;

import Clases.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Tema6_Practica1_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continuar=true;
        ArrayList <Alumno> alumnosLista = new ArrayList();
        do
        {
            alumnosLista.add(new Alumno(pedirString("el código"),pedirString("el nombre"),pedirString("el domicilio"),pedirInt("el número de teléfono")));
            int continuarInt=JOptionPane.showOptionDialog(null, "¿Quieres seguir introduciendo alumnos?", "¿Quieres seguir introduciendo alumnos?", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Sí","No"},"Sí");
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
        String alumnoVer = JOptionPane.showInputDialog("Introduce el código del alumno cuyos datos quieres visualizar");
        for(int x=0; x<alumnosLista.size();x++)
        {
            if (alumnosLista.get(x).getCodigo().equals(alumnoVer))
            {
                JOptionPane.showMessageDialog(null, alumnosLista.get(x).mostrarDatos());
            }
        }
        
    }
    
    public static String pedirString(String a)
    {
        return (JOptionPane.showInputDialog("Introduce " + a + " del alumno"));
    }
    
    public static int pedirInt(String a)
    {
        return (Integer.parseInt(JOptionPane.showInputDialog("Introduce " + a + " del alumno")));
    }
    
}
