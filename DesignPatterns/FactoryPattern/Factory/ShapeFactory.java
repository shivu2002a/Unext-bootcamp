package DesignPatterns.FactoryPattern.Factory;

public class ShapeFactory {
    
    public Shape getShape(ShapeEnum type) {
        if (type.equals(ShapeEnum.RECTANGLE)) {
            return new Rectangle();
        }
        if (type.equals(ShapeEnum.CIRCLE)) {
            return new Circle();
        }
        return null;
    }
}
