package week04.generics;

public class GenericClassTExtandsA <T extends Number>{

    public void display (){
        System.out.println("This is a bounded type generics class  ");
    }

    public static void main(String[] args) {
         //GenericClassTExtandsA<String> stringObj = new GenericClassTExtandsA<String>();
         //Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'
         GenericClassTExtandsA<Integer>intObj = new GenericClassTExtandsA<>();
    }
    }
