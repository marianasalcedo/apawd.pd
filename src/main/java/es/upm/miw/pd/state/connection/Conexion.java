package es.upm.miw.pd.state.connection;

public class Conexion {
    private Estado estado;

    private Link link;
    private State state;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = Estado.CERRADO;
        setState(new StateAbrir());
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estado;
    }

    protected void setEstado(Estado estado) {
        this.estado = estado;
    }
    

    protected void setState(State state) {
        this.state = state;
    }
    
    public void abrir() {
       setState(new StateAbrir());
       this.state.abrir(this);
    }

    public void cerrar() {
        setState(new StateCerrar());
        this.state.cerrar(this);
    }

    public void parar() {
        setState(new StateParar());
        this.state.parar(this);
    }

    public void iniciar() {
        setState(new StateIniciar());
        this.state.iniciar(this);
    }

    public void enviar(String msg) {
        setState(new StateEnviar());
        this.state.enviar(this, msg);
    }

    public void recibir(int respuesta) {
        setState(new StateRecibir());
        this.state.recibir(this, respuesta);
    }

}
