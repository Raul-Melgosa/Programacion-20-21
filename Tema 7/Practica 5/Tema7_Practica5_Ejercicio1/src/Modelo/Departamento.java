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
public class Departamento {
    private String nombre;
    private ArrayList<Empleado> listaEmpleadosDepartamento = new ArrayList();

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getListaEmpleadosDepartamento() {
        return listaEmpleadosDepartamento;
    }

    public void setListaEmpleadosDepartamento(ArrayList<Empleado> listaEmpleadosDepartamento) {
        this.listaEmpleadosDepartamento = listaEmpleadosDepartamento;
    }
}
