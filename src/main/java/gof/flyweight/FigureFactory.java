package gof.flyweight;

import gof.composite.entity.Shape;
import gof.flyweight.concrete.Circle;
import gof.flyweight.concrete.Point;
import gof.flyweight.concrete.Square;
import gof.flyweight.entity.Figure;

import java.util.HashMap;
import java.util.Map;

public class FigureFactory {
    public static final Map<String, Figure> FIGURES = new HashMap<>();

    public Figure getFigure(String figureName) {
        Figure figure = FIGURES.get(figureName);

        if (figure == null) {
            switch(figureName) {
                case "square":
                    figure = new Square();
                    break;
                case "circle":
                    figure = new Circle();
                    break;
                case "point":
                    figure = new Point();
                    break;
            }
            FIGURES.put(figureName, figure);
        }
        return figure;
    }
}
