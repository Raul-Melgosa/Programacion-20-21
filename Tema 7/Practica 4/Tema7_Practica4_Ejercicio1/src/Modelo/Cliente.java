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
public class Cliente {
    private String dni;
    private String clave;
    private ArrayList<Cuenta>listaCuentasCliente;

    public Cliente(String dni, String clave) {
        this.dni = dni;
        this.clave = clave;
    }

    public Cliente(String dni, String clave, ArrayList<Cuenta> listaCuentasCliente) {
        this.dni = dni;
        this.clave = clave;
        this.listaCuentasCliente = listaCuentasCliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList<Cuenta> getListaCuentasCliente() {
        return listaCuentasCliente;
    }

    public void setListaCuentasCliente(ArrayList<Cuenta> listaCuentasCliente) {
        this.listaCuentasCliente = listaCuentasCliente;
    }
    
    
}
