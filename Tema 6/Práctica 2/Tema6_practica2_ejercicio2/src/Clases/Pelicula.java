/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class Pelicula {
    private String titulo = "Desconocido";
    private String año = "0000";
    private float duracion = 0.0f;
    private String tipo;
    private ArrayList<Estudio> ListaEstudios;

    public Pelicula() {
    }

    public Pelicula(String tipo) {
        this.tipo = tipo;
    }

    public Pelicula(String tipo, ArrayList<Estudio> ListaEstudios) {
        this.tipo = tipo;
        this.ListaEstudios = ListaEstudios;
    }

    public ArrayList<Estudio> getListaEstudios() {
        return ListaEstudios;
    }

    public void setListaEstudios(ArrayList<Estudio> ListaEstudios) {
        this.ListaEstudios = ListaEstudios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public static void modificaPelicula()
    {
        
    }
    
    public static void despliegaPelicula()
    {
        
    }
    
    public static void eliminaPelicula()
    {
        
    }
            
}
