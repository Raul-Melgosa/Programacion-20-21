/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author 1GDAW09
 */
public class Empleado {
    private String dni;
    private String nss;
    private String nombre;
    private String apellidos;
    private char sexo;
    private String estadoCivil;
    private String direccion;
    private String telefono;
    private Departamento departamentoAsociado;
    private Contrato tipoContrato;
    private LocalDate fechaAlta;
    private int numeroEmpleado;

    public Empleado(String dni, String nss, String nombre, String apellidos, char sexo, String estadoCivil, String direccion, String telefono, Departamento departamentoAsociado, Contrato tipoContrato, LocalDate fechaAlta) {
        this.dni = dni;
        this.nss = nss;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.direccion = direccion;
        this.telefono = telefono;
        this.departamentoAsociado = departamentoAsociado;
        this.tipoContrato = tipoContrato;
        this.fechaAlta = fechaAlta;
        this.numeroEmpleado = (int)(Math.random()*100000000);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if(sexo=='h'||sexo=='H'||sexo=='m'||sexo=='M')
        {
            this.sexo = Character.toUpperCase(sexo);
        }
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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

    public Departamento getDepartamentoAsociado() {
        return departamentoAsociado;
    }

    public void setDepartamentoAsociado(Departamento departamentoAsociado) {
        this.departamentoAsociado = departamentoAsociado;
    }

    public Contrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(Contrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    
    
}
