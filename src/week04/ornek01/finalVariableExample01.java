package week04.ornek01;

public class finalVariableExample01 {


    private  static final double PI= 3.14159;// final değiskenler buyuk yazılır.

    public static void main(String[] args) {
        final int age =10;
        System.out.println(age);
       // age=25; -> bunu uygulayamayız age değişkeni final old. için yeni bir değer ataması kabul etmez
        System.out.println(age);
    }
}
