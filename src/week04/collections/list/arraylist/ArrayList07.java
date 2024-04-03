package week04.collections.list.arraylist;


import java.util.ArrayList;
import java.util.List;

public class ArrayList07 {

    public static void main(String[] args) {
        List<String> fistList =new ArrayList<>();
        fistList.add("Java");
        fistList.add("Phyton");
        List<String> secondList =new ArrayList<>();
        secondList.add("Scala");
        secondList.add("Kotlin");
        List<String> thirdList =new ArrayList<>();
        thirdList.add("RectJS");

        secondList.addAll(fistList);
        thirdList.addAll(secondList);
        System.out.println(thirdList);

    }

}
