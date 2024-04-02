package week04.enums;

import week02.SingleOperator;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
        Test test = new Test(Size.EKSRTALARGE);
        test.orderPizza();

        // ordinal mothodu bana index değerini döner

        System.out.println(Size.SMALL.ordinal());
        System.out.println(Size.MEDIUM.ordinal());
        System.out.println(Size.LARGE.ordinal());
        System.out.println(Size.EKSRTALARGE.ordinal());

        System.out.println("\n-----compareTo-----");
        System.out.println(Size.SMALL.compareTo(Size.MEDIUM));
        System.out.println(Size.MEDIUM.compareTo(Size.SMALL));
        System.out.println(Size.EKSRTALARGE.compareTo(Size.SMALL));

        System.out.println("\n-----toString-----");
        System.out.println(Size.EKSRTALARGE.toString());
        String str1 = Size.EKSRTALARGE.toString();

        System.out.println("\n-----name method-----");
        if (Size.EKSRTALARGE.name().equals("EXTRALARGE")) {
            System.out.println("equals name method");

        }

        System.out.println("\n-----valueOf method-----");
        if (Size.EKSRTALARGE==Size.valueOf("EXTRALARGE")){
            System.out.println("equals valueOf method");

        }
        System.out.println("\n-----values method-----");
        Size[] sizeAr = Size.values();
        List<Size> sizeList= Arrays.asList(Size.values());
        for (Size size :Size.values()){
            System.out.println(size);
        }
    }
}