/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_practica2_ejercicio2;

import Clases.*;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author 1GDAW09
 */
public class Tema6_practica2_ejercicio2 {
    
    /**
     * @param args the command line arguments
     */
    
    private static ArrayList<Estudio>listaEstudios = new ArrayList();
    private static ArrayList<Pelicula>listaPeliculas = new ArrayList();
    
    public static void main(String[] args) {
        
        LocalDate fecha = LocalDate.now();
        String[] telefonos = {"900900900","800800800","700700700"};
        Estudio e1 = new Estudio("Estudio 1", "Ciudad 1", "Direccion 1", "Direccion Web 1", fecha, "Pais 1", telefonos);
        Estudio e2 = new Estudio("Estudio 2", "Ciudad 2", "Direccion 2", "Direccion Web 2", fecha, "Pais 2", telefonos);
        Estudio e3 = new Estudio("Estudio 3", "Ciudad 3", "Direccion 3", "Direccion Web 3", fecha, "Pais 3", telefonos);
        Estudio e4 = new Estudio("Estudio 4", "Ciudad 4", "Direccion 4", "Direccion Web 4", fecha, "Pais 4", telefonos);
        Estudio e5 = new Estudio("Estudio 5", "Ciudad 5", "Direccion 5", "Direccion Web 5", fecha, "Pais 5", telefonos);
        listaEstudios.add(e1);
        listaEstudios.add(e2);
        listaEstudios.add(e3);
        listaEstudios.add(e4);
        listaEstudios.add(e5);
        
        Pelicula p1 = new Pelicula("Tipo pelicula 1");
        Pelicula p2 = new Pelicula("Tipo pelicula 2");
        Pelicula p3 = new Pelicula("Tipo pelicula 3");
        Pelicula p4 = new Pelicula("Tipo pelicula 4");
        
        ArrayList<Pelicula> todasPeliculas = new ArrayList();
        todasPeliculas.add(p1);
        todasPeliculas.add(p2);
        todasPeliculas.add(p3);
        todasPeliculas.add(p4);
        
        for(int x=0 ; x<todasPeliculas.size(); x++)
        {
            todasPeliculas.get(x).setDuracion((float)Math.random()*1000);
            System.out.println("Duracion pelicula " + (x+1) + " " + todasPeliculas.get(x).getDuracion());
        }
        Pelicula pelimasLarga = new Pelicula();
        for(int y=0 ; y<todasPeliculas.size() ; y++)
        {
            
        }
        
    }
    
}
