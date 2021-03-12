/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import com.mysql.jdbc.*;
import java.sql.DriverManager;

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
    
    public void conectar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/ejercicio2", "root", "usbw");
            
        }
        catch(Exception e)
        {
            System.out.println("excepcion generica");
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
            System.out.println("excepcion generica");
        }
    }
}
