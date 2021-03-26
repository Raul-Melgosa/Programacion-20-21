/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class TablaCasos {
    private Connection con;

    
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
    
    
}
