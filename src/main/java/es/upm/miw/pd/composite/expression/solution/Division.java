package es.upm.miw.pd.composite.expression.solution;

public class Division extends CompositeOperacion{

    public Division(ComponentExpresion expresion1, ComponentExpresion expresion2) {
        super(expresion1, expresion2);
    }

    @Override
    public String toString() {
        return  "(" + leftArgument.toString() + "/" + rightArgument.toString() + ")" ;
    }

	@Override
	public int getResult(ComponentExpresion leftArgument, ComponentExpresion rightArgument) {
        return Math.round(leftArgument.operar() / rightArgument.operar()) ;
	}

}
