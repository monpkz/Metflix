package app;

import java.util.ArrayList;
import java.util.List;
import app.personas.*; //En este caso importo todas las clases personas

public abstract class Contenido {
    private String nombre;
    private Genero genero;
    private Idioma idiomaOrigen;// Idioma Origen
    private int añoLanzamiento;
    private List<Actor> actores = new ArrayList<>();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Idioma getIdiomaOrigen() {
        return this.idiomaOrigen;
    }

    public void setIdiomaOdioma(Idioma idiomaOrigen) {
        this.idiomaOrigen = idiomaOrigen;
    }

    public int getAñoLanzamiento() {
        return this.añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public List<Actor> getActores() {
        return this.actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }
}