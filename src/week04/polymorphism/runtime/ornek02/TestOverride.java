package week04.polymorphism.runtime.ornek02;

public class TestOverride {

    public static void main(String[] args) {
        System.out.println("################");
        System.out.println("Animal");
        System.out.println("##################");
        Animal animal=new Animal();
        animal.feetSize();
        System.out.println(animal.size);
        System.out.println();

        System.out.println("#################");
        System.out.println("dogAnimal");
        System.out.println("#################");
        Animal dogAnimal =new Dog();
        dogAnimal.feetSize();
        System.out.println(dogAnimal.size);
        System.out.println(dogAnimal.name);

     System.out.println("#################");
        System.out.println("dog");
        System.out.println("#################");
        Dog dog =new Dog();
        dog.feetSize();
        System.out.println(dog.size);
        System.out.println(dog.name);


         System.out.println("#################");
        System.out.println("TerrierDog");
        System.out.println("#################");
    Dog terrier =new Terrrier();
        terrier.feetSize();
        System.out.println(terrier.size);
        terrier.gender();

}
}

