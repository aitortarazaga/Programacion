/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Statement;
import java.util.Calendar;

/**
 *
 * @author Aitor
 */
public class EventoBD {
    
    public static void GuardarEvento(String nombre,Object lugar, String hInicio, String hFin, Calendar fecha, String capacidad){
        String hS = "TO_TIMESTAMP('" + hInicio + "','HH24:MI')";
        String hL = hFin;
        if(hFin != null)
            hL = "TO_TIMESTAMP('" + hFin + "','HH24:MI')";
        
        String secuencia="INSERT INTO Evento(nombre, lugar, fecha, hInicio, hFin, capacidad) VALUES('" + nombre + "','" + lugar + "'," + hS+ "," + hL + ",'" + capacidad + "')";
        
        try{
            GenericoBD.abrirConexion();
            Statement sentencia=GenericoBD.conexion().createStatement();
            sentencia.executeUpdate(secuencia);
            sentencia.executeUpdate("COMMIT");
            
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
            javax.swing. JOptionPane . showMessageDialog (null ," Problemas"+e. getMessage ());
        }
    }
}
