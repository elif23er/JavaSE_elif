package week03.oop.principies.encapsulation;

public class Person {

    private String name;

    private String lastname;
    private int age;
    private String tcKimlik;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    private String arabaSur() {
        if (age >= 18) {
            return name + "arabayı suruyor.";
        } else {
            return "araba surmeye yaşınız yetmiyor.";
        }
        }
        public void setAge(int age){
            if (age < 0) {
                this.age =0;
                System.out.println("Yaş 0 'dan az olamaz ");
            } else if (age <= 18) {
                this.age= age;
                System.out.println("Ehliyet almak için yaşınız tutmuyor");
            } else {
                this.age = age;
                System.out.println("Tebrikler! Ehliyeti aldınız");

            }
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }
}
