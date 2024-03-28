package week03.constructor;


import javax.xml.namespace.QName;
import java.lang.reflect.Constructor;

// Bu sınııfın içerisinde isim,soyisim ve ülke fieldları olsun .Ülke fieldları içeriden atayan
// bir parametresiz constructor oluşturalım.
// ülke değeri bir nesne oluşturulması durumunda direkt olarak "Türkiye" değerini alın.
// sonrasında bu sınıftan 3 adet nesne üretip,isim,soyisim,bilgilerini doldup ,ülkelerinin
// konsol çıktılarını alalım.
public class NoArgConstructor {

    String name ;
    String lastname ;
    String country ;

    NoArgConstructor(){
        country = "Turkey";
    }

    public static void main(String[] args) {
        NoArgConstructor obj1 = new NoArgConstructor();
        obj1.name = "Elif";
        obj1.lastname=  "ER";
        NoArgConstructor obj2 = new NoArgConstructor();
        obj2.name = "Büşra";
        obj2.lastname= "Özedemir";
        NoArgConstructor obj3 = new NoArgConstructor();
        obj3.name= "Meryem";
        obj3.lastname = "Alanoğlu";

        System.out.println("Kişinin adı" + obj1.name);
        System.out.println("Kişinin soyadı"+ obj1.lastname);
        System.out.println("Kişinin ülkesi "+obj1.country);
        System.out.println();
        System.out.println("Kişinin adı" + obj2.name);
        System.out.println("Kişinin soyadı"+ obj2.lastname);
        System.out.println("Kişinin ülkesi "+obj2.country);
        System.out.println();
        System.out.println("Kişinin adı" + obj3.name);
        System.out.println("Kişinin soyadı"+ obj3.lastname);
        System.out.println("Kişinin ülkesi "+obj3.country);


    }
    }










