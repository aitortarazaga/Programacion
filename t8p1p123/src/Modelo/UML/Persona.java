/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.UML;

import java.util.ArrayList;

/**
 *
 * @author 1gbd10
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private Empresa empresa;
    private ArrayList<Acontecimiento> ac;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, Empresa empresa, ArrayList<Acontecimiento> ac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.empresa = empresa;
        this.ac = ac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Acontecimiento> getAc() {
        return ac;
    }

    public void setAc(ArrayList<Acontecimiento> ac) {
        this.ac = ac;
    }
}
