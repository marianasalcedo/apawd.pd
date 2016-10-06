package es.upm.miw.pd.memento.calculator;

import es.upm.miw.pd.command.calculator.solution.Calculator;
import es.upm.miw.pd.command.calculator.solution.CalculatorCommand;

public class GoBackCommand extends CalculatorCommand{

	private static String NAME = "Undo";
	
	public GoBackCommand(Calculator calculator){
		super(calculator, NAME);
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub		
	}

}
