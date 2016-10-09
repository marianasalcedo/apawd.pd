package es.upm.miw.pd.memento.calculator;

import upm.jbb.IO;

public class SaveCommand extends MementoCommand{

	private static String NAME = "Save";
	
	public SaveCommand(LoggerCalculator calculator, LoggerManager<Log> loggerManager) {
		super(calculator, NAME, loggerManager);
	}
	
	@Override
	public void execute() {
		String key = IO.getIO().readString("Como desea llamar esta entrada?: ");
		Log log = this.getCalculator().createMemento();
		this.getLoggerManager().addMemento(key, log);
	}

}
