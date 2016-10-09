package es.upm.miw.pd.composite.expression.solution;

public class Numero extends ComponentExpresion {
    
    private int numero;
    
    public Numero(int numero){
        this.numero = numero;
    }
    
    @Override
    public int operar() {
        return this.numero;
    }

    @Override
    public String toString() {
        return this.numero + "";
    }

}
