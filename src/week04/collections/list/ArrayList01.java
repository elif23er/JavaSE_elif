package week04.collections.list;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        // Arraylist sınıfını kullanarak bir list oluşturduk
        List<Integer> numberList = new ArrayList<>();
        // listemize elemanlar atadık
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        System.out.println("List :"+numberList);
        // listeden bir indexe erişim
        int number =numberList.get(2); // auto unboxing
        System.out.println("Accessed element :"+number);

        // listeden bir indexin kaldırılması
        int removedNumber = numberList.remove(1);
        System.out.println("Removed element :"+removedNumber);
        System.out.println("List : " + numberList);
    }
}
