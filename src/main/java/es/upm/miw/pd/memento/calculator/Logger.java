package es.upm.miw.pd.memento.calculator;

public interface Logger<T> {
	Log createMemento();
	void restoreMemento(T log);
}
