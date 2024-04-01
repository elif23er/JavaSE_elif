package week04.polymorphism.runtime.ornek01;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal(); // animal sınıfından oluşturulan bir nesne animal tipinde bir referansla tutuluyor.


        Animal animal2 = new Dog(); //Dog sınıfından oluşturululan bir nesne animal tipinde bir refransla tutuluyor.
        animal2.makeSound();

    }
}
