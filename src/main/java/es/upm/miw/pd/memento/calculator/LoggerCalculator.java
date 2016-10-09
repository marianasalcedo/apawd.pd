package es.upm.miw.pd.memento.calculator;

import es.upm.miw.pd.command.calculator.solution.Calculator;

public class LoggerCalculator extends Calculator implements Logger<Log> {

	@Override
	public Log createMemento() {
		return new Log(this.getTotal());
	}

	@Override
	public void restoreMemento(Log log) {
		this.setTotal(log.getTotal());
	}

}
