package week05.pradicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Pradicateexample04 {

    public static void main(String[] args) {
        List<String> stringTemplist = new ArrayList<>();
        stringTemplist.add("java");
        stringTemplist.add("alperen");
        stringTemplist.add("phyton");
        stringTemplist.add("ali");
        stringTemplist.add("hello");
        stringTemplist.removeIf(str -> str.startsWith("a"));
        stringTemplist.forEach(System.out::println);

        Predicate<String> predicate1 = String::isEmpty;
  //      Predicate<String> predicate2 =String::length;
   //     Predicate<String> predicate3 = String::startsWith;

    }
}
