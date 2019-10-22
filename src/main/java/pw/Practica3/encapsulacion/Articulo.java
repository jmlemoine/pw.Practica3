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

    @Override
    public String toString(){
        return super.toString();

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public List<Comentario> getListComentarios() {
        return listComentarios;
    }

    public void setListComentarios(List<Comentario> listComentarios) {
        this.listComentarios = listComentarios;
    }

    public List<Etiqueta> getListEtiquetas() {
        return listEtiquetas;
    }

    public void setListEtiquetas(List<Etiqueta> listEtiquetas) {
        this.listEtiquetas = listEtiquetas;
    }

    public String getCuerpoCorto() {
        String cuerpoCorto = "";

        for(int i = 0; i < 70; i++){
            if(i >= this.getCuerpo().length())
            {
                break;

            }
            cuerpoCorto += this.getCuerpo().charAt(i);

        }
        return cuerpoCorto;

    }

}
