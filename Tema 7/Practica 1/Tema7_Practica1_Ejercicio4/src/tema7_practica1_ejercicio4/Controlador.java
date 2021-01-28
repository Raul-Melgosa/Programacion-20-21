/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7_practica1_ejercicio4;

import Modelo.Producto;
import Vista.*;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Producto> listaProductos = new ArrayList();
    private static V1 v1 = new V1();
    private static VentanaVentas ventanaVentas = new VentanaVentas();
    private static VentanaCompras ventanaCompras = new VentanaCompras();
    
    public static void main(String[] args) {
        generarProductos();
        v1.setLocationRelativeTo(null);
        ventanaVentas.setLocationRelativeTo(null);
        ventanaCompras.setLocationRelativeTo(null);
        v1.setVisible(true);
    }
    
    public static void generarProductos()
    {
        listaProductos.add(new Producto("Producto 1",0.50,random())); 
        listaProductos.add(new Producto("Producto 2",1,random()));
        listaProductos.add(new Producto("Producto 3",1.50,random()));
        listaProductos.add(new Producto("Producto 4",2,random()));
        listaProductos.add(new Producto("Producto 5",2.50,random()));
        
        for(int x=0; x<listaProductos.size(); x++)
        {
            System.out.println(listaProductos.get(x).getNombre());
            System.out.println(listaProductos.get(x).getStock());
            System.out.println(listaProductos.get(x).getPrecio());
            System.out.println("\n");
        }
    }
    
    public static int random()
    {
        return (int)Math.round(Math.random()*100);
    }
    
    public static boolean comprobarDatosNoValidosNombre(String producto)
    {
        boolean error=true;
        for(int x=0; x<listaProductos.size();x++)
        {
            if(producto.equalsIgnoreCase(listaProductos.get(x).getNombre()))
            {
                error=false;
                break;
            }
        }
        return error;
    }
    
    public static boolean comprobarDatosNoValidosNumero(String unidades, String producto)
    {
        boolean error=true;
        for(int x=0; x<listaProductos.size();x++)
        {
            if(producto.equalsIgnoreCase(listaProductos.get(x).getNombre()))
            {
                if(Integer.parseInt(unidades)<=listaProductos.get(x).getStock())
                {
                    error=false;
                }
            }
        }
        return error;
    }
    
    public static String setImporte(String nombre, String unidades)
    {
        String devolver = "";
        for(int x=0; x<listaProductos.size(); x++)
        {
            if(nombre.equalsIgnoreCase(listaProductos.get(x).getNombre()))
            {
                if(Integer.parseInt(unidades)<listaProductos.get(x).getStock())
                {
                    devolver = ""+(listaProductos.get(x).getPrecio())*(Double.parseDouble(unidades));
                    listaProductos.get(x).setStock(listaProductos.get(x).getStock()-Integer.parseInt(unidades));
                    break;
                }
                else
                {
                    devolver="errorNumero";
                }
            }
        }
        if(devolver.equals(""))
        {
            devolver="errorNombre";
        }
        return devolver;
    }
    
    public static void cambiarVentana(String encender, String apagar)
    {
        encender=encender.toLowerCase();
        apagar=apagar.toLowerCase();
        switch(encender)
        {
            case "v1":
                v1.setVisible(true);
                break;
            case "ventas":
                ventanaVentas.setVisible(true);
                break;
            case "compras":
                ventanaCompras.setVisible(true);
                break;
        }
        
        switch(apagar)
        {
            case "v1":
                v1.setVisible(false);
                break;
            case "ventas":
                ventanaVentas.setVisible(false);
                break;
            case "compras":
                ventanaCompras.setVisible(false);
                break;
        }
    }
    
    public static void recibirDatosCompra(String producto,String unidades,String precio)
    {
        for(int x=0; x<listaProductos.size();x++)
        {
            if(producto.equalsIgnoreCase(listaProductos.get(x).getNombre()))
            {
                listaProductos.get(x).setStock(listaProductos.get(x).getStock()+Integer.parseInt(unidades));
                listaProductos.get(x).setPrecio(Double.parseDouble(precio));
            }
        }
    }
    
    public static void Salir()
    {
        System.exit(0);
    }
}
