package week04.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        List<String> ArrayList;
        List<String> nameList = new ArrayList<>() ;
            nameList.add("Java");
            nameList.add("Phyton");
            nameList.add("C#");

// listenin bir elemanını değilştirme
        System.out.println("List before Set:"+nameList);
        nameList.set(1,"Scala");
        System.out.println("List after Set :"+nameList);

        // listenin bir elemanını indexle çıkarma
        System.out.println("List before Remove :"+nameList);
        nameList.remove("Scala");
        System.out.println("List after Remove :"+ nameList);

        // listenin bir elemanının içeriğiyle silme
        System.out.println(     "List before remove :"+nameList);
        nameList.remove("Scala");
        System.out.println( "List after remove :"+nameList);

    }
}
