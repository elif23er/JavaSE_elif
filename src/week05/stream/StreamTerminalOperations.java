package week05.stream;

import java.sql.Array;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamTerminalOperations {

    public static void main(String[] args) {
        //  count() -> sonlu bir streamdaki ögelerin sayısını belirler
        Stream<String> s2 = Stream.of("k1", "k2", "k3");
        long countElement = s2.count();
        System.out.println(countElement);

        // min () , max () String veya Arrayın minimum veya maximum değerlerini bulabiriz
        Stream<String> stream01 = Stream.of("eagle", "lion", "raccon ");
        Stream<String> stream02 = Stream.of("eagle", "lion", "raccon");

        Comparator<String> comp = Comparator.comparingInt(String::length);

        Optional<String> min = stream01.min(comp);
        Optional<String> max = stream02.max(comp);
        System.out.println(min);
        System.out.println(max);

        String[] stringArr = "Merhaba dünya ben alperen, nasılsın ".split(" ");

        System.out.println(Arrays.stream(stringArr).min(String::compareTo).get());
        System.out.println(Arrays.stream(stringArr).max(String::compareTo).get());

        Comparator<String> lengthCompare = Comparator.comparingInt(String::length);
        System.out.println(Arrays.stream(stringArr).min(lengthCompare).get());

        // findAny() & findFirst
        // findAny ()-> Stream daki ögelerden birini döndürür ;
        // Stream da  hjiç bir öge yoksa boş bir optional <T> object döndürür

        // findfirst () Stream daki ilk ögeyi döndürür hiçbir öge yoksa optional<T> nesnel döndürür
        // ögeyi seçmekte özgürdür özellikle paralle stream kullandığımızda

        Stream<String> s = Stream.of("monkey", "gorilla", "dog");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

        OptionalDouble temperature = DoubleStream.of(-10.1, -5.0, 30.0, -7.3, 41.2, 2.2)
                .filter(temp -> temp > 0)
                .findFirst();
        OptionalDouble temperature2 = DoubleStream.of(-10.1, -5.0, 30.0, -7.3, 41.2, 2.2)
                .filter(temp -> temp > 0)
                .findAny();
        System.out.println(temperature);
        System.out.println(temperature2);

        // anyMatch() ,allMatch, nonematch ()
        List<String> list = Arrays.asList("monkey", "2", "chimp");

        Stream<String> infinite01 = Stream.generate(() -> "chimp");
        Stream<String> infinite02 = Stream.generate(() -> "chimp");

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
        Stream<String> s01 = Stream.of("Monkey", "Gorilla", "Chimp");
        //s01.forEach(System.out::println);

        List<String> list01 = new ArrayList<>();
        s01.forEach((str) -> {
            String sUpper = str.toUpperCase();
            list01.add(sUpper);
        });
        System.out.println(list01);


        // map() ve forEach ()
        // forEach()-> void döner dolasıyla içerisinde  de void dönen bir işlem olmalı
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number -> System.out.println(number * 2));
        System.out.println(numbers);

        // map()
        List<Integer> mappeNumbers = numbers.stream()
                .map(number -> number * 2)
                .map(number -> number * 2)
                .collect(Collectors.toList())
                .stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());

        mappeNumbers.forEach(System.out::println);
        mappeNumbers = mappeNumbers.stream().map(number -> number * 2).collect(Collectors.toList());
        //  .stream()
        //     .map(number -> number *2)
        //     .collect(Collectors.toList());
        System.out.println(mappeNumbers);

        Stream<Integer> stream = Stream.of(3, 5, 6);
        Stream<Integer> stream2 = Stream.of(3, 5, 6);

        System.out.println(stream.reduce(10, (a, b) -> a * b));
        // 10,3 -> 10*3 => 30,a= 30
        // 30,5 -> 30*5 => 150, a= 150
        //150,6 ->150*6 => 900 , a= 900
        // 900, null -> girmiyor => return a
        System.out.println(stream2.reduce((a, b) -> a * b));
        // 3,5 -> 3*5 => 15 , a= 15
        // 15*6  ->15*6 => 90, a = 90
        // 90, null -> girmiyıor => return a
        List<Integer> intList = List.of(3, 5, 6);
        int a = 0;
        int b = 0;
        int total = 0;
        for (int i = 0; i < intList.size(); i++) {
            if (i == 0) {

                a = intList.get(i);
            } else {
                a = total;
            }
            if (i != intList.size() - 1) {
                b = intList.get(i * 1);
            } else {
                System.out.println(a);
                break;
            }
            total = a * b;
        }

            Stream<String> stream03 =Stream.of("w1","o2","l3","f4");
       //  String word = stream03.reduce("X",(x,y) -> x.concat((y));
            String word = stream03.reduce("X",String::concat);
            System.out.println(word);
         Stream<String> stream04 = Stream.of("w ","o","l","f");
         String word2 = String.valueOf(stream04.reduce((c,d)-> c+"--"+d));
        System.out.println(word2);


        // cololect()
        String frenchCounting = "un:deux:trois:quatre";
       // List<String> gmailList = Arrays.stream(Pattern.compile(":"))
         //     .split(frenchCounting.collect.(Collectors.toList());

        List<String>gmailList = Pattern.compile(":")
                        .splitAsStream(frenchCounting).collect(Collectors.toList());
        System.out.println(gmailList);
        List<String> gmailList2 = List.of(frenchCounting.split(":"));
        System.out.println(gmailList2);
      // collect(Collectors.toSet())
        Set<String> gmailSet = Pattern.compile(":")
                .splitAsStream(frenchCounting).collect(Collectors.toSet());
        System.out.println(gmailSet);

        // collect(Collectors.toMap())
        Map<String,Integer> nameLength = Stream.of("Albus","Percival","Mulfric","Brian","Dumbledore")
                .collect(Collectors.toMap(name -> name, String ::length));
        System.out.println(nameLength);

 Optional<String> name = Stream.of("Albus","Percival","Mulfric","Brian","Dumbledore")
                .reduce(String::concat);
        Map<String,Integer> nameLength2 =Stream.of(name.get())
                .collect(Collectors.toMap(name2 -> name2,String::length));
        System.out.println(nameLength2);

        // StringBuilder ();
        Stream<String> stream05 = Stream.of("w","o","l","f");
        StringBuilder word3 = stream05
                .collect(StringBuilder::new
                // (a,b)
        ,StringBuilder::append // a
        ,StringBuilder::append); // b

        System.out.println(word3);

        Stream<String> stream06 = Stream.of("w","o","l","f");
        TreeSet<String> set = stream06.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);








        }

    }
