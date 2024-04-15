package week05.pradicate;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PradicateExample01 {

    public static void main(String[] args) {
        Predicate<String> pradicate1 = element -> element.startsWith("a");
        // 1 tane parametre alıyorsa ve veri türünü belirlediysek paranteze gerek yok .

        Predicate<String> predicate2 = (String element) -> element.startsWith("m");
        // veri türünü belirlediğimiz için paranetez gerekti.

        Predicate<String> predicate3 =(String element)-> {
            return element.startsWith("a");
        };
        // yukarıdaki 3 parametre kullanımı aynı anlama gelir, aynı şekilde çalışır.
        Stream.of("java","alperen","phyton","ali","heello").filter(pradicate1).forEach(System.out::println);
    }
}
