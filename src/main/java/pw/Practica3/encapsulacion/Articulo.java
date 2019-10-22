package pw.Practica3.encapsulacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Articulo {

    private long id;
    private String titulo;
    private String cuerpo;
    private Date fecha;
    private Usuario autor;
    private List<Comentario> listComentarios;
    private List<Etiqueta> listEtiquetas;

    public Articulo(long id, String titulo, String cuerpo, Date fecha, Usuario autor, ArrayList<Comentario> listComentarios, ArrayList<Etiqueta> listEtiquetas) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
        this.autor = autor;
        this.listComentarios = listComentarios;
        this.listEtiquetas = listEtiquetas;
    }

    public Articulo() {

    }



}
