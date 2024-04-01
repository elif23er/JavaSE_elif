package week03.oop.principies.inheritance.ornek02;

public class Rectangle extends Shape {

    double with ;
    double height ;

    public Rectangle(String color, double with, double height) {
        super(color);
        this.with = with;
        this.height = height;
    }

    public Rectangle(double with, double height) {
        this.with = with;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    double calculateArea() {
        return with*height;
    }
}
