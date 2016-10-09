package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberMain {
	private static NaturalNumberHandler handler = new NaturalNumberHandler();
	
	public static void main(String[] args) {
		NaturalNumberCreator es = new NaturalNumberCreatorEs();
		NaturalNumberCreator fr = new NaturalNumberCreatorFr();
		NaturalNumberCreator en = new NaturalNumberCreatorEn();
		
		handler.setCreator(es);
		handler.createNumber(1);
		System.out.println(handler.getNumber().getText());

		handler.setCreator(en);
		handler.createNumber(1);
		System.out.println(handler.getNumber().getText());

		handler.setCreator(fr);
		handler.createNumber(1);
		System.out.println(handler.getNumber().getText());
	}
}
