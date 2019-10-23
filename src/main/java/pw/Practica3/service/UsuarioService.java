package pw.Practica3.service;

import pw.Practica3.encapsulacion.Usuario;
import pw.Practica3.service.DataBaseService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UsuarioService {

    public static Usuario restaurarSesion(String sesion){

        try {
            DataBaseService databaseService = new DataBaseService();
            Connection conexion = databaseService.getConexion();

            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM USUARIOS WHERE SESION = '"+ sesion +"';");
            while (rs.next()){
                return new Usuario(rs.getLong("id"), rs.getNString("username"), rs.getNString("password"), rs.getBoolean("administrator"), rs.getBoolean("autor"));
            }
            statement.close();
            conexion.close();

        }
        catch (Exception e){
            e.printStackTrace();

        }
        return null;

    }

}
