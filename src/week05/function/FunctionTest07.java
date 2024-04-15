package week05.function;

import java.util.function.Function;

public class FunctionTest07 {
    public static void main(String[] args) {

        // metin dizisini alıp uzunluğunu hesaplayan bir function
        Function<String,Integer> stringlength = String::length;


        // uzunluğu alınan metin dizisini alıp , uzunluğun karesini hesaplayan bir function

        Function<Integer, Integer> squareOfLength = n -> (int) Math.pow(n,2);

        // bu iki function'ı birleştirip bir arada uygulayan function
        Function<String,Integer>combinedFunction=stringlength.andThen(squareOfLength);
        System.out.println("Alperen");
    }
}
