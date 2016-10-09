package es.upm.miw.pd.memento.calculator;

import es.upm.miw.pd.command.calculator.solution.Command;

public abstract class MementoCommand implements Command {

	private LoggerCalculator calculator;
	private String name;
	private LoggerManager<Log> loggerManager;
	
	public MementoCommand(LoggerCalculator calculator, String name, LoggerManager<Log> loggerManager){
		this.calculator = calculator;
		this.name = name;
		this.loggerManager = loggerManager;
	}
	
	
	public LoggerManager<Log> getLoggerManager() {
		return loggerManager;
	}


	public LoggerCalculator getCalculator() {
		return calculator;
	}
	
	@Override
	public String name() {
		return name;
	}

}
