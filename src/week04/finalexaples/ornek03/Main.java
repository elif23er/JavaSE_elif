package week04.finalexaples.ornek03;

public class Main {
    public static void main(String[] args) {
        Person person=new Person("Alperen");
        person.setAge(10);
        System.out.println(person.getName()+" "+person.getAge());
      //  person=new Person("Mert"); -> person'a yani person değeri atanmaz .
    }
}
