package week04.Abstract.ornek02;

public class Rectangle extends Shape {

    private double width;
    private double height;

    Rectangle(double widht , double height){
        this.width =widht;
        this.height=height;
    }
   @Override
  public double calculateArea() {
       return width*height;
    }

////    @Override
////    public double calculateArea(){
////        return 0.0;
//    }

//    @Override
//    public double calculateArea() {
//        return 0;
//    } // alt+ insert ->implement methods

}
