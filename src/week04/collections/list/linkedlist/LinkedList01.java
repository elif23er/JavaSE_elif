package week04.collections.list.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList01 {
    public static void main(String[] args) {

        // FIFO felsefesiyle çalısır ilk gelen ilk çıkar.
        Queue<String> languageQueue = new LinkedList<>();

        // elemanlar ekleyeceğiz

        languageQueue.add("Phyton");
        languageQueue.add("Java");
        languageQueue.add("C");
        System.out.println("LinkedList :" + languageQueue);

        String str1 =languageQueue.peek(); // en baştaki elenmanı görüntüler.
        System.out.println("Accessed Element :" + str1);

        // en baştaki elemana erişelim , aynı zamandada listeden çıkaralım .
        String str2 =languageQueue.poll();
        System.out.println("Removed Element :" + str2);
        System.out.println("LinkedList after poll() : " + languageQueue);

        // listenin sonuna eleman ekleyelim
        languageQueue.offer("Swift");
        System.out.println("LinkedList after offer () :" + languageQueue);

    }
}

