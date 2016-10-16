package es.upm.miw.pd.text.solution;

public class Parrafo extends TextoComposite{

	@Override
	public void add(Componente componente) {
		if(!componente.esComponente()){
			this.addComponente(componente);
		}else{
			throw new UnsupportedOperationException("Operacion no soportada");			
		}
	}
	
	@Override
	public void delete(Componente componente) {
		if(!componente.esComponente()){
			this.deleteComponente(componente);
		}
	}
	
	@Override
	public String dibujar(boolean esMayuscula) {
		String result = "";
		for(Componente componente: this.get()){
			result += componente.dibujar(esMayuscula);
		}
		return result += "\n";
	}


}
