package es.upm.miw.pd.text.solution;

public class Caracter extends Componente{

	private char caracter;
	
	public Caracter(char caracter){
		this.caracter = caracter;
		setEsComponent(false);
	}
	
	@Override
	public void add(Componente componente) {		
	}

	@Override
	public void delete(Componente componente) {		
	}


	@Override
	public String dibujar(boolean isMayuscula) {
		if(isMayuscula){
			return String.valueOf(caracter).toUpperCase();
		}else{
			return String.valueOf(caracter);
		}
		
	}

}
