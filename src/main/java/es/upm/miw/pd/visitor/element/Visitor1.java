package es.upm.miw.pd.visitor.element;

public class Visitor1 extends Visitor {

    @Override
    public void visitElementA(ElementA e) {
        System.out.println("Visitor 1! element: " + e.getAttributeA());
    }

    @Override
    public void visitElementB(ElementB e) {
        System.out.println("Visitor 1! element: " + e.getAttributeB());
    }

}
