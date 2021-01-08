/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_practica2_ejercicio1;

import Clases.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author 1GDAW09
 */
public class Tema6_Practica2_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Estudio> TodosEstudios = new ArrayList();
        ArrayList<Pelicula> TodasPeliculas = new ArrayList();
        
        LocalDate fecha1 = LocalDate.now();
        LocalDate fecha2 = fecha1, fecha3 = fecha1, fecha4 = fecha1;
        String[] telefonos1 = {"123123123","321321321"};
        String[] telefonos2 = telefonos1, telefonos3 = telefonos1, telefonos4 = telefonos1;
        Estudio e1 = new Estudio("Estudio 1", "Ciudad 1", "Direccion 1", "Direccion Web 1", fecha1, "Pais 1", telefonos1);
        Estudio e2 = new Estudio("Estudio 2", "Ciudad 2", "Direccion 2", "Direccion Web 2", fecha2, "Pais 2", telefonos2);
        Estudio e3 = new Estudio("Estudio 3", "Ciudad 3", "Direccion 3", "Direccion Web 3", fecha3, "Pais 3", telefonos3);
        Estudio e4 = new Estudio("Estudio 4", "Ciudad 4", "Direccion 4", "Direccion Web 4", fecha4, "Pais 4", telefonos4);
        TodosEstudios.add(e1);
        TodosEstudios.add(e2);
        TodosEstudios.add(e3);
        TodosEstudios.add(e4);
        
        ArrayList<Estudio> listaEstudios1 = new ArrayList();
        listaEstudios1.add(e4);
        listaEstudios1.add(e1);
        Pelicula p1 = new Pelicula("Tipo 1", listaEstudios1);
        p1.setDuracion(134.3f);
        
        ArrayList<Estudio> listaEstudios2 = new ArrayList();
        listaEstudios2.add(e4);
        listaEstudios2.add(e3);
        Pelicula p2 = new Pelicula("Tipo 2", listaEstudios2);
        p2.setDuracion(120.5f);
        
        TodasPeliculas.add(p1);
        TodasPeliculas.add(p2);
        
        
        Pelicula masLarga = new Pelicula();
        int x=0;
        do
        {
            if(TodasPeliculas.get(x).getDuracion()>masLarga.getDuracion())
            {
                masLarga=TodasPeliculas.get(x);
            }
            x++;
        }
        while(x<TodasPeliculas.size());
        x=0;
        do
        {
            System.out.println(masLarga.getListaEstudios().get(x).getNombre() + " Ha creado la pelicula mas larga");
            x++;
        }
        while(x<masLarga.getListaEstudios().size());
    }
    
}
