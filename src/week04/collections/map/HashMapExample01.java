package week04.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample01 {

    public static void main(String[] args) {
        Map<String,String> map =new HashMap<>();

        HashMap<String,Integer> languageHashMap =new HashMap<>();
        //elemanlar ekleyelim
        languageHashMap.put("Java",8);
        languageHashMap.put("Python",1);
        languageHashMap.put("JavaScript",3);
        System.out.println("HashMap :" + languageHashMap);


    }
}
