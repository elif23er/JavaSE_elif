package week03.oop.principies.inheritance.ornek02;

public class Circle extends Shape{

        double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
        void draw() {

            System.out.println("Drawing a circle");
        }

        @Override
        double calculateArea() {
            // return.Math.PI*radius*radius;
            return Math.PI*Math.pow(radius,2);
        }
    }
