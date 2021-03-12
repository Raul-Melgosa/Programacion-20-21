/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBaseDatos;

import Excepciones.PersonaNoEncontrada;
import ModeloUML.Persona;
import java.sql.*;

/**
 *
 * @author 1GDAW09
 */
public class TablaPersonas {
    private Connection con;

    public TablaPersonas(Connection con) {
        this.con = con;
    }
    
    public void select() throws Exception
    {
        PreparedStatement ps = con.prepareStatement("SELECT Nombre,Dni,Telefono,Edad FROM Personas;");
        ResultSet resultado = ps.executeQuery();
        if(resultado.next())
        {
            System.out.println(resultado.getString("Nombre"));
            System.out.println(resultado.getString("dni"));
            System.out.println(resultado.getString("telefono"));
            System.out.println(resultado.getString("edad"));
        }
    }
    
    public boolean insertar(Persona p) throws Exception
    {
        String plantilla="INSERT INTO personas VALUES (?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getNombre());
        ps.setString(2, p.getDni());
        ps.setString(3, p.getEdad());
        ps.setString(4, p.getProfesion());
        ps.setString(5, p.getTelefono());
        ps.executeUpdate();
        return true;
    }
    
    public Persona selectUnica(String dni) throws Exception
    {
        String plantilla="SELECT nombre, dni, edad, profesion, telefono FROM personas WHERE upper(dni)=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, dni.toUpperCase());
        
        ResultSet rs = ps.executeQuery();
        Persona p= new Persona();
        if(rs.next())
        {
            p.setNombre(rs.getString("nombre"));
            p.setDni(rs.getString("dni"));
            p.setEdad(rs.getString("edad"));
            p.setProfesion(rs.getString("profesion"));
            p.setTelefono(rs.getString("telefono"));
        }
        else
        {
            throw new PersonaNoEncontrada();
        }
        return p;
    }
}
