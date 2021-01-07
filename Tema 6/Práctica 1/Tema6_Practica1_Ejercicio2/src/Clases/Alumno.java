/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW09
 */
public class Alumno {
    
    private String codigo;
    private String nombre;
    private String domicilio;
    private int telefono;

    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String domicilio, int telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String mostrarDatos()
    {
        return ("El código del alumno es: " + this.codigo + "\n" + "El nombre del alumno es: " + this.nombre + "\n" + "El domicilio del alumno es: " + this.domicilio + "\n" + "El número de teléfono del alumno es: " + this.codigo + "\n");
    }
    
}
