package week04.polymorphism.compiletime.ornek01;

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations() ;

        int result = math.add(10,20); // imt add ( int a, int b) metodu çağırılır
        double result2 = math.add(20,30); // double add(double a,double b) metodu çağırılır


    }
}
