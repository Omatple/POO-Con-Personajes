package org.iesalandalus.programacion.javaorientadaobjetos.ejercicios.personaje;

import java.util.Objects;

public class Personaje {
    private static final int ENERGIA_INICIAL = 100;
    private static final String COLOR_INICIAL = "Rojo";
    private static final String PREFIJO_NOMBRE = "Personaje";
    private static int numPersonajes = 0;
    private String nombre;
    private int energia;
    private String color;
    private Posicion posicion;

    public Personaje() {
        numPersonajes++;
        nombre = PREFIJO_NOMBRE + numPersonajes;
        energia = ENERGIA_INICIAL;
        color = COLOR_INICIAL;
        posicion = new Posicion();
    }

    public Personaje(String nombre) {
        this();
        this.nombre = nombre;
    }

    public Personaje(String nombre, Posicion posicion) {
        this();
        this.nombre = nombre;
        this.posicion = new Posicion(posicion);
    }

    public Personaje(Personaje personaje) {
        nombre = personaje.getNombre();
        energia = personaje.getEnergia();
        color = personaje.getColor();
        posicion = new Posicion(personaje.posicion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Posicion getPosicion() {
        return this.posicion = new Posicion(posicion);
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = new Posicion();
    }

    public void chocar(int posiblePerdida) {
        energia -= posiblePerdida;
    }

    public void charlar(int posibleGanancia) {
        energia += posibleGanancia;
    }

    public void mover(int x, int y) {
        posicion.setX(posicion.getX() + x);
        posicion.setY(posicion.getY() + y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return energia == personaje.energia && Objects.equals(posicion, personaje.posicion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(energia, posicion);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", color='" + color + '\'' +
                ", posicion=" + posicion +
                '}';
    }
}
//