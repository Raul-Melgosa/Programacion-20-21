/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class Empresa {
    private String nombre;
    
    private ArrayList<Empleado> listaEmpleadosEmpresa;
    private ArrayList<Cliente> listaClientesEmpresa;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getListaEmpleadosEmpresa() {
        return listaEmpleadosEmpresa;
    }

    public void setListaEmpleadosEmpresa(ArrayList<Empleado> listaEmpleadosEmpresa) {
        this.listaEmpleadosEmpresa = listaEmpleadosEmpresa;
    }

    public ArrayList<Cliente> getListaClientesEmpresa() {
        return listaClientesEmpresa;
    }

    public void setListaClientesEmpresa(ArrayList<Cliente> listaClientesEmpresa) {
        this.listaClientesEmpresa = listaClientesEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", listaEmpleadosEmpresa=" + listaEmpleadosEmpresa.get(0) + ", listaClientesEmpresa=" + listaClientesEmpresa.get(0) + '}';
    }
    
    
}
