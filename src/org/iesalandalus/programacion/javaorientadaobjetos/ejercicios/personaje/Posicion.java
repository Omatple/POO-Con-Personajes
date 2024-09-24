package org.iesalandalus.programacion.javaorientadaobjetos.ejercicios.personaje;

import java.util.Objects;

public class Posicion {
    private static final int MIN_X = 0;
    private static final int MAX_X = 100;
    private static final int MIN_Y = 0;

    private static final int MAX_Y = 100;
    private int x;
    private int y;

    public Posicion() {
        x = MIN_X;
        y = MIN_Y;
    }

    public Posicion(int x, int y) {
        setX(x);
        setY(y);
    }

    public Posicion(Posicion posicion) {
        setX(posicion.getX());
        setY(posicion.getY());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < MIN_X || x > MAX_X) {
            this.x = MIN_X;
        } else {
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y < MIN_Y || y > MAX_Y) {
            this.y = MIN_Y;
        } else {
            this.y = y;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return x == posicion.x && y == posicion.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Posicion{" + "x=" + x + ", y=" + y + '}';
    }
}
