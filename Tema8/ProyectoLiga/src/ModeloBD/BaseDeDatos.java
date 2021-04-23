/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import java.sql.*;

/**
 *
 * @author 1GDAW09
 */
public class BaseDeDatos {
    private Connection c;

    public Connection getC() {
        return c;
    }

    public BaseDeDatos() {
    }
    
    public Connection conectar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/ejercicioliga", "root", "usbw");
            
            return c;
        }
        catch(Exception e)
        {
            System.out.println("Error al conectarse con la base de datos");
            return null;
        }
    }
    
    public void desconectar()
    {
        try
        {
            c.close();
            
        }
        catch(Exception e)
        {
            System.out.println("Error al desconectarse de la base de datos");
        }
    }
}
