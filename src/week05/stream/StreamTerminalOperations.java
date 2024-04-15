package week05.stream;

import java.sql.Array;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamTerminalOperations {

    public static void main(String[] args) {
        //  count() -> sonlu bir streamdaki ögelerin sayısını belirler
        Stream<String> s2 = Stream.of("k1","k2","k3");
        long countElement =s2.count();
        System.out.println(countElement);

        // min () , max () String veya Arrayın minimum veya maximum değerlerini bulabiriz
        Stream<String> stream01 = Stream.of("eagle","lion","raccon ");
        Stream<String> stream02 = Stream.of("eagle", "lion","raccon");

        Comparator<String> comp = Comparator.comparingInt(String::length);

        Optional<String> min = stream01.min(comp);
        Optional<String> max = stream02.max(comp);
        System.out.println(min);
        System.out.println(max);

        String[] stringArr ="Merhaba dünya ben alperen, nasılsın ".split(" ");

        System.out.println(Arrays.stream(stringArr).min(String::compareTo).get());
        System.out.println(Arrays.stream(stringArr).max(String::compareTo).get());

        Comparator<String> lengthCompare = Comparator.comparingInt(String::length);
        System.out.println(Arrays.stream(stringArr).min(lengthCompare).get());

        // findAny() & findFirst
        // findAny ()-> Stream daki ögelerden birini döndürür ;
        // Stream da  hjiç bir öge yoksa boş bir optional <T> object döndürür

        // findfirst () Stream daki ilk ögeyi döndürür hiçbir öge yoksa optional<T> nesnel döndürür
        // ögeyi seçmekte özgürdür özellikle paralle stream kullandığımızda

        Stream<String> s = Stream.of("monkey","gorilla","dog");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

        OptionalDouble temperature = DoubleStream.of(-10.1,-5.0,30.0,-7.3,41.2,2.2)
                .filter(temp -> temp >0)
                .findFirst() ;
        OptionalDouble temperature2 = DoubleStream.of(-10.1,-5.0,30.0,-7.3,41.2,2.2)
                .filter(temp -> temp >0)
                .findAny();
        System.out.println(temperature);
        System.out.println(temperature2);

        // anyMatch() ,allMatch, nonematch ()
        List<String> list = Arrays.asList("monkey","2","chimp");

        Stream<String> infinite01 =Stream.generate(()-> "chimp");
        Stream<String> infinite02 =Stream.generate(()-> "chimp");

        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        // anyMatch() , Stream da verilen Pradicate ile eşleşen herhangi bir öge varsa true değerini döndürür
        // Stream boşsa veya eşleşen öge yoksa false değerini döndürür
        System.out.println(list.stream().allMatch(pred));

        // allMatch yalnızca streamdaki tüm ögelerin verilen pradicate ile eşleişmesi durumunda true değerini
        //stream boşsa true değerini döndürür
        System.out.println(list.stream().noneMatch(pred)); // false

        // noneMatch yanlızca stream daki ögeelerin hiçbiri verilen pradicate ile eşleşmediğinde true değerini
        System.out.println(infinite01.anyMatch(pred)); // true
        //System.out.println(infinite01.allMatch(pred)); // true

        System.out.println(infinite02.noneMatch(pred));

         // forEach pipeline  deki terminal işlemidir
        Stream<String> s01 =Stream.of("Monkey","Gorilla","Chimp");
        s01.forEach(System.out::println);

        List<String> list01 =new ArrayList<>();
        s01.forEach((str )->{
            String sUpper = str.toUpperCase();
            list01.add(sUpper);
        });
        System.out.println(list01);
    }
}
