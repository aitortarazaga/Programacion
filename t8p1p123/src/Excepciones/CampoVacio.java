package Excepciones;

public class CampoVacio extends Exception {
    private String mensaje;
    
    public CampoVacio(String mensaje)
    {
        this.mensaje = mensaje;
    }

    public CampoVacio() {
        
    }
    
    public String getMensaje(){
        return mensaje;
    }
}
