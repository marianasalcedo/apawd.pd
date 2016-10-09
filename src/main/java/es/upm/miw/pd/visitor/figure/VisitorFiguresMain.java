package es.upm.miw.pd.visitor.figure;


import java.util.ArrayList;
import java.util.Collection;

import upm.jbb.IO;

public final class VisitorFiguresMain {
    private Collection<Figure> figures = new ArrayList<Figure>();

    public VisitorFiguresMain() {
        figures.add(new Circle("Circle 1", 2.0));
        figures.add(new Square("Square 1", 3));
        figures.add(new Triangle("Triangle 1", 3.0, 3.0));
        figures.add(new Circle("Circle 2", 1.0));
        figures.add(new Circle("Circle 3", 3.0));
        figures.add(new Triangle("Triangle 2", 1.0, 4.0));
        figures.add(new Square("Square 2", 5));
        figures.add(new Square("Square 3", 1));
    }

    public void visitorFigureSide() {
        VisitorFigureSide v = new VisitorFigureSide();
        for (Figure figure : figures) {
            figure.accept(v);
        }
        System.out.println(v.getTotalSide());
    }

    public void visitorFigureArea() {
        VisitorFigureArea v = new VisitorFigureArea();
        for (Figure figure : figures) {
            figure.accept(v);
        }
        System.out.println(v.getTotalArea());
    }

    public static void main(String[] args) {
        IO.getIO().addView(new VisitorFiguresMain());
    }
}
