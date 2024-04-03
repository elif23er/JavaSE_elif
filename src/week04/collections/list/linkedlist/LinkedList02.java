package week04.collections.list.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedList02 {

    public static void main(String[] args) {

        Deque<String> animalList= new LinkedList<>();

        // eleman ekleme
        animalList.add("Cow");
        System.out.println("LinkedList  :" + animalList);
        animalList.add("Dog");
        System.out.println("LinkedList after addFirst() :" + animalList);

         //son indexten eleman ekleme
        animalList.addLast("Cat");
        System.out.println("LinkedList after addLast () :" + animalList);

        // ilk indexten eleman silme
        animalList.removeFirst();
        System.out.println("LinkedList after removeFirst() :" + animalList);
        animalList.removeLast();
        System.out.println("LinkedList after removeLast() :" + animalList);
    }
}
