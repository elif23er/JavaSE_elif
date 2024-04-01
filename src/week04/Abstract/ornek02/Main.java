package week04.Abstract.ornek02;

public class Main {
    public static void main(String[] args) {
        System.out.println("----Rectangle----");
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println(rectangle.calculateArea());
        rectangle.draw();

        System.out.println("----Circle----");
        Circle circle = new Circle(3.5);
        System.out.println(circle.calculateArea());
        circle.draw();
    }
}
