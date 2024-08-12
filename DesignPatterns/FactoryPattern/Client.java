package DesignPatterns.FactoryPattern;

import DesignPatterns.FactoryPattern.Factory.ShapeEnum;
import DesignPatterns.FactoryPattern.Factory.ShapeFactory;
import DesignPatterns.FactoryPattern.Factory.Shape;
public class Client {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        System.out.println("Creating circle object...");
        Shape circle = factory.getShape(ShapeEnum.CIRCLE);
        circle.draw();

        System.out.println("Creating rectangle object...");
        Shape rectangle = factory.getShape(ShapeEnum.RECTANGLE);
        rectangle.draw();
    }
    
}
