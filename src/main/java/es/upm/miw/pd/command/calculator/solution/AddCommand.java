package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;

public class AddCommand extends CalculatorCommand{
	
	private static String NAME = "Add";
	
	public AddCommand(Calculator calculator){
		super(calculator, NAME);
	}

	@Override
	public void execute() {
		this.getCalculator().add(IO.getIO().readInt());
	}

}
