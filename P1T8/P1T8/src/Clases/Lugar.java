/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1gbd10
 */
public class Lugar {
    private String nombre;
    private ArrayList<Evento> eventos;

    public Lugar(String nombre, ArrayList<Evento> eventos) {
        this.nombre = nombre;
        this.eventos=eventos;
    }

    public Lugar() {
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
