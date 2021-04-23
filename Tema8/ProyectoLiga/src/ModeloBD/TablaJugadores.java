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
public class TablaJugadores {
    private Connection c;

    public void setCon(Connection con) {
        this.c = con;
    }
    
    public void altaJugador(Connection con, Jugador j) throws Exception
    {
        c=con;
        String plantilla = "INSERT INTO jugadores(id,nombre,apellidos,dorsal,posicion,equipo) VALUES(?,?,?,?,?,?)";
        PreparedStatement ps = c.prepareStatement(plantilla);
        ps.setInt(1, j.getId());
        ps.setString(2, j.getNombre());
        ps.setString(3, j.getApellidos());
        ps.setInt(4, j.getDorsal());
        ps.setString(5, j.getPosicion());
        ps.setString(6, j.getEquipo().getNombre());
        ps.executeUpdate();
    }
    
    public ArrayList<Jugador> buscarJugadoresEquipo(Connection con, String nombreEquipo) throws Exception
    {
        c=con;
        String plantilla = "SELECT * FROM jugadores WHERE UPPER(equipo)=UPPER(?) ORDER BY dorsal";
        PreparedStatement ps = c.prepareStatement(plantilla);
        ps.setString(1, nombreEquipo);
        ResultSet rs=ps.executeQuery();
        ArrayList<Jugador> devolver = new ArrayList();
        while(rs.next())
        {
            String nombre=rs.getString("nombre");
            int dorsal=rs.getInt("dorsal");
            String apellidos=rs.getString("apellidos");
            String posicion=rs.getString("posicion");
            devolver.add(new Jugador(nombre,apellidos,dorsal,posicion));
        }
        return devolver;
    }
}
