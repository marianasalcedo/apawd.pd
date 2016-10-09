package es.upm.miw.pd.composite.expression.solution;



public abstract class CompositeOperacion extends ComponentExpresion{
    protected String operacion;
    protected ComponentExpresion leftArgument;
    protected ComponentExpresion rightArgument;

    public CompositeOperacion(ComponentExpresion leftArgument, ComponentExpresion rightArgument){
    	this.leftArgument = leftArgument;
    	this.rightArgument = rightArgument;
    }
    
    public abstract int getResult(ComponentExpresion leftArgument, ComponentExpresion rightArgument);
    

	@Override
    public int operar() {
        return getResult(leftArgument, rightArgument);
    }



}
