package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberHandler {
	private NaturalNumber number;
	private NaturalNumberCreator creator;
	
	public void setCreator(NaturalNumberCreator creator) {
		this.creator = creator;
	}
	
	public void createNumber(int value) {
		this.number = this.creator.createNaturalNumber(value);
	}
	
	public NaturalNumber getNumber() {
		return number;
	}
}
