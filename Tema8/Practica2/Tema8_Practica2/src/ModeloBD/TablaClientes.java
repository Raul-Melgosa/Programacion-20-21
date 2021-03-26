/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class TablaClientes {
    private Connection con;
    
    public void altaCliente(Connection conexion, Cliente cliente) throws Exception
    {
        con=conexion;
        String plantilla = "INSERT INTO Clientes Values (?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, cliente.getDni());
        ps.setString(2, cliente.getNombre());
        ps.setString(3, cliente.getApellidos());
        ps.setString(4, cliente.getDireccion());
        ps.setString(5, cliente.getTelefono());
        ps.setString(6, cliente.getCorreo());
        
        int x = ps.executeUpdate();
        if(x!=1)
        {
            System.out.println("Filas afectadas (al insertar un solo cliente) no es 1");
        }
    }
    
    public Cliente consultaClienteUnico(Connection conexion, String dni) throws Exception
    {
        con=conexion;
        String plantilla = "SELECT * FROM Clientes WHERE UPPER(DNI)=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, dni);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            Cliente c=new Cliente();
            c.setDni(rs.getString("dni"));
            c.setNombre(rs.getString("nombre"));
            c.setApellidos(rs.getString("apellidos"));
            c.setDireccion(rs.getString("direccion"));
            c.setTelefono(rs.getString("telefono"));
            c.setCorreo(rs.getString("correo"));
            return c;
        }
        else
        {
            return null;
        }
    }
    
    public void bajaCliente(Connection conexion, String dni) throws Exception
    {
        con=conexion;
        String plantilla = "DELETE FROM Clientes WHERE UPPER(DNI)=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, dni);
        
        int x = ps.executeUpdate();
        if(x!=1)
        {
            System.out.println("Numero de filas afectadas al borrar un cliente distinto de 1");
        }
    }
    
    public void modificarCliente(Connection conexion, Cliente cliente) throws Exception
    {
        con=conexion;
        String plantilla = "UPDATE clientes SET nombre=?, apellidos=?, direccion=?, telefono=?, correo=? WHERE UPPER(dni)=?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(6, cliente.getDni().toUpperCase());
        ps.setString(1, cliente.getNombre());
        ps.setString(2, cliente.getApellidos());
        ps.setString(3, cliente.getDireccion());
        ps.setString(4, cliente.getTelefono());
        ps.setString(5, cliente.getCorreo());
        
        int x = ps.executeUpdate();
        if(x!=1)
        {
            System.out.println("Filas afectadas (al insertar un solo cliente) no es 1");
        }
    }
    
    public ArrayList<ArrayList<String>> consultaTodosClientes(Connection conexion) throws Exception
    {
        con=conexion;
        String plantilla = "SELECT * FROM Clientes";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ResultSet rs = ps.executeQuery();
        ArrayList<ArrayList<String>> listaTodosClientes = new ArrayList();
        while(rs.next())
        {
            ArrayList<String> c = new ArrayList();
            
            c.add(rs.getString("dni"));
            c.add(rs.getString("nombre"));
            c.add(rs.getString("apellidos"));
            c.add(rs.getString("direccion"));
            c.add(rs.getString("telefono"));
            c.add(rs.getString("correo"));
            
            TablaCasos tc = new TablaCasos();
            ArrayList<Caso> listaCasos=tc.consultaCasosCliente(con, rs.getString("dni"));
            for(int x=0;x<listaCasos.size();x++)
            {
                c.add(listaCasos.get(x).toString());
            }
            listaTodosClientes.add(c);
        }
        if(listaTodosClientes.isEmpty())
        {
            return null;
        }
        else
        {
            return listaTodosClientes;
        }
    }
}
