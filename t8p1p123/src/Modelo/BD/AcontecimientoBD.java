
package Modelo.BD;


import Modelo.UML.*;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.ArrayList;


public class AcontecimientoBD{
    // no static
    // También puede ser static 
    private ObjectContainer bd;
    
    public AcontecimientoBD() {
        bd = Db4o.openFile("BaseDatos");
        
    }
       
    public void cerrar(){
        bd.close();
    }
    
    /* public static void alta(Acontecimiento ac) throws Exception{
            GenericoBD.abrirBD();
            plantilla = "INSERT INTO acontecimiento (nombre, lugar, fecha,hora_I, hora_F, aforo) VALUES (?,?,?,?,?,?)";
            sentenciaCon = GenericoBD.getCon().prepareStatement(plantilla);
            sentenciaCon.setString(1,ac.getNombre());
            sentenciaCon.setString(2,ac.getLugar());
            // Conversion java.util.Date en java.sql.Date
            java.sql.Date sqlDate =  new java.sql.Date( ac.getFecha().getTime());
            sentenciaCon.setDate(3, sqlDate);
            // Conversion java.util.Calendar en java.sql.Time
            java.sql.Time sqlTimeHInicio= new java.sql.Time(ac.getHoraInicio().getTimeInMillis());
            sentenciaCon.setTime(4, sqlTimeHInicio);
            java.sql.Time sqlTimeHFin= new java.sql.Time(ac.getHoraFinalizacion().getTimeInMillis());
            sentenciaCon.setTime(5, sqlTimeHFin);
            
            sentenciaCon.setInt(6,ac.getAforo());
            
            sentenciaCon.executeUpdate();
            
            // Acontecimiento duplicado ???????????????? not null
            // Consulta por nombre y/o fecha y/0 lugar ?????
            
            GenericoBD.cerrarBD();
    }*/
    
    public  void alta(Acontecimiento ac) throws Exception{
           bd.store(ac);
    }
    
    public  void update(Acontecimiento ac) throws Exception{
          bd.store(ac);
    }
    
    // Alta y update se pueden unificar
    public  void delete(Acontecimiento ac) throws Exception{
            bd.delete(ac);
    }
    
    public  String listado() throws Exception{
        // Consulta de todos
           String mensaje="";
           
           ObjectSet resultado = bd.queryByExample(Acontecimiento.class);
           while (resultado.hasNext())
           {
               Acontecimiento ac = (Acontecimiento) resultado.next();
               mensaje += "\n" + ac.toString();
           }
           
           return mensaje;
    }
    
    // busquedaByNombre
    public  Acontecimiento busqueda(Acontecimiento a) throws Exception
    {
        // busqueda de 0 - 1
        ObjectSet resultado = bd.queryByExample(a);
        if (resultado.hasNext())
           {
               Acontecimiento ac = (Acontecimiento) resultado.next();
               return ac;
           }
        return null;
    }
    
    
    public 
    
    
    public ArrayList<Acontecimiento> llenarcbAc(Acontecimiento a){
        ArrayList<Acontecimiento> acontec=new ArrayList();
        ObjectSet resultado = bd.queryByExample(a);
        if (resultado.hasNext())
           {
               Acontecimiento ac = (Acontecimiento) resultado.next();
               acontec.add(ac);
               return acontec;
           }
        return null;
    }
}

