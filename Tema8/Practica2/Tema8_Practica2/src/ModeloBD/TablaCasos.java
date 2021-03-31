/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.*;
import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class TablaCasos {
    private Connection con;

    public void hacerAltaCaso(Connection conexion, Caso c) throws Exception
    {
        this.con=conexion;
        String plantilla = "INSERT INTO casos VALUES(?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, c.getNumeroExpediente());
        ps.setString(2, c.getEstado());
        ps.setDate(3, Date.valueOf(c.getFechaInicio()));
        ps.setDate(4, Date.valueOf(c.getFechaFin()));
        ps.setString(5, c.getCliente().getDni());
        ps.executeUpdate();
    }

    public void hacerBajaCaso(Connection conexion, String numeroExpediente) throws Exception
    {
        this.con=conexion;
        String plantilla = "DELETE FROM casos WHERE UPPER(numeroExpediente)=UPPER(?)";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, numeroExpediente);
        ps.executeUpdate();
    }
    
    public ArrayList<Caso> consultaCasosCliente(Connection conexion, String dni) throws Exception
    {
        con=conexion;
        String plantilla = "SELECT * FROM Casos WHERE UPPER(DNI)=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, dni.toUpperCase());
        
        ResultSet rs = ps.executeQuery();
        ArrayList<Caso> listaCasos = new ArrayList();
        while(rs.next())
        {
            Caso c=new Caso();
            c.setNumeroExpediente(rs.getString("numeroExpediente"));
            c.setEstado(rs.getString("estado"));
            c.setFechaInicio(rs.getDate("FechaInicio").toLocalDate());
            c.setFechaFin(rs.getDate("FechaFin").toLocalDate());
            
            listaCasos.add(c);
        }
        
        if(listaCasos.isEmpty())
        {
            listaCasos = null;
        }
        return listaCasos;
    }
    
    public ArrayList<String> hacerConsultaCaso(Connection conexion, String numeroExpediente) throws Exception
    {
        con=conexion;
        String plantilla = "SELECT * FROM Casos WHERE UPPER(numeroExpediente)=UPPER(?)";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, numeroExpediente);
        
        ResultSet rs = ps.executeQuery();
        ArrayList<String> c = new ArrayList();
        if(rs.next())
        {
            c.add(rs.getString("Estado"));
            c.add(rs.getDate("FechaInicio").toLocalDate().toString());
            c.add(rs.getDate("FechaFin").toLocalDate().toString());
        }
        
        if(c.isEmpty())
        {
            c = null;
        }
        return c;
    }
}
