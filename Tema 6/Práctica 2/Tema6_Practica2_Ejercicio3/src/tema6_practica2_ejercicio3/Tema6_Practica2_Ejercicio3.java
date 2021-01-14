/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_practica2_ejercicio3;

import Modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author 1GDAW09
 */
public class Tema6_Practica2_Ejercicio3 {
    
    private static ArrayList<Empleado> listaTodosEmpleados = new ArrayList();
    private static ArrayList<Directivo> listaTodosDirectivos = new ArrayList();
    private static ArrayList<Cliente> listaTodosClientes = new ArrayList();
    private static ArrayList<Empresa> listaTodasEmpresas = new ArrayList();
    private static ArrayList<Empleado> copia = new ArrayList(); //Para copiar el ArrayList de Empleados
    private static ArrayList<Directivo> copia2 = new ArrayList(); //PAra copiar el de Directivos
    
    private static int numeroEmpleados;
    private static int numeroDirectivos;
    private static int numeroClientes;
    private static int numeroEmpresas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos empleados va a haber?"));
        for(int x = 0; x<numeroEmpleados ; x++)
        {
            listaTodosEmpleados.add(generarEmpleado());
        }
        
        for(int x=0; x<listaTodosEmpleados.size(); x++)
        {
            copia.add(listaTodosEmpleados.get(x));
        }
        
        numeroDirectivos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos directivos va a haber?"));
        for(int x = 0; x<numeroDirectivos ; x++)
        {
            listaTodosDirectivos.add(generarDirectivo());
        }
        numeroClientes = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos clientes va a haber?"));
        for(int x = 0; x<numeroClientes ; x++)
        {
            listaTodosClientes.add(generarCliente());
        }
        
        copia.clear();
        for(int x=0; x<listaTodosEmpleados.size(); x++)
        {
            copia.add(listaTodosEmpleados.get(x));
        }
        
        numeroEmpresas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas empresas va a haber?"));
        for(int x = 0; x<numeroEmpresas ; x++)
        {
            listaTodasEmpresas.add(generarEmpresa());
        }
        
        
        System.out.println("EMPLEADOS: \n");
        for(int x=0; x<listaTodosEmpleados.size();x++)
        {
            System.out.println(listaTodosEmpleados.get(x).Mostrar());
        }
        
        System.out.println("\n\nDIRECTIVOS: \n");
        for(int x=0; x<listaTodosDirectivos.size();x++)
        {
            System.out.println(listaTodosDirectivos.get(x).Mostrar());
        }
        
        System.out.println("\n\nCLIENTES: \n");
        for(int x=0; x<listaTodosClientes.size();x++)
        {
            System.out.println(listaTodosClientes.get(x).Mostrar());
        }
        
        System.out.println("\n\nEMPRESAS: \n");
        for(int x=0; x<listaTodasEmpresas.size();x++)
        {
            System.out.println(listaTodasEmpresas.get(x).toString());
        }
        
