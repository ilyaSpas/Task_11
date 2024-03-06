package org.example;


public class Main {
    public static void main(String[] args) {
        FeetConverter<AbstractShape> converter = new FeetConverter<>();

        AbstractShape circle = new Circle(5);
//        System.out.println("Circle area is " + circle.getArea());
//        System.out.println("Circle perimeter is " + circle.getPerimeter());
//        circle.getInfo();
        converter.getInfoToFeet(circle);

        AbstractShape triangle = new Triangle(2, 3);
//        System.out.println("Triangle area is " + triangle.getArea());
//        System.out.println("Triangle perimeter is " + triangle.getPerimeter());
//        triangle.getInfo();
        converter.getInfoToFeet(triangle);

        AbstractShape square = new Square(3, 4);
//        System.out.println("Square area is " + square.getArea());
//        System.out.println("Square perimeter is " + square.getPerimeter());
//        square.getInfo();
        converter.getInfoToFeet(square);

        Cub cub = new Cub(3,3, 3);
        cub.getInfo();
    }
}