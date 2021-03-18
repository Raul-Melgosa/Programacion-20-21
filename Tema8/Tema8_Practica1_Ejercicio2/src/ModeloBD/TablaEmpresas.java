/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Excepciones.InsertFallida;
import ModeloUML.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author 1GDAW09
 */
public class TablaEmpresas {
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public Empresa buscarEmpresa(String nif) throws Exception
    {
        String plantilla = "SELECT * FROM empresas WHERE nombre=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, nif);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            return new Empresa(rs.getString("nombre"),rs.getString("nif"));
        }
        else
        {
            return null;
        }
    }
    
    public void insertarEmpresa(Empresa e) throws Exception
    {
        try
        {
            String plantilla = "INSERT INTO empresas(nif,nombre) VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(plantilla);
            ps.setString(1, e.getNif());
            ps.setString(2, e.getNombre());
            ps.executeUpdate();
        }
        catch(com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException ex)
        {
            
        }
    }
}
