/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7_practica3_ejercicio1;

import Modelo.*;
import Vista.Ventana;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    private static String prod="";
    private static ArrayList<Producto> listaProductos = new ArrayList();
    private static ArrayList<Proveedor> listaProveedores = new ArrayList();
    
    public static void main(String[] args) {
        inicializarProductosProveedores();
        
        Ventana v1 = new Ventana();
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
    }
    
    private static void inicializarProductosProveedores()
    {
        listaProveedores.add(new Proveedor("Samsung"));
        listaProveedores.add(new Proveedor("Apple"));
        listaProveedores.add(new Proveedor("Xiaomi"));
        
        ArrayList<Proveedor> prod1 = new ArrayList();
        prod1.add(listaProveedores.get(0));
        
        ArrayList<Proveedor> prod2 = new ArrayList();
        prod1.add(listaProveedores.get(0));
        prod1.add(listaProveedores.get(1));
        
        ArrayList<Proveedor> prod3 = new ArrayList();
        prod1.add(listaProveedores.get(0));
        prod1.add(listaProveedores.get(1));
        prod1.add(listaProveedores.get(2));
        
        ArrayList<Proveedor> prod4 = new ArrayList();
        prod1.add(listaProveedores.get(1));
        prod1.add(listaProveedores.get(2));
        
        ArrayList<Proveedor> prod5 = new ArrayList();
        prod1.add(listaProveedores.get(2));
        
        listaProductos.add(new Producto("Ordenador",0));
        listaProductos.get(0).setListaProveedoresProducto(prod1);
        
        listaProductos.add(new Producto("Teclado",0));
        listaProductos.get(1).setListaProveedoresProducto(prod2);
        
        listaProductos.add(new Producto("Monitor",0));
        listaProductos.get(2).setListaProveedoresProducto(prod3);
        
        listaProductos.add(new Producto("Mochila",0));
        listaProductos.get(3).setListaProveedoresProducto(prod4);
        
        listaProductos.add(new Producto("Smartphone",0));
        listaProductos.get(4).setListaProveedoresProducto(prod5);
        
    }
    
    public static boolean comprobarNombreProducto(String p) {
        boolean correcto=false;
        for(int x=0; x<listaProductos.size();x++)
        {
            if(p.equalsIgnoreCase(listaProductos.get(x).getNombre()))
            {
                correcto=true;
                prod=p;
                break;
            }
        }
        return correcto;
    }
    
    public static void salir()
    {
        System.exit(0);
    }

    
    
}
