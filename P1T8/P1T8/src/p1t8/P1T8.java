
package p1t8;

import Clases.EventoBD;
import Clases.LugarBD;
import com.db4o.*;
import Vistas.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class P1T8 {

    private static Menu m;
    
    public static void main(String[] args) {
        crearMenu();
    }
    
    public static void crearMenu(){
        m=new Menu();
        m.setVisible(true);
    }
    
    public static void cerrarMenu(){
        m.dispose();
    }
    
    public static ArrayList<String> llenarCbLugar(){
        return LugarBD.llenarCbLugar();
    }
    
    
    public static void GuardarEvento(String nombre, Object lugar, Calendar fecha, int hInicio, int mInicio, int hFin, int mFin, String capacidad){
        String hSalida=hInicio + ":" + mInicio;
        String hF = "";
        
        hF=hFin + ":" + mFin;
        
        SimpleDateFormat dt= new SimpleDateFormat("hh:mm");
        try{
            if(hSalida.compareToIgnoreCase("Hora:Minutos") != 0)
                dt.parse(hSalida);
            else
                hSalida = null;
            
            if(hF.compareToIgnoreCase("Hora:Minutos") != 0)
                dt.parse(hF);
            else
                hF = null;
        
        }
        catch(ParseException pe){
            JOptionPane.showMessageDialog(null,pe.getMessage());
        }
        
        EventoBD.GuardarEvento(nombre,lugar,  hSalida, hF, fecha, capacidad);
    }
    
}
