package pw.Practica3.service;

import pw.Practica3.encapsulacion.Articulo;
import pw.Practica3.encapsulacion.Comentario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ArticuloService {

    public static ArrayList<Articulo> listarArticulo(){
        Connection conexion = DataBaseService.getInstancia().getConexion();
        ArrayList<Articulo> articulos = new ArrayList<>();

        try {
            //Consultando todos los usuarios
            String articulosQuery = "SELECT * FROM articulos ORDER BY fecha DESC;";

            //Ejecuta el query pasado por parámetro "usuarioDefecto"
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(articulosQuery);

            while (resultado.next()){
                ArrayList<Comentario> comentarios =
            }

        }
        catch (SQLException ex){

        }

    }

}
