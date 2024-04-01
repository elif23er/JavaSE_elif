package week04.interfaceexamples.ornek01;

public class Rectangle implements Polygon {
    @Override
    public void getArea(int lenght, int width) {
        System.out.println("The area of the rentagle is "+(lenght*width));


    }
}
