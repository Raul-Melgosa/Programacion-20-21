/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_4_practica_1_ejercicio_8;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Tema_4_practica_1_ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        try{
            String salida="";
            int[][] faltasAlumno = new int[5][30];
            String[] codAlumno = new String [5];
            pedirCodigos(codAlumno);
            for(int a=0; a<5; a++){
                for(int b=0; b<30; b++){
                    faltasAlumno[a][b] = pedirParteDiario(codAlumno[a], b);
                }
            }
            for(int a=0; a<5; a++){
                int faltasTotalesAlumno=0;
                for(int b=0; b<30; b++){
                    faltasTotalesAlumno+=faltasAlumno[a][b];
                }
                if(faltasTotalesAlumno!=0){
                    salida+="El alumno con código " + codAlumno[a] + " tiene " + faltasTotalesAlumno + " faltas en el mes de Septiembre" + "\n";
                }
            }
            JOptionPane.showMessageDialog(null, salida);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error con la clase " + e.getClass() + " en " + e.getMessage());
        }
    }
    
    public static int pedirParteDiario(String codAlumno, int b){
        int faltas=0;
        if(JOptionPane.showOptionDialog(null, "¿El alumno con código " + codAlumno + " tiene alguna falta el día " + (b+1) + " de Noviembre?", "¿Tiene faltas?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí","No"}, "No")==0){
            faltas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas faltas tiene el alumno " + codAlumno + " en el día " + (b+1) + "?"));
        }
        return faltas;
    }

    public static String[] pedirCodigos(String[] codAlumno) throws Exception{
        boolean error=true;
        do{
            try{
                for(int x=0; x<codAlumno.length; x++){
                codAlumno[x]=JOptionPane.showInputDialog("Introduce el código del alumno número " + (x+1));
                for(int y=0; y<codAlumno.length; y++){
                    if(codAlumno[x].equals(codAlumno[y]) && y!=x){
                        codAlumno[x]=JOptionPane.showInputDialog("El código no puede coincidir con otro ya existente, por favor, introduce uno válido");
                        y--;
                    }
                }
                do{
                    if(codAlumno[x].isEmpty()){
                        codAlumno[x]=JOptionPane.showInputDialog("El código no puede dejarse vacío, por favor, introduce uno válido");
                    }
                }
                while(codAlumno[x].isEmpty());
                }
                error=false;
            }
            catch(java.lang.NullPointerException e){
                JOptionPane.showMessageDialog(null, "No puedes cancelar la introduccion de datos");
            }
        }
        while(error);
        return codAlumno;
    }
}
