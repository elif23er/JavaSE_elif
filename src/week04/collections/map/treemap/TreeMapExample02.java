package week04.collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample02 {

    public static void main(String[] args) {

        TreeMap<Integer,String> numberMap = new TreeMap<>();
        numberMap.put(3,"Three");
        numberMap.put(7,"Seven");
        numberMap.put(1,"one");
        numberMap.put(5,"five");
        numberMap.put(9,"nine");
        numberMap.put(8,"eight");
        System.out.println("Begining :" + numberMap);

        System.out.println("\nHigher");
        System.out.println("higherKey(5) :" + numberMap.higherKey(5));
        System.out.println("higherEntry(5) :" + numberMap.higherEntry(5));

        System.out.println("\nCelling Function");
        System.out.println("cellingEntry(4):" + numberMap.ceilingEntry(4));
        System.out.println("cellingKey(4):"+ numberMap.ceilingKey(4));
        System.out.println("cellingEntry(5):" + numberMap.ceilingEntry(5));

        System.out.println("\n floor Function");
        System.out.println("floorEntry(5) :" + numberMap.floorEntry(5));
        System.out.println("floorEntry(4):" + numberMap.floorEntry(4));

        System.out.println("\nlower");
        System.out.println("lowerKey(5):" + numberMap.lowerKey(5));
        System.out.println("lowerEntry(5):" + numberMap.lowerEntry(5));

        System.out.println("\n Before poll methods:" + numberMap);

        Map.Entry<Integer,String> removeEntry =numberMap.pollFirstEntry();
        System.out.println("\n After pollEntry():"+numberMap);
        System.out.println("Removed Entry :"+ removeEntry);

        Map.Entry<Integer,String> removedLastEntry = numberMap.pollLastEntry();
        System.out.println("\n After pollLastEnrty() "+ numberMap);
        System.out.println("Removed Entry : " + removedLastEntry);



    }
}
