/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.*;
import java.sql.*;

/**
 *
 * @author 1GDAW09
 */
public class TablaAbogados {
    private Connection con;
    
    public void altaAbogado(Connection conexion, Abogado abogado) throws Exception
    {
        con=conexion;
        String plantilla = "INSERT INTO Abogados Values (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, abogado.getDni());
        ps.setString(2, abogado.getNombre());
        ps.setString(3, abogado.getApellidos());
        ps.setString(4, abogado.getDireccion());
        
        int x = ps.executeUpdate();
        if(x!=1)
        {
            System.out.println("Filas afectadas (al insertar un solo abogado) no es 1");
        }
    }
    
    public Abogado consultaAbogadoUnico(Connection conexion, String dni) throws Exception
    {
        con=conexion;
        String plantilla = "SELECT * FROM Abogados WHERE UPPER(DNI)=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, dni);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            Abogado c=new Abogado();
            c.setDni(rs.getString("dni"));
            c.setNombre(rs.getString("nombre"));
            c.setApellidos(rs.getString("apellidos"));
            c.setDireccion(rs.getString("direccion"));
            return c;
        }
        else
        {
            return null;
        }
    }
    
    public void modificarAbogado(Connection conexion, Abogado abogado) throws Exception
    {
        con=conexion;
        String plantilla = "UPDATE abogados SET nombre=?, apellidos=?, direccion=? WHERE UPPER(dni)=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(4, abogado.getDni().toUpperCase());
        ps.setString(1, abogado.getNombre());
        ps.setString(2, abogado.getApellidos());
        ps.setString(3, abogado.getDireccion());
        
        int x = ps.executeUpdate();
        if(x!=1)
        {
            System.out.println("Filas afectadas (al modificar un solo abogado) no es 1");
        }
    }
    
    
}
