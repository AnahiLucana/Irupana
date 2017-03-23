package com.example.anahi.irupana;


import com.google.gson.annotations.Expose;

public class Producto {
    //Agregar expose para serializacion
    @Expose
    protected int id;

    @Expose
    protected String titulo;

    @Expose
    protected String descripcion;

    @Expose
    protected int imagen;

    @Expose
    protected String descripcionLarga;

    @Expose
    protected double precio;

    public Producto() {
    }

    //Creamos el constructor
    public Producto(int id, String titulo, String descripcion, int imagen)
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

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
