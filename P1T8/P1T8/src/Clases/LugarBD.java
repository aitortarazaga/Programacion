/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 1gbd10
 */
public class LugarBD {
    public static ArrayList<String> llenarCbLugar(){
        ArrayList<String> lu = new ArrayList();
        
        try{
            GenericoBD.abrirConexion();
            Statement sentencia = GenericoBD.conexion().createStatement();
            ResultSet centro = sentencia.executeQuery("select nombre from Lugar");
            while(centro.next()){
                lu.add(centro.getString("nombre"));
            }
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
            
        }
        return lu;
    }
}
