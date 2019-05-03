package gof.flyweight;

import gof.flyweight.entity.Figure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightApp {
    public static void main(String[] args) {
        FigureFactory figureFactory = new FigureFactory();

        List<Figure> figures = new ArrayList<>();

        figures.add(figureFactory.getFigure("square"));
        figures.add(figureFactory.getFigure("point"));
        figures.add(figureFactory.getFigure("point"));
        figures.add(figureFactory.getFigure("square"));
        figures.add(figureFactory.getFigure("circle"));
        figures.add(figureFactory.getFigure("square"));

        Random random = new Random();

        for (Figure f : figures) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);

            f.draw(x, y);
        }
    }
}
