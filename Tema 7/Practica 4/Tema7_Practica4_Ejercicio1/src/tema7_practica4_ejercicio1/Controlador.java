/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7_practica4_ejercicio1;

import Modelo.*;
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
    
    public static ArrayList<Movimiento> listaMovimientos = new ArrayList();
    private static ArrayList<Cuenta> listaCuentas = new ArrayList();
    private static ArrayList<Cliente> listaClientes = new ArrayList();
    private static Cliente clienteGlobal;
    private static int posicionClienteGlobal;
    
    private static void inicializarMovimientos()
    {
        Movimiento m1 = new Movimiento("Ingreso","13/05/2009",150);
        Movimiento m2 = new Movimiento("Ingreso","25/03/2016",25);
        Movimiento m3 = new Movimiento("Recibo","13/01/2018",85);
        Movimiento m4 = new Movimiento("Recibo","28/08/2011",275);
        Movimiento m5 = new Movimiento("Nómina","06/11/2010",1500);
        Movimiento m6 = new Movimiento("Nómina","19/12/2003",2500);
        Movimiento m7 = new Movimiento("Recibo","23/04/2020",850);
        listaMovimientos.add(m1);
        listaMovimientos.add(m2);
        listaMovimientos.add(m3);
        listaMovimientos.add(m4);
        listaMovimientos.add(m5);
        listaMovimientos.add(m6);
        listaMovimientos.add(m7);
    }
    
    private static void inicializarCuentas()
    {
        ArrayList<Movimiento>mcuenta1 = new ArrayList();
        ArrayList<Movimiento>mcuenta2 = new ArrayList();
        ArrayList<Movimiento>mcuenta3 = new ArrayList();
        ArrayList<Movimiento>mcuenta4 = new ArrayList();
        ArrayList<Movimiento>mcuenta5 = new ArrayList();
        ArrayList<Movimiento>mcuenta6 = new ArrayList();
        
        mcuenta1.add(listaMovimientos.get(0));
        mcuenta1.add(listaMovimientos.get(1));
        mcuenta1.add(listaMovimientos.get(2));
        mcuenta1.add(listaMovimientos.get(3));
        mcuenta1.add(listaMovimientos.get(4));
        
        mcuenta2.add(listaMovimientos.get(2));
        mcuenta2.add(listaMovimientos.get(3));
        
        mcuenta3.add(listaMovimientos.get(0));
        mcuenta3.add(listaMovimientos.get(1));
        
        mcuenta4.add(listaMovimientos.get(6));
        mcuenta4.add(listaMovimientos.get(1));
        mcuenta4.add(listaMovimientos.get(2));
        mcuenta4.add(listaMovimientos.get(3));
        mcuenta4.add(listaMovimientos.get(4));
        
        mcuenta5.add(listaMovimientos.get(6));
        mcuenta5.add(listaMovimientos.get(1));
        mcuenta5.add(listaMovimientos.get(3));
        mcuenta5.add(listaMovimientos.get(0));
        mcuenta5.add(listaMovimientos.get(4));
        mcuenta5.add(listaMovimientos.get(6));
        
        mcuenta6.add(listaMovimientos.get(5));
        mcuenta6.add(listaMovimientos.get(4));
        mcuenta6.add(listaMovimientos.get(3));
        mcuenta6.add(listaMovimientos.get(6));
        
        
        Cuenta cuenta1 = new Cuenta("0101010101",2143.21,mcuenta1);
        Cuenta cuenta2 = new Cuenta("0202020202",168.77,mcuenta2);
        
        Cuenta cuenta3 = new Cuenta("0303030303",472.54,mcuenta3);
        Cuenta cuenta4 = new Cuenta("0404040404",1000.00,mcuenta4);
        Cuenta cuenta5 = new Cuenta("0505050505",1243.94,mcuenta5);
        
        Cuenta cuenta6 = new Cuenta("0606060606",3167.10,mcuenta6);
        
        listaCuentas.add(cuenta1);
        listaCuentas.add(cuenta2);
        listaCuentas.add(cuenta3);
        listaCuentas.add(cuenta4);
        listaCuentas.add(cuenta5);
        listaCuentas.add(cuenta6);
    }
    
    private static void inicializarClientes()
    {
        ArrayList<Cuenta>cuentascliente1 = new ArrayList();
        ArrayList<Cuenta>cuentascliente2 = new ArrayList();
        ArrayList<Cuenta>cuentascliente3 = new ArrayList();
        
        cuentascliente1.add(listaCuentas.get(0));
        cuentascliente1.add(listaCuentas.get(1));
        
        cuentascliente2.add(listaCuentas.get(2));
        cuentascliente2.add(listaCuentas.get(3));
        cuentascliente2.add(listaCuentas.get(4));
        
        cuentascliente3.add(listaCuentas.get(5));
        
        Cliente cliente1 = new Cliente("00000000A","12345",cuentascliente1);
        Cliente cliente2 = new Cliente("11111111B","12345",cuentascliente2);
        Cliente cliente3 = new Cliente("22222222C","12345",cuentascliente3);
        
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
    }
    
    
    
    public static void main(String[] args) {
        inicializarMovimientos();
        System.out.println(listaMovimientos.get(4).mostrar());
        inicializarCuentas();
        inicializarClientes();
        
        Inicio inicio = new Inicio();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    }
    
    public static void irPantallaIdentificacion(javax.swing.JFrame inicio)
    {
        inicio.dispose();
        Identificacion identificacion = new Identificacion();
        identificacion.setLocationRelativeTo(null);
        identificacion.setVisible(true);
    }
    
    public static void irPantallaPrincipal(javax.swing.JFrame inicio)
    {
        inicio.dispose();
        Principal principal = new Principal();
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }
    
    public static void irPantallaConsulta(javax.swing.JFrame inicio)
    {
        inicio.dispose();
        Consulta consulta = new Consulta();
        consulta.setLocationRelativeTo(null);
        consulta.setVisible(true);
    }
    
    public static void irPantallaMovimientos(javax.swing.JFrame inicio)
    {
        inicio.dispose();
        Movimientos mov = new Movimientos();
        mov.setLocationRelativeTo(null);
        mov.setVisible(true);
    }
    
    public static boolean comprobarCredenciales(String dni, String clave)
    {
        boolean correcto=false;
        for(int x=0; x<listaClientes.size(); x++)
        {
            if(dni.equals(listaClientes.get(x).getDni()))
            {
                if(clave.equals(listaClientes.get(x).getClave()))
                {
                    correcto= true;
                    clienteGlobal=listaClientes.get(x);
                    posicionClienteGlobal=x;
                    break;
                }
            }
        }
        return correcto;
    }
    
    public static ArrayList<String> enviarCuentas()
    {
        ArrayList<String> devolver = new ArrayList();
        for(int x=0;x<clienteGlobal.getListaCuentasCliente().size(); x++)
        {
            devolver.add(clienteGlobal.getListaCuentasCliente().get(x).getNumeroDeCuenta());
        }
        return devolver;
    }
    
    public static ArrayList<String> enviarMovimientosCuentas(int posicion)
    {
        int y=0;
        if(clienteGlobal.getListaCuentasCliente().get(posicion).getListaMovimientosCuenta().size()>5)
        {
            y=5;
        }
        else
        {
            y=clienteGlobal.getListaCuentasCliente().get(posicion).getListaMovimientosCuenta().size();
        }
        ArrayList<String> devolver = new ArrayList();
        for(int x=clienteGlobal.getListaCuentasCliente().get(posicion).getListaMovimientosCuenta().size()-1;x>(clienteGlobal.getListaCuentasCliente().get(posicion).getListaMovimientosCuenta().size()-y-1); x--)
        {
            devolver.add(clienteGlobal.getListaCuentasCliente().get(posicion).getListaMovimientosCuenta().get(x).mostrar());
        }
        return devolver;
    }
    
    public static String enviarSaldo(int posicion)
    {
        String devolver="";
        for(int x=0;x<6; x++)
        {
            devolver=""+clienteGlobal.getListaCuentasCliente().get(posicion).getSaldo();
        }
        return devolver;
    }
    
    public static double registrarMovimiento(int posicionCuenta, String tipo, String fecha, double cantidad)
    {
        Movimiento mov = new Movimiento(tipo,fecha,cantidad);
        listaClientes.get(posicionClienteGlobal).getListaCuentasCliente().get(posicionCuenta).getListaMovimientosCuenta().add(mov);
        listaClientes.get(posicionClienteGlobal).getListaCuentasCliente().get(posicionCuenta).setSaldo(listaClientes.get(posicionClienteGlobal).getListaCuentasCliente().get(posicionCuenta).getSaldo()-cantidad);
        return listaClientes.get(posicionClienteGlobal).getListaCuentasCliente().get(posicionCuenta).getSaldo();
    }
    
}
