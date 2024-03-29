package pw.Practica3.path;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;
import org.jasypt.util.text.StrongTextEncryptor;
import pw.Practica3.Main;
import pw.Practica3.encapsulacion.Articulo;
import pw.Practica3.encapsulacion.Etiqueta;
import pw.Practica3.encapsulacion.Usuario;
import pw.Practica3.service.ArticuloService;
import pw.Practica3.service.UsuarioService;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Ruta {

    static ArrayList<Etiqueta> etiquetaAux = new ArrayList<>();
    static ArrayList<Articulo> articulos = new ArticuloService().
    static String nombreUsuario = "";
    static Boolean etiquetasBool = false;
    static Usuario usuario;

    public static void crearRutas() {

        final Configuration configuration = new Configuration(new Version(2, 3, 23));
        configuration.setClassForTemplateLoading(Main.class, "/");

        staticFiles.location("/publico");

        //filtros
        before("/", ((req, res) -> {
            if(req.cookie("sesionSemanal") != null){
                StrongTextEncryptor encriptador = new StrongTextEncryptor();
                encriptador.setPassword("manga-anime-empire");
                String sesionSemanal = encriptador.decrypt(req.cookie("sesionSemanal"));

                Usuario usuarioRestaurado = UsuarioService.restaurarSesion(sesionSemanal);
                nombreUsuario = usuarioRestaurado.getUsername();
                usuario = usuarioRestaurado;
                req.session().attribute("sesionUsuario", usuarioRestaurado);

                if (usuarioRestaurado != null){
                    req.session(true);
                    req.session().attribute("sesionUsuario", usuarioRestaurado);

                }

            }

            if (req.session().attribute("sesionUsuario") == null) {
                res.redirect("/login");
            }

        }));

        get("/login", ((req, res) -> {
            StringWriter writer = new StringWriter();
            Map<String, Object> atributos = new HashMap<>();
            Template template = configuration.getTemplate("plantillas/login.ftl");
            template.process(atributos, writer);
        return writer;

        }));

        post("/login", (req, res) -> {
            try{
                nombreUsuario = req.queryParams("username");
                String contrasena = req.queryParams("password");
                usuario = UsuarioService.
            }
        });

    }

}
