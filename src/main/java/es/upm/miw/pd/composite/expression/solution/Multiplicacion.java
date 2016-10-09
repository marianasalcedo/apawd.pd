package es.upm.miw.pd.composite.expression.solution;

public class Multiplicacion extends CompositeOperacion{

    public Multiplicacion(ComponentExpresion expresion1, ComponentExpresion expresion2) {
        super(expresion1, expresion2);
    }

    @Override
    public String toString() {
        return  "(" + leftArgument.toString() + "*" + rightArgument.toString() + ")" ;
    }

	@Override
	public int getResult(ComponentExpresion leftArgument, ComponentExpresion rightArgument) {
        return leftArgument.operar() * rightArgument.operar();
	}
    
}
