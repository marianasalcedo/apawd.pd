package es.upm.miw.pd.text.solution;

import java.util.ArrayList;
import java.util.List;

public abstract class TextoComposite extends Componente{
	
	private List<Componente> componentes;
	
	public TextoComposite(){
		this.componentes = new ArrayList<>();
		this.setEsComponent(true);
	}
	
	public List<Componente> get(){
		return componentes;
	}
	
	protected void addComponente(Componente componente){
		this.componentes.add(componente);
	}
	
	protected void deleteComponente(Componente componente){
		if(!componentes.isEmpty()){
			componentes.remove(componente);
		}
	}
}
