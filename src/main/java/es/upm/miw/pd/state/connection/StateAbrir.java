package es.upm.miw.pd.state.connection;


public class StateAbrir extends State {

    @Override
    public String toString() {
        return "Estado Preparado";
    }

    @Override
    public void abrir(Conexion conexion) { 
        if (conexion.getEstado() == Estado.CERRADO) {
            conexion.setEstado(Estado.PREPARADO);
        } else if (conexion.getEstado() == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (conexion.getEstado() == Estado.PREPARADO) {
        } else if (conexion.getEstado() == Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } 
    }

    @Override
    public void cerrar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");  
        
    }

    @Override
    public void parar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");  
        
    }

    @Override
    public void iniciar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");  
        
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        throw new UnsupportedOperationException("Acción no permitida... ");    
        
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");    
        
    }


}
