package week05.pradicate;

import java.util.function.Predicate;

public class Pradicateexample03 {

    public static void main(String[] args) {
        Predicate<String> nullCheckPradicate = e -> e!=null;
        Predicate<String> lengethCheckPradicate = e -> e.length() >5;

        Predicate<String> andPradicate =nullCheckPradicate.and(lengethCheckPradicate);

        String temp1 = null;
        String temp2 ="java";
        String temp3= "alperen";
        String temp4= "phyton";
        String temp5 ="ali";
        String temp6 ="hello";

        System.out.println(andPradicate.test(temp1));
        System.out.println(andPradicate.test(temp2));
        System.out.println(andPradicate.test(temp3));
        System.out.println(andPradicate.test(temp4));
        System.out.println(andPradicate.test(temp5));
        System.out.println(andPradicate.test(temp6));

    }
}
