package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberCreatorFr extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber(int value) {
		return new NaturalNumberFr(value);
	}

}
