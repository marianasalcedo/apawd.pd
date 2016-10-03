package es.upm.miw.pd.composite.expression.solution;

import java.util.ArrayList;
import java.util.List;


public abstract class CompositeOperacion extends ComponentExpresion{
    protected String operacion;
    protected List<ComponentExpresion> lista;

    public CompositeOperacion() {
        this.lista = new ArrayList<ComponentExpresion>();
    }
    
    public abstract int getResult(int acumulado, ComponentExpresion subNodo);
    
    @Override
    public int operar() {
        int resultado = 0;
        for (ComponentExpresion subNodo : this.lista) {
            resultado = getResult(resultado, subNodo);
        }
        return resultado;
    }



}
