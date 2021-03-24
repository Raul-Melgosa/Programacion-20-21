/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String correo;
    private ArrayList<Caso> listaCasos;
    
    
    public Cliente(){
        
    }

    public Cliente(String dni, String nombre, String apellidos, String direccion, String telefono, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.listaCasos=new ArrayList();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Caso> getListaCasos() {
        return listaCasos;
    }

    public void setListaCasos(Caso c) {
        if(this.listaCasos==null)
        {
            this.listaCasos=new ArrayList();
        }
        this.listaCasos.add(c);
    }
}
