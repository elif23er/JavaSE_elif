package week04.collections.map;

import java.util.HashMap;

public class HashMapExample02 {
    public static void main(String[] args) {


        HashMap<Integer, String> languageHashMap = new HashMap<>();
        languageHashMap.put(1,"Java");
        languageHashMap.put(2,"Python");
        languageHashMap.put(3,"C");
        languageHashMap.put(4,"Java");
        System.out.println("HashMap :"+ languageHashMap);

       // belirli bir keye denk gelen value'ye döndürürlür .
        String value = languageHashMap.get(2);
        System.out.println("Value at key 2 : " +value);

        // keyleri bir set olarak dönme -> keySet();
        System.out.println("Keys : " + languageHashMap.values());

        // key / value pair çiftini bir set olarak dönmek
        System.out.println("Key /value mappings :"+languageHashMap.entrySet());

       // key varsa valuesunu dön yoksa defaultta not founda dön
        String value1 = languageHashMap.getOrDefault(1,"Not found");
        System.out.println("Value for key 1:" + value1);

        // ley varsa valuesuna dön yoksa defaultta not founda dön
        //-> bu key yok dolayısıyla default değerine döner
        String value2 = languageHashMap.getOrDefault(5,"Not found");
        System.out.println("Value for key5 :" + value1);

        // bir key var mı diye konrtrol ettmek
        if (languageHashMap.containsKey(2)){
            System.out.println("Map contains key value of : 2");
        } else {
            System.out.println("Key not found .");
        }

    // bir value var mı diye kontrol etmek
        if (languageHashMap.containsKey("Java")){
            System.out.println("Map contains value of Java");
        } else {
            System.out.println("No such value");


        }

        // bir key ile ilişkili valueyu değiştirmek replace ())
        System.out.println("Original HasMap :"+languageHashMap);

        languageHashMap.replace(4,"Swift");
        System.out.println("HasMap after replace() :" +languageHashMap);

        // bütün value değerlerini uppercase çevirmek ( replaceAll)
        languageHashMap.replaceAll((K,V) -> V.toUpperCase());
        System.out.println("Updated HashMap:"+ languageHashMap);

        // bir hashmap den ögeleri kaldırnmak silmek
        String value3 =languageHashMap.remove(4);
        System.out.println("Removed value :"+value3);
        System.out.println("Updated HashMap :"+ languageHashMap);

        // bir hashmmapden bir key / value ladırmak silmek
        Boolean isDeleted = languageHashMap.remove(3,"C");
        System.out.println("isDeleted:"+ isDeleted );
        System.out.println("Updated HashMap :" + languageHashMap);
    }
}