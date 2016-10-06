package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;

public class SubtractCommand extends CalculatorCommand{

	private static String NAME = "Substract";
	
	public SubtractCommand(Calculator calculator) {
		super(calculator, NAME);
	}
	
	@Override
	public void execute() {
		this.getCalculator().subtract(IO.getIO().readInt());
		
	}

}
