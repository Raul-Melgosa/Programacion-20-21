/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_practica2_ejercicio2;

import Clases.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
    private static ArrayList<Pelicula> peliculasE1 = new ArrayList();
    private static ArrayList<Pelicula> peliculasE2 = new ArrayList();
    private static ArrayList<Pelicula> peliculasE3 = new ArrayList();
    private static ArrayList<Pelicula> peliculasE4 = new ArrayList();
    private static ArrayList<Pelicula> peliculasE5 = new ArrayList();
    
    private static ArrayList<Estudio> estudiosP1 = new ArrayList();
    private static ArrayList<Estudio> estudiosP2 = new ArrayList();
    private static ArrayList<Estudio> estudiosP3 = new ArrayList();
    private static ArrayList<Estudio> estudiosP4 = new ArrayList();
    
    public static void main(String[] args) {
        
        inicializarEstudios();
        inicializarPeliculas();
        terminarDeInicializarEstudios();
        
        String salidaPeliLarga = encontrarEstudiosPeliculaMaslarga();
        JOptionPane.showMessageDialog(null, salidaPeliLarga);
        
        JOptionPane.showMessageDialog(null, encontrarEstudiosConMasPeliculas());
        
    }
    public static void inicializarEstudios()
    {
        LocalDate fecha = LocalDate.now();
        String[] telefonos = {"900900900","800800800","700700700"};
        Estudio e1 = new Estudio("Estudio 1", "Ciudad 1", "Direccion 1", "Direccion Web 1", fecha, "Pais 1", telefonos);
        Estudio e2 = new Estudio("Estudio 2", "Ciudad 2", "Direccion 2", "Direccion Web 2", fecha, "Pais 2", telefonos);
        Estudio e3 = new Estudio("Estudio 3", "Ciudad 3", "Direccion 3", "Direccion Web 3", fecha, "Pais 3", telefonos);
        Estudio e4 = new Estudio("Estudio 4", "Ciudad 4", "Direccion 4", "Direccion Web 4", fecha, "Pais 4", telefonos);
        Estudio e5 = new Estudio("Estudio 5", "Ciudad 5", "Direccion 5", "Direccion Web 5", fecha, "Pais 5", telefonos);
        
        e1.setListaPeliculas(peliculasE1);
        e1.setListaPeliculas(peliculasE2);
        e1.setListaPeliculas(peliculasE3);
        e1.setListaPeliculas(peliculasE4);
        e1.setListaPeliculas(peliculasE5);
        
        listaEstudios.add(e1);
        listaEstudios.add(e2);
        listaEstudios.add(e3);
        listaEstudios.add(e4);
        listaEstudios.add(e5);
    }
    
    public static void inicializarPeliculas()
    {
        estudiosP1.add(listaEstudios.get(5-1));
        estudiosP1.add(listaEstudios.get(2-1));
        
        estudiosP2.add(listaEstudios.get(1-1));
        estudiosP2.add(listaEstudios.get(2-1));
        
        estudiosP3.add(listaEstudios.get(2-1));
        estudiosP3.add(listaEstudios.get(3-1));
        estudiosP3.add(listaEstudios.get(4-1));
        
        estudiosP4.add(listaEstudios.get(1-1));
        
        Pelicula p1 = new Pelicula("Tipo pelicula 1"); p1.setTitulo("Película 1");
        Pelicula p2 = new Pelicula("Tipo pelicula 2"); p2.setTitulo("Película 2");
        Pelicula p3 = new Pelicula("Tipo pelicula 3"); p3.setTitulo("Película 3");
        Pelicula p4 = new Pelicula("Tipo pelicula 4"); p4.setTitulo("Película 4");
        
        
        p1.setDuracion((float)Math.random()*1000);
        p2.setDuracion((float)Math.random()*1000);
        p3.setDuracion((float)Math.random()*1000);
        p4.setDuracion((float)Math.random()*1000);
        
        
        
        p1.setListaEstudios(estudiosP1);
        p2.setListaEstudios(estudiosP2);
        p3.setListaEstudios(estudiosP3);
        p4.setListaEstudios(estudiosP4);
        
        listaPeliculas.add(p1);
        listaPeliculas.add(p2);
        listaPeliculas.add(p3);
        listaPeliculas.add(p4);
    }
    
    
    public static void terminarDeInicializarEstudios()
    {
        for(int x=0; x<listaEstudios.size(); x++)
        {
            for(int y=0; y<listaPeliculas.size(); y++)
            {
                for(int z=0; z<listaPeliculas.get(y).getListaEstudios().size(); z++)
                {
                    if(listaPeliculas.get(y).getListaEstudios().get(z).equals(listaEstudios.get(x)))
                    {
                        listaEstudios.get(x).getListaPeliculas().add(listaPeliculas.get(y));
                    }
                }
            }
        }
        
        estudiosP1.clear();
        estudiosP2.clear();
        estudiosP3.clear();
        estudiosP4.clear();
        
        estudiosP1.add(listaEstudios.get(5-1));
        estudiosP1.add(listaEstudios.get(2-1));
        
        estudiosP2.add(listaEstudios.get(1-1));
        estudiosP2.add(listaEstudios.get(2-1));
        
        estudiosP3.add(listaEstudios.get(2-1));
        estudiosP3.add(listaEstudios.get(3-1));
        estudiosP3.add(listaEstudios.get(4-1));
        
        estudiosP4.add(listaEstudios.get(1-1));
        
        listaPeliculas.get(0).setListaEstudios(estudiosP1);
        listaPeliculas.get(1).setListaEstudios(estudiosP2);
        listaPeliculas.get(2).setListaEstudios(estudiosP3);
        listaPeliculas.get(3).setListaEstudios(estudiosP4);
    }
    
    
    public static String encontrarEstudiosConMasPeliculas()
    {
        int numeroMaximoPeliculas = 0;
        for(int a=0 ; a<listaEstudios.size() ; a++)
        {
            if(listaEstudios.get(a).getListaPeliculas().size()>numeroMaximoPeliculas)
            {
                numeroMaximoPeliculas = listaEstudios.get(a).getListaPeliculas().size();
            }
        }
        String estudiosConMasPeliculas = "Los estudios que más películas han producido son:\n";
        for(int b=0 ; b<listaEstudios.size() ; b++)
        {
            if(listaEstudios.get(b).getListaPeliculas().size()==numeroMaximoPeliculas)
            {
                estudiosConMasPeliculas += listaEstudios.get(b).getNombre() + "\n";
            }
        }
        
        return estudiosConMasPeliculas;
    }
    
    
    public static String encontrarEstudiosPeliculaMaslarga()
    {
        Pelicula pelimasLarga = new Pelicula();
        pelimasLarga.setDuracion(0f);
        for(int y=0 ; y<listaPeliculas.size() ; y++)
        {
            if(listaPeliculas.get(y).getDuracion()>pelimasLarga.getDuracion())
            {
                pelimasLarga=listaPeliculas.get(y);
            }
        }
        System.out.println(pelimasLarga.getTitulo());
        
        String estudiosPeliculaMasLarga = "Los Estudios que han producido la película más larga son:\n";
        for(int z=0 ; z<pelimasLarga.getListaEstudios().size() ; z++)
        {
            estudiosPeliculaMasLarga += pelimasLarga.getListaEstudios().get(z).getNombre()+"\n";
        }
        return estudiosPeliculaMasLarga;
    }
    
}
