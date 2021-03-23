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
    private Connection con;
    
    public Connection conectar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/ejercicioabogados","root","usbw");
            
            if(con==null)
            {
                System.out.println("con=null");
            }
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e.getClass());
            return null;
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
            System.out.println("Problemas al desconectarse de la base de datos");
        }
    }
}
