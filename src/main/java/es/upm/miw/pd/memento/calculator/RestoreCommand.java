package es.upm.miw.pd.memento.calculator;

import upm.jbb.IO;

public class RestoreCommand extends MementoCommand{

	private static String NAME = "Restore";
	
	public RestoreCommand(LoggerCalculator calculator, LoggerManager<Log> loggerManager) {
		super(calculator, NAME, loggerManager);
	}
	
	@Override
	public void execute() {
		String logName = (String) IO.getIO().select(this.getLoggerManager().keys(), "Que entrada desea restaurar?: ");
		Log restoredLog = this.getLoggerManager().getMemento(logName);
		this.getCalculator().restoreMemento(restoredLog);
		
	}

}
