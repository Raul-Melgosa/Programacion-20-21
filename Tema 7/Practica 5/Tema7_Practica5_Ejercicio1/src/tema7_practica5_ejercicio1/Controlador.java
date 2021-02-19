/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7_practica5_ejercicio1;

import Modelo.*;
import Vista.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    
    private static ArrayList<AdministradorPersonal>listaAdmins = new ArrayList();
    private static ArrayList<Contrato>listaContratos = new ArrayList();
    private static ArrayList<Departamento>listaDepartamentos = new ArrayList();
    private static ArrayList<Empleado>listaEmpleados = new ArrayList();
    
    private static void crearEmpleado(String dni, String nss, String nombre, String apellidos, char sexo, String estadoCivil, String direccion, String telefono, Departamento dep, Contrato c, LocalDate f)
    {
        dni=dni.toUpperCase();
        nss=nss.toUpperCase();
        nombre=nombre.toUpperCase();
        apellidos=apellidos.toUpperCase();
        Empleado e = new Empleado(dni,nss,nombre,apellidos,sexo,estadoCivil,direccion,telefono,dep,c,f);
        listaEmpleados.add(e);
        for(int x=0; x<listaDepartamentos.size();x++)
        {
            if(listaDepartamentos.get(x).getNombre().equals(dep.getNombre()))
            {
                listaDepartamentos.get(x).getListaEmpleadosDepartamento().add(e);
            }
        }
    }
    
    private static void actualizarAdmins()
    {
        listaAdmins.clear();
        for(int x=0; x<listaDepartamentos.get(0).getListaEmpleadosDepartamento().size();x++)
        {
            listaAdmins.add(new AdministradorPersonal(listaDepartamentos.get(0).getListaEmpleadosDepartamento().get(x).getNombre(),"12345"));
        }
    }
    
    private static void inicializarContratos()
    {
        listaContratos.add(new Contrato("De obra"));
        listaContratos.add(new Contrato("Indefinido"));
        listaContratos.add(new Contrato("Temporal"));
        listaContratos.add(new Contrato("De prácticas"));
        listaContratos.add(new Contrato("De aprendizaje"));
    }
    
    private static void inicializarDepartamentos()
    {
        listaDepartamentos.add(new Departamento("Personal"));
        listaDepartamentos.add(new Departamento("Ventas"));
        listaDepartamentos.add(new Departamento("Atención al Cliente"));
        listaDepartamentos.add(new Departamento("Fabricación"));
        listaDepartamentos.add(new Departamento("Distribución"));
    }
    
    public static void main(String[] args) {
        inicializarContratos();
        inicializarDepartamentos();
        crearEmpleado("00000000A","0000000000","Pepe","Ortiz Gómez",'H',"Soltero","Dirección x","111222333",listaDepartamentos.get(0),listaContratos.get(1),LocalDate.now());
        actualizarAdmins();
        
        Identificacion identificacion = new Identificacion();
        identificacion.setLocationRelativeTo(null);
        identificacion.setVisible(true);
    }
    
    private static String usuarioActivo="";
    
    public static boolean comprobarLogin(String usuario, String contrasena)
    {
        boolean respuesta=false;
        for(int x=0; x<listaAdmins.size();x++)
        {
            if((usuario.equals(listaAdmins.get(x).getUsuario()))&&(contrasena.equals(listaAdmins.get(x).getContrasena())))
            {
                usuarioActivo=listaAdmins.get(x).getUsuario();
                respuesta = true;
            }
        }
        return respuesta;
    }
    
    public static void irVentanaPrincipal(javax.swing.JFrame inicio)
    {
        inicio.dispose();
        Principal principal = new Principal();
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }
    
    public static void irVentanaAltas(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        VentanaAltas nuevo = new VentanaAltas();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void irVentanaBajas(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        VentanaBajas nuevo = new VentanaBajas();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static void irVentanaModificaciones(javax.swing.JFrame anterior)
    {
        anterior.dispose();
        VentanaModificaciones nuevo = new VentanaModificaciones();
        nuevo.setLocationRelativeTo(null);
        nuevo.setVisible(true);
    }
    
    public static String getUsuario()
    {
        return usuarioActivo;
    }
    
    public static void realizarAlta(String dni, String nss, String nombre, String apellidos, char sexo, String estadoCivil, String direccion, String telefono, int numeroContrato, int numeroDepartamento, String fecha)
    {
        System.out.println(dni+"\n"+nss+"\n"+nombre+"\n"+apellidos+"\n"+sexo+"\n"+estadoCivil+"\n"+direccion+"\n"+telefono+"\n"+numeroContrato+"\n"+numeroDepartamento+"\n"+fecha);
    }
    
    public static void salir()
    {
        System.exit(0);
    }
}
