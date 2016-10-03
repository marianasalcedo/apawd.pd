package es.upm.miw.pd.composite.expression.solution;

public class Resta extends CompositeOperacion{
   
    public Resta(ComponentExpresion expresion1, ComponentExpresion expresion2) {
        this.lista.add(expresion1);
        this.lista.add(expresion2);
    }
    
    @Override
    public int getResult(int acumulado, ComponentExpresion subNodo) {
        return acumulado - subNodo.operar() ;
    }

    @Override
    public String toString() {
        return "-";
    }
    

}
