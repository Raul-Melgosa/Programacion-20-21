/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

/**
 *
 * @author 1GDAW09
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private Empresa e;

    public Persona(String nombre, String apellidos, String dni, String telefono, Empresa e) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.e = e;
    }

    public Persona(String nombre, String apellidos, String dni, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
    }

    public Persona() {
        
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empresa getE() {
        return e;
    }

    public void setE(Empresa e) {
        this.e = e;
    }
    
    
}
