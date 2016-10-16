package es.upm.miw.pd.text.solution;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

	private static FactoriaCaracter factoria;
	private Map<String, Caracter> map;
	
	private FactoriaCaracter(){
		map = new HashMap<String, Caracter>();
	}
	
	public static FactoriaCaracter getFactoria(){
		if(factoria == null){
			factoria = new FactoriaCaracter();
		}
		return factoria;
	}
	
	public Caracter get(char key){
		if(map.containsKey(String.valueOf(key))){
			return map.get(String.valueOf(key));	
		}else{
			Caracter caracter = new Caracter(key);
			map.put(String.valueOf(key), caracter);
			return caracter;
		}
		
	}
	
}
