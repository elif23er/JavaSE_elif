package week04.polymorphism.runtime.ornek01;

import week04.polymorphism.runtime.ornek01.Animal;

public class Dog extends Animal {


    @Override
    void makeSound() {
        System.out.println("Dogs break.");
    }
}
