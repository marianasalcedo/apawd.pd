package es.upm.miw.pd.state.connection;


public class StateRecibir extends State {

    @Override
    public String toString() {
        return "Estado Recibiendo";
    }

    @Override
    public void abrir(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");    
        
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

        if (conexion.getEstado() == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (conexion.getEstado() == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (conexion.getEstado() == Estado.PREPARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (conexion.getEstado() == Estado.ESPERANDO) {
        	if (respuesta == 0) {
                conexion.setEstado(Estado.PREPARADO);

            } else {
            	conexion.setEstado(Estado.CERRADO);
            }  
        }
        
    }



}
