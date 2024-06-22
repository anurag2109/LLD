package Creational_Design_Patterns.Factory_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShapeInstance("Circle");
        circle.computeArea();

        Shape square = shapeFactory.getShapeInstance("Square");
        square.computeArea();
    }
}
