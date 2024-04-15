package week05.function.supplier;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;
// Supplierın Stream.generate() metodu ile
public class SupplierTest02 {

    public static void main(String[] args) {

        Supplier<Integer> supplier01 = () -> new Random().nextInt(20);
        Stream.generate(supplier01).limit(5).forEach(System.out::println);


        System.out.println("--------");
        Supplier<Integer> supplier02 = new Random()::nextInt;
        Stream.generate(supplier02)
                .limit(6)
                .filter(number -> number > 5)
                .forEach(System.out::println);

        Supplier<Integer>supplier03 = SupplierTest02::createrandomNumber;
        System.out.println(supplier03.get());
    }
        public static Integer createrandomNumber(){
            return new Random().nextInt();

    }
}