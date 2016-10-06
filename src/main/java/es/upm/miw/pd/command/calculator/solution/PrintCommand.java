package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;

public class PrintCommand extends CalculatorCommand{

	private static String NAME = "Print";
	
	public PrintCommand(Calculator calculator) {
		super(calculator, NAME);
	}
	
	@Override
	public void execute() {
		IO.getIO().println(this.getCalculator().getTotal());
		
	}

}
