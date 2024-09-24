package org.iesalandalus.programacion.javaorientadaobjetos.ejercicios.personaje;

public class Main {
    public static void main(String[] args) {
        Posicion miPosicion = new Posicion(10, 10);
        Personaje miPersonaje = new Personaje("Calamardo", miPosicion);
        System.out.println(miPosicion);
        miPersonaje.mover(10,0);
        System.out.println(miPosicion);
    }
}
