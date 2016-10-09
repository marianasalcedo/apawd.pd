package es.upm.miw.pd.memento.calculator;

import java.util.SortedMap;
import java.util.TreeMap;

import es.upm.miw.pd.command.calculator.solution.Calculator;

public class LoggerManager<T>{
	
    private SortedMap<String, T> lista = new TreeMap<String, T>();

	public LoggerManager(){
		super();
	}
	
	public void addMemento(String key, T log) {
		 this.lista.put(this.lista.size() + ":" + key, log);
	}
	
	public String[] keys() {
        return this.lista.keySet().toArray(new String[0]);
    }
	
	public T getMemento(String key) {
		return this.lista.get(key);
		
	}
}
