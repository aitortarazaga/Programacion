package t8p1p123;

import GUI.*;
import Modelo.BD.*;

import Modelo.UML.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Controlador {
   
    private static Acontecimiento acontecimiento;
    private static Persona persona;
    private static Empresa empresa;
    
    private static AcontecimientoBD abd;
    
    private static VentanaPrincipal vp;
    private static VentanaEventos ve;
    private static ConfirmarAsistencia ca;
    
    
    
    public static void main(String[] args) { 
        
        abd = new AcontecimientoBD();
        
        abrirVentanaPrincipal();
    }
    
    public static void visualizarVentanaAlta(){
        // Dejo por debajo la principal
         ve = new VentanaEventos();
         ve.setVisible(true);
    }
    
    public static void volver(javax.swing.JFrame v){
        v.dispose();
    }
    
    public static void grabarAcontecimiento(String nombre, String lugar, Date fecha, String hInicio, String hFinalizacion, int nro)throws Exception{
        Calendar hI =  Calendar.getInstance(); 
        Calendar hF =  Calendar.getInstance(); 
        SimpleDateFormat sdf =  new SimpleDateFormat ( "HH:mm:ss" ); 
        hI.setTime(sdf.parse(hInicio) );
        hF.setTime(sdf.parse (hFinalizacion) );
        acontecimiento = new Acontecimiento(nombre,lugar, fecha,hI,hF,nro);
        
        // LLamada al método alta  AcontecimientoBD.alta(acontecimiento);
        abd.alta(acontecimiento);
    }
    
   
   public static void terminar(){
       //
       abd.cerrar();
       System.exit(0);
   }
   
   public static String listado() throws Exception{
       return abd.listado();
   }
   
   public static ArrayList<Acontecimiento> llenarAcontecimientos() throws Exception{
       return abd.llenarcbAc(acontecimiento);
   }
   
   
   public static void buscarAcontecimiento(String nombre, String operacion) throws Exception{
       // Crear objeto y buscarlo en la base de datos
       acontecimiento = new Acontecimiento(nombre);
       //
       acontecimiento = abd.busqueda(acontecimiento);
       if (acontecimiento == null)
           throw new NullPointerException();
       // Visualizar ventana con datos
       // Le paso el objeto para escribir menos pero mezclo vista y modelo
        //  ve = new VentanaEventos(acontecimiento.getNombre(), .... ,operacion);
        ve = new VentanaEventos(acontecimiento,operacion);
        ve.setVisible(true);
   }
   
   public static void doBaja() throws Exception{
       abd.delete(acontecimiento);
   }
   
   public static void doUpdate(String lugar, Date fecha, String hInicio, String hFinalizacion, int nro)throws Exception{
        Calendar hI =  Calendar.getInstance(); 
        Calendar hF =  Calendar.getInstance(); 
        SimpleDateFormat sdf =  new SimpleDateFormat ( "HH:mm:ss" ); 
        hI.setTime(sdf.parse(hInicio) );
        hF.setTime(sdf.parse (hFinalizacion) );
        // Modifico el objeto
        acontecimiento.setLugar(lugar);
        acontecimiento.setFecha(fecha);
        acontecimiento.setHoraInicio(hI);
        acontecimiento.setHoraFinalizacion(hF);
        acontecimiento.setAforo(nro);
        
        // AcontecimientoBD.update(acontecimiento);
        abd.update(acontecimiento);
    }
   
   public static void eventoRepetido(String nombre) throws Exception{
       Acontecimiento a = abd.busqueda(new Acontecimiento(nombre));
       if (a != null)
           throw new Exception();
   }
   
   
   public static void abrirCA(){
       ca=new ConfirmarAsistencia();
       ca.setVisible(true);
   }
   
   public static void cerrarCA(){
       ca.dispose();
   }
   
   
   public static void abrirVentanaPrincipal(){
       vp = new VentanaPrincipal();
       vp.setVisible(true);
   }
   
   
   public static void buscarSitio(Object evento){
       
   }
   
   
   public static void guardarAsistente(String nombre, String apellido, String dni, String nombreemp, String ciudad, Object evento){
       empresa.setCiudad(ciudad);
       empresa.setNombre(nombreemp);
       empresa=new Empresa(nombreemp, ciudad);
       
       persona.setNombre(nombre);
       persona.setApellido(apellido);
       persona.setDni(dni);
       persona.setEmpresa(empresa);
       persona.setAc(evento);
       persona=new Persona(nombre, apellido, dni, empresa);
       
   }
}
