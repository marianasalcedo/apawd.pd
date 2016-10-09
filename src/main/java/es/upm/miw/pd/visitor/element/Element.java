package es.upm.miw.pd.visitor.element;

public interface Element {
    void accept(Visitor visitor);
}
