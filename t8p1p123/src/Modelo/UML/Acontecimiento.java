package Modelo.UML;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Acontecimiento {
    // No pongo id
    private String nombre;
    private String lugar;
    
    private Date fecha;
    private Calendar horaInicio;
    private Calendar horaFinalizacion;
    // Utilizo clases distintas para hacerlo de distintas formas.
    
    private Integer aforo;

    public Acontecimiento() {
    }

    public Acontecimiento(String nombre) {
        this.nombre = nombre;
    }
    
    public Acontecimiento(String nombre, String lugar, Date fecha, Calendar horaInicio, Calendar horaFinalización, Integer numeroAsistentes) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFinalizacion = horaFinalización;
        this.aforo = numeroAsistentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicioString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(horaInicio.getTime());
    }
    
    public Calendar getHoraInicio(){
        return horaInicio;
    }

    public void setHoraInicio(Calendar horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinalizacionString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(horaFinalizacion.getTime());
    }
    
    public Calendar getHoraFinalizacion(){
        return horaFinalizacion;
    }

    public void setHoraFinalizacion(Calendar horaFinalización) {
        this.horaFinalizacion = horaFinalización;
    }

    public Integer getAforo() {
        return aforo;
    }

    public void setAforo(Integer numeroAsistentes) {
        this.aforo = numeroAsistentes;
    }
    
    @Override
    public String toString(){
        return nombre + " " + lugar + " " + fecha + " " + getHoraInicioString() + " " + getHoraFinalizacionString() + " "  + aforo;
    }
}
