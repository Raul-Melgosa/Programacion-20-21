/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBaseDatos;

import java.sql.*;
import javax.swing.JOptionPane;
import tema8_practica1_ejercicio1.Controlador;

/**
 *
 * @author 1GDAW09
 */
public class BaseDatos {
    private Connection con;
    
    public Connection getConnection()
    {
        return this.con;
    }
    
    public void conectar()
    {
        try
        {
        // Registramos el driver
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/Ejercicio1";
            String user="root";
            String password="usbw";
            con = DriverManager.getConnection(url,user,password);
        }
        catch(Exception e)
        {
            System.out.println("Error en la conexion a base de datos MySql");
            Controlador.salir();
        }
    }
    
    public void desconectar()
    {
        try
        {
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Error con la base de datos MySql");
            Controlador.salir();
        }
    }
    
    public void probar() throws Exception
    {
        try
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
        catch(NumberFormatException e)
        {
            System.out.println("Error Prueba");
        }
    }
}
