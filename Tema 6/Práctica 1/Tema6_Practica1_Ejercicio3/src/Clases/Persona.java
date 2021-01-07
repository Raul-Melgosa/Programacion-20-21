/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author 1GDAW09
 */
public class Persona {
    //nombre, dNacimiento (d´ıa de nacimiento), mNacimiento (mes de nacimiento), aNacimiento (ano de nacimiento), direcci ˜ on, c ´ odigo postal y ciudad
    private String nombre;
    private String dNacimiento;
    private String mNacimiento;
    private String aNacimiento;
    private String direccion;
    private int codigoPostal;
    private String Ciudad;

    public Persona() {
    }

    public Persona(String nombre, String dNacimiento, String mNacimiento, String aNacimiento, String direccion, int codigoPostal, String Ciudad) {
        this.nombre = nombre;
        this.dNacimiento = dNacimiento;
        this.mNacimiento = mNacimiento;
        this.aNacimiento = aNacimiento;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.Ciudad = Ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdNacimiento() {
        while (this.dNacimiento.length()!=2)
        {
            this.dNacimiento = "0" + this.dNacimiento;
        }
        return dNacimiento;
    }

    public void setdNacimiento(String dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public String getmNacimiento() {
        while (this.mNacimiento.length()!=2)
        {
            this.mNacimiento = "0" + this.mNacimiento;
        }
        return mNacimiento;
    }

    public void setmNacimiento(String mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public String getaNacimiento() {
        while (this.aNacimiento.length()!=4)
        {
            this.aNacimiento = "0" + this.aNacimiento;
        }
        return aNacimiento;
    }

    public void setaNacimiento(String aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
    public LocalDate getFechaDeNacimiento()
    {
        LocalDate fechaNacimiento = LocalDate.now();
        String fechaNacimientoString=this.getdNacimiento() + "/" + this.getmNacimiento() + "/" + this.getaNacimiento();
        fechaNacimiento = LocalDate.parse(fechaNacimientoString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return fechaNacimiento;
    }
    
    
}
