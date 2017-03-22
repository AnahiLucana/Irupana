package com.example.anahi.irupana;




public class TiposDePanes {

    protected int id;
    protected String titulo;
    protected String descripcion;
    protected int imagen;
    protected String descripcionLarga;
    protected double precio;

    //Creamos el constructor
    public TiposDePanes(int id,String titulo, String descripcion, int imagen)
    {
        this.id=id;
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.imagen=imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
