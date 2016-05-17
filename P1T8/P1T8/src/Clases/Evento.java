/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author 1gbd10
 */
public class Evento {
    private String nombre;
    private Lugar lugar;
    private Date fecha;
    private Time hInicio;
    private Time hFinal;
    private int capacidad;

    public Evento() {
    }
    
    public Evento(String nombre, Lugar lugar, Date fecha, Time hInicio, Time hFinal, int capacidad) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hInicio = hInicio;
        this.hFinal = hFinal;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time gethInicio() {
        return hInicio;
    }

    public void sethInicio(Time hInicio) {
        this.hInicio = hInicio;
    }

    public Time gethFinal() {
        return hFinal;
    }

    public void sethFinal(Time hFinal) {
        this.hFinal = hFinal;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
