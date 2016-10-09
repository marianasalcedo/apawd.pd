package es.upm.miw.pd.memento.calculator;

import es.upm.miw.pd.command.calculator.solution.AddCommand;
import es.upm.miw.pd.command.calculator.solution.Calculator;
import es.upm.miw.pd.command.calculator.solution.CommandManager;
import es.upm.miw.pd.command.calculator.solution.PrintCommand;
import es.upm.miw.pd.command.calculator.solution.ResetCommand;
import es.upm.miw.pd.command.calculator.solution.SubtractCommand;
import upm.jbb.IO;

public final class MainMemento {
    private CommandManager commandManager;

    private MainMemento() {
        LoggerManager<Log> calculatorManager = new LoggerManager<Log>();
        LoggerCalculator calculatorLogger = new LoggerCalculator();
    	
	    this.commandManager = new CommandManager();
	    this.commandManager.add(new AddCommand(calculatorLogger));
	    this.commandManager.add(new SubtractCommand(calculatorLogger));
        this.commandManager.add(new ResetCommand(calculatorLogger));
        this.commandManager.add(new PrintCommand(calculatorLogger));
	    this.commandManager.add(new SaveCommand(calculatorLogger, calculatorManager));
	    this.commandManager.add(new RestoreCommand(calculatorLogger, calculatorManager));
    }
    
    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }
    
    public static void main(String[] args) {
    	IO.getIO().addView(new MainMemento());
        
    }

}
