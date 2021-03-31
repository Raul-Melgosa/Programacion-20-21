/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import java.sql.*;
import ModeloUML.*;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW09
 */
public class TablaAbogadosCasos {
    private Connection con;
    
    public ArrayList<String> consultaCasosAbogados(Connection conexion, String dni) throws Exception
    {
        this.con=conexion;
        
        String plantilla = "SELECT numeroExpediente FROM abogados-casos WHERE UPPER(dni)=UPPER(?)";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, dni);
        ResultSet resultados = ps.executeQuery();
        ArrayList <String> lista = new ArrayList();
        int x=0;
        while(resultados.next())
        {
            x++;
            lista.add(resultados.getString(x));
        }
        return lista;
    }
}
