/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Excepciones.InsertFallida;
import ModeloUML.Evento;
import ModeloUML.Persona;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import tema8_practica1_ejercicio2.Controlador;

/**
 *
 * @author 1GDAW09
 */
public class TablaPersonas {
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void insertarPersona(Persona p) throws Exception
    {
        String plantilla="INSERT INTO personas VALUES (?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1, p.getDni());
        ps.setString(2, p.getNombre());
        ps.setString(3, p.getApellidos());
        ps.setString(4, p.getTelefono());
        ps.setString(5, p.getE().getNif());
        
        int filas = ps.executeUpdate();
        
        if(filas!=1)
        {
            System.out.println("Insert mal hecha (TablaPersonas)");
        }
    }
    
    public Persona buscarUnica(String dni) throws Exception
    {
        String plantilla="SELECT * FROM personas WHERE dni=?";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1, dni);
        
        ResultSet resultado= ps.executeQuery();
        if(resultado.next())
        {
            Persona p= new Persona();
            p.setDni(resultado.getString("dni"));
            p.setNombre(resultado.getString("nombre"));
            p.setApellidos(resultado.getString("apellidos"));
            p.setTelefono(resultado.getString("telefono"));
            //p.setE(Controlador.buscarEmpresa(resultado.getString("nif")));
            return p;
        }
        else
        {
            return null;
        }
    }
}
