package week05.function;

import java.util.function.Function;

public class functionTest02 {

    public static void main(String[] args) {
        Function<String,Integer> f1 =str -> Integer.parseInt(str);
        Function<String,Integer> f2 = Integer::parseInt;

        int result = f1.apply("1234");
        System.out.println(f1.apply("1337"));
        System.out.println(f2.apply("313")/2);

        Function<Integer,Integer> f3 = Math::abs;
        System.out.println(f3.apply(-1330));

        Function<Integer,Integer> f4 = Math::abs;
        System.out.println(f4.apply(-1330));

    }
}
