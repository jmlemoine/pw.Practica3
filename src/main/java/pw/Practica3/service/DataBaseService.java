package pw.Practica3.service;

import pw.Practica3.encapsulacion.Articulo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseService {

    public static DataBaseService instancia;
    private String URL = "jdbc:h2:tcp://localhost/~/arkhamknightXD"; //Modo Server...

    public Connection getConexion(){
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, "sa", "");
        }
        catch (SQLException ex){
            Logger.getLogger(ArticuloService.class.getName()).log(Level.SEVERE, null, ex);

        }
        return conexion;

    }

}
