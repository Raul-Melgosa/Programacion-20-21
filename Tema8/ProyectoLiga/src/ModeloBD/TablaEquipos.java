/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import java.sql.*;
import ModeloUML.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class TablaEquipos {
    private Connection c;

    public void setCon(Connection con) {
        this.c = con;
    }
    
    public ArrayList<Equipo> selectTodosEquipos(Connection con) throws Exception
    {
        c=con;
        String plantilla = "SELECT * FROM equipos ORDER BY nombre";
        PreparedStatement ps = c.prepareStatement(plantilla);
        ResultSet rs = ps.executeQuery();
        ArrayList<Equipo> devolver=new ArrayList();
        while(rs.next())
        {
            String nombre=rs.getString("Nombre");
            String ciudad=rs.getString("ciudad");
            LocalDate fechaFundacion=rs.getDate("FechaFundacion").toLocalDate();
            String colores=rs.getString("colores");
            int presupuesto=rs.getInt("Presupuesto");
            int clasificacion=rs.getInt("clasificacion");
            Equipo e = new Equipo(nombre,ciudad,fechaFundacion,colores,presupuesto,clasificacion);
            devolver.add(e);
        }
        if(devolver.isEmpty())
        {
            return null;
        }
        else
        {
            return devolver;
        }
    }
    
    public Equipo selectEquipo(Connection con, String nombre) throws Exception
    {
        c=con;
        String plantilla = "SELECT * FROM equipos Where UPPER(nombre)=Upper(?)";
        PreparedStatement ps = c.prepareStatement(plantilla);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        ArrayList<Equipo> devolver=new ArrayList();
        if(rs.next())
        {
            String nombreE=rs.getString("Nombre");
            String ciudad=rs.getString("ciudad");
            LocalDate fechaFundacion=rs.getDate("FechaFundacion").toLocalDate();
            String colores=rs.getString("colores");
            int presupuesto=rs.getInt("Presupuesto");
            int clasificacion=rs.getInt("clasificacion");
            Equipo e = new Equipo(nombreE,ciudad,fechaFundacion,colores,presupuesto,clasificacion);
            return e;
        }
        else
        {
            return null;
        }
    }
    
    public void altaEquipo(Connection con, Equipo e) throws Exception
    {
        c=con;
        String plantilla = "INSERT INTO equipos(nombre,ciudad,fechaFundacion,colores,presupuesto,clasificacion) VALUES(?,?,?,?,?,?)";
        //nombre,ciudad,LocalDate.parse(fecha),colores ,Integer.parseInt(presupuesto),Integer.parseInt(clasificacion)
        PreparedStatement ps = c.prepareStatement(plantilla);
        ps.setString(1, e.getNombre());
        ps.setString(2, e.getCiudad());
        ps.setDate(3, Date.valueOf(e.getFechaFundacion()));
        ps.setString(4, e.getColores());
        ps.setInt(5, e.getPresupuesto());
        ps.setInt(6, e.getClasificacion());
        ps.executeUpdate();
    }
}
