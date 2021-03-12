/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Excepciones.InsertFallida;
import ModeloUML.Evento;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class TablaEventos {
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void insertarEvento(Evento e) throws Exception
    {
        String plantilla = "INSERT INTO eventos VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, e.getNombre());
        Date date = Date.valueOf(LocalDate.parse(e.getFecha().toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        ps.setDate(2, date);
        ps.setString(3, e.getHoraInicio().toString());
        ps.setString(4, e.getHoraFin().toString());
        ps.setString(5, e.getLugar());
        ps.setInt(6, e.getNumeroPersonas());
        int filas = ps.executeUpdate();
        if(filas!=1)
        {
            throw new InsertFallida();
        }
    }
    
    public void eliminarEvento(String nombre) throws Exception
    {
        String plantilla = "DELETE FROM eventos WHERE UPPER(Nombre) = ?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, nombre);
        int filas = ps.executeUpdate();
        if(filas!=1)
        {
            throw new InsertFallida();
        }
    }
    
    public ArrayList<String> getNombres() throws Exception
    {
        String plantilla = "SELECT nombre FROM eventos";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ResultSet rs = ps.executeQuery();
        ArrayList<String> devolver = new ArrayList();
        while(rs.next())
        {
            devolver.add(rs.getString("nombre"));
        }
        return devolver;
    }
    
    public ArrayList<String> getEvento(String nombreSelect) throws Exception
    {
        String plantilla = "select * from eventos where nombre = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, nombreSelect);
        ResultSet resultado = ps.executeQuery();
        
        ArrayList<String> devolver = new ArrayList();
        if (resultado.next())
        {
            devolver.add(resultado.getString("nombre"));
            devolver.add(resultado.getString("fecha"));
            devolver.add(resultado.getString("HoraInicio"));
            devolver.add(resultado.getString("HoraFin"));
            devolver.add(resultado.getString("Lugar"));
            devolver.add(resultado.getString("NumeroPersonas"));
            
        }
        return devolver;
    }
}
