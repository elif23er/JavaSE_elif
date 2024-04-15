package week05.stream;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSourExample01 {

    public static void main(String[] args) {
        // Stream source u oluşturalım
        Stream<String> stream1 = Stream.empty();
        Stream<Integer> stream2 =Stream.of(1);
        Stream<Integer> stream3 = Stream.of(1,2,3,4,5,6,7);


        // listi (ya da  çoğu çoklu veriyi yapışını ) strerama dönüştürebiliriz
        List<String> List  = Arrays.asList("a","b","c");
        Stream<String> fromList = List.stream(); // artık streram pipeleanda

        // generation & ınteration
        // random sayılar oluşturabiliriz iterasyon yapabiliriz
        Stream<Double> randoms = Stream.generate(Math::random).limit(5);
        Stream<Integer> addNumbers = Stream.iterate(1,n -> n+2).limit(5);
        randoms.forEach(System.out::println);
        addNumbers.forEach(System.out::println);

        // Streams pipeline flow
        Arrays.stream(Object.class.getMethods()) // source
                .map(Method::getName) // intermediate operation
                .forEach(System.out::println); // terminal operation


        // range ve rangeClosed
        IntStream.range(1,10).forEach(System.out::println);
        IntStream.rangeClosed(1,5).map(e ->e*2).forEach(System.out::println);

        // başlangıç ve bitiş değerleri verilerek bir IntStreams  de oluşturabiliriz
        IntStream.iterate(10,i-> i+5)
                .limit(6)
                .forEach(System.out::println);



    }
}
