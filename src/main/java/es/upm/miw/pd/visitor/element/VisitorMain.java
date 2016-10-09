package es.upm.miw.pd.visitor.element;

import java.util.ArrayList;
import java.util.Collection;

import upm.jbb.IO;

public final class VisitorMain {
    private Collection<Element> elements = new ArrayList<Element>();

    public VisitorMain() {
        elements.add(new ElementA());
        elements.add(new ElementA());
        elements.add(new ElementB());
        elements.add(new ElementA());
    }

    public void visitador1() {
        Visitor1 v1 = new Visitor1();
        for (Element elemento : elements) {
            elemento.accept(v1);
        }
    }

    public static void main(String[] args) {
        IO.getIO().addView(new VisitorMain());
    }
}
