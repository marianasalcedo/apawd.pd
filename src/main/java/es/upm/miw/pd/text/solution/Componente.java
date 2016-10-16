package es.upm.miw.pd.text.solution;

public abstract class Componente {
	private boolean esComponente;

	public abstract String dibujar(boolean isUpper);
	public abstract void add(Componente componente);
	public abstract void delete(Componente componente);

	public boolean esComponente(){
		return esComponente;
	}
	
	protected void setEsComponent(boolean esComponente){
		this.esComponente = esComponente;
	}
	
	

}
