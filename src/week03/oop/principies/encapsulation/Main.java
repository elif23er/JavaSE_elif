package week03.oop.principies.encapsulation;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(15);
        p1.setName("Alperen");
        p1.setLastname("İkinci");
        p1.setTcKimlik("1234567889");
        System.out.println("İsim : "+p1.getName()
                + "\nSoyisim :"+ p1.getLastname()
                +"\nYaş:"+p1.getAge()
                +"\nTckimlik:"+ p1.getTcKimlik());

        System.out.println();
    }

}