        JOptionPane.showMessageDialog(null, encontrarDirectivoMasSubordinados());
        
    }

    private static Empleado generarEmpleado() 
    {
        
        return new Empleado(elegirNombre(), elegirEdad(), elegirSueldoBruto());
    }
    
    
    private static Directivo generarDirectivo() 
    {
        Directivo a = new Directivo(elegirNombre(), elegirEdad(), elegirSueldoBruto(), elegirCategoria());
        a.setListaSubordinados(generarListaSubordinados());
        return a;
    }
    
    
    private static Cliente generarCliente() 
    {
        
        return new Cliente(elegirNombre(), elegirEdad(), elegirTelefono());
    }
    
    
    private static Empresa generarEmpresa() 
    {
        Empresa e1 = new Empresa(elegirNombreEmpresa());
        e1.setListaClientesEmpresa(generarListaClientes());
        e1.setListaEmpleadosEmpresa(generarListaEmpleados());
        return e1;
    }
    
    
    private static ArrayList<Empleado> generarListaSubordinados() 
    {
        ArrayList<Empleado> a = new ArrayList();
        int cantidad = (int)Math.rint(Math.random()*100);
        if((numeroDirectivos-1)>listaTodosDirectivos.size())
        {
            while(cantidad>numeroEmpleados || cantidad<0)
            {
                if(cantidad>numeroEmpleados)
                {
                    cantidad -= 3;
                }
                if(cantidad<0)
                {
                    cantidad += 1;
                }
            }
        }
        else
        {
            cantidad=-1;
        }
        if(cantidad!=-1)
        {
            for(int x=0; x<cantidad && x<numeroEmpleados ; x++)
            {
                a.add(copia.get(x));
            }
            numeroEmpleados-=a.size();
        }
        else
        {
            for(int x=0; x<numeroEmpleados ; x++)
            {
                a.add(copia.get(x));
                copia.remove(x);
            }
            numeroEmpleados-=a.size();
        }
        return a;
    }
    
    
    private static ArrayList<Cliente> generarListaClientes() 
    {
        ArrayList<Cliente> a = new ArrayList();
        int cantidad = (int)Math.rint(Math.random()*100);
        if(numeroEmpresas==1)
        {
            cantidad=listaTodosClientes.size();
        }
        for(int x=0; x<cantidad && x<listaTodosClientes.size();x++)
        {
            a.add(listaTodosClientes.get(x));
            listaTodosClientes.remove(x);
        }
        return a;
    }
    
    
    private static ArrayList<Empleado> generarListaEmpleados() 
    {
        ArrayList<Empleado> a = new ArrayList();
        int cantidad = (int)Math.rint(Math.random()*100);
        for(int x=0; x<cantidad && x<listaTodosEmpleados.size() ;x++)
        {
            a.add(listaTodosEmpleados.get(x));
            listaTodosEmpleados.remove(x);
        }
        return a;
    }
    
    
    public static String elegirNombre()
    {
        String[] nombres = {"Javier", "Laura", "Manolo", "Claudia", "Lucas", "María", "Jose", "Antonio", "Marta", "Andrea", "Oier", "Raúl", "Guillermo", "Fabiana", "Deivis", "Adrián", "Adriana", "Leonardo"};
        int elector = (int)Math.rint(Math.random()*1000000000);
        while(elector>=nombres.length)
        {
            if(elector>=nombres.length)
            {
                elector -= nombres.length;
            }
            
        }
        return nombres[elector];
    }
    public static String elegirNombreEmpresa()
    {
        String[] nombres = {"Mercadona", "Inditech", "Lidl", "Eroski", "Tesla", "Ferrari", "HasiCorp", "Maphre"};
        int elector = (int)Math.rint(Math.random()*1000000000);
        while(elector>=nombres.length)
        {
            if(elector>=nombres.length)
            {
                elector -= nombres.length;
            }
            
        }
        return nombres[elector];
    }
    
    public static String elegirCategoria()
    {
        String[] nombres = {"Primer rango", "Segundo rango", "Tercer rango", "Cuarto rango", "Quinto rango"};
        int elector = (int)Math.rint(Math.random()*10);
        while(elector>=nombres.length)
        {
            if(elector>=nombres.length)
            {
                elector -= nombres.length;
            }
            
        }
        return nombres[elector];
    }
    
    public static int elegirEdad()
    {
        int edad = (int)Math.rint(Math.random()*100);
        while(edad<18 || edad > 64)
        {
            if(edad<18)
            {
                edad += 18;
            }
            else if(edad > 64)
            {
                edad -= 64;
            }
        }
        return edad;
    }
    
    
    public static int elegirTelefono()
    {
        int edad = (int)Math.rint(Math.random()*1000000000);
        while(edad<000000000 || edad > 999999999)
        {
            if(edad<000000000)
            {
                edad += 18;
            }
            else if(edad > 999999999)
            {
                edad -= 64;
            }
        }
        return edad;
    }
    
    public static double elegirSueldoBruto()
    {
        double sueldoBruto = (double)Math.rint(Math.random()*100000);
        Math.round(sueldoBruto);
        while(sueldoBruto<14000 || sueldoBruto > 50000)
        {
            if(sueldoBruto > 50000)
            {
                sueldoBruto -= 50000;
            }
            else if(sueldoBruto < 14000)
            {
                sueldoBruto += 14000;
            }
        }
        return sueldoBruto;
    }

    private static String encontrarDirectivoMasSubordinados() 
    {
        Directivo a =new Directivo("", 0, 0, "");
        ArrayList<Empleado> b = new ArrayList();
        a.setListaSubordinados(b);
        for(int x=0 ; x<listaTodosDirectivos.size() ; x++)
        {
            if(listaTodosDirectivos.get(x).getListaSubordinados().size()>a.getListaSubordinados().size())
            {
                a=listaTodosDirectivos.get(x);
            }
        }
        return a.getNombre();
    }
}
