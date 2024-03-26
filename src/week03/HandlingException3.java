package week03;

public class HandlingException3 {
    public static void main(String[] args) {
        String name = null;

        if (name==null){
            System.out.println("Lütfen bir isim giriniz!");
        } else {
            name.toUpperCase();

        }
    }
}
