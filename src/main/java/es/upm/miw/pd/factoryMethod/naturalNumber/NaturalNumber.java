package es.upm.miw.pd.factoryMethod.naturalNumber;

public abstract class NaturalNumber {

	protected int value;
	protected String[] text;

	public NaturalNumber(int value, String[] textValue) {
		this.setValue(value);
        this.setText(textValue);
	}

	public int getValue() {
	    return value;
	}

	public void setValue(int value) {
	    assert value >= 0;
	    this.value = value;
	}

	public void add(int value) {
	    this.setValue(this.value + value);
	}

	public String getText() {
	    if (this.value < text.length) {
	        return this.text[this.value];
	    } else {
	        return "???";
	    }
	}
	
	public void setText(String[] textValue) {
		this.text = textValue;
	}
}