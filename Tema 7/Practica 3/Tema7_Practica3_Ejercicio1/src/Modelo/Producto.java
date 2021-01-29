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
public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    
    private ArrayList<Proveedor> listaProveedoresProducto;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(String nombre, int stock, ArrayList<Proveedor> listaProveedoresProducto) {
        this.nombre = nombre;
        this.stock = stock;
        this.listaProveedoresProducto = listaProveedoresProducto;
    }

    public ArrayList<Proveedor> getListaProveedoresProducto() {
        return listaProveedoresProducto;
    }

    public void setListaProveedoresProducto(ArrayList<Proveedor> listaProveedoresProducto) {
        this.listaProveedoresProducto = listaProveedoresProducto;
    }

    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
