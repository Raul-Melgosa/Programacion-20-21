/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class Evento {
    private String nombre;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String lugar;
    private int numeroPersonas;
    private ArrayList<Persona> listaAsistentes;


    public Evento(String nombre, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, String lugar, int numeroPersonas) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.lugar = lugar;
        this.numeroPersonas = numeroPersonas;
    }

    public Evento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
    
    public ArrayList<Persona> getListaAsistentes() {
        return listaAsistentes;
    }

    public void setListaAsistentes(ArrayList<Persona> listaAsistentes) {
        this.listaAsistentes = listaAsistentes;
    }
    
    public boolean agregarAsistente(Persona p)
    {
        if(this.numeroPersonas<this.listaAsistentes.size())
        {
            this.listaAsistentes.add(p);
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
