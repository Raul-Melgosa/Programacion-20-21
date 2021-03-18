/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import java.sql.*;
import ModeloUML.*;

/**
 *
 * @author 1GDAW09
 */
public class TablaRelacionAsistencias {
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void agregarFila(String dni, String nombreEvento) throws Exception
    {
        String plantilla = "INSERT INTO personaseventos(dni,nombre) VALUES (?,?)";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, dni);
        ps.setString(2, nombreEvento);
        ps.executeUpdate();
    }
}
