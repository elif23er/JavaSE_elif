package week03.constructor;
// ad,soyad,yaş ve cinsiyet fieldlarını belirleyelim.sonrasında bu sınıfın 2 adet nesnesini
// oluşturalım. bu nesnelerin yaş ve cinsiyet değerleri, constructor parametresinden ,oluşturma,
// anında verilsin.diğer 2 değeri elle girelim.

public class ParameterizedConstrutor {

    String name;
    String surname;
    int age;
    String gander;

ParameterizedConstrutor( int age, String gander ){
    // isim cekismesi olacagı icin "this." anahtar kelimesini
    // kullanarak sinifimin field'ı olan age'e eriseceğimi belişrtiyorum.
    this.age = age;
    this.gander = gander;
}

    public static void main(String[] args) {

    ParameterizedConstrutor obj1 = new ParameterizedConstrutor(20,"kadın");
        obj1.name = "Elif";
        obj1.surname = "ER";
    ParameterizedConstrutor obj2 = new ParameterizedConstrutor(20,"kadın");
        obj2.name = "Büşra";
        obj2.surname=  "Özdemir";

        System.out.println("Kişinin adı:" + obj1.name);
        System.out.println("Kişinin soyadı:"+ obj1.surname);
        System.out.println("Kişinin yaşı :"+obj1.age);
        System.out.println("kişinin cinsiyeti:"+obj1.gander);
        System.out.println();
        System.out.println("Kişinin adı:" + obj2.name);
        System.out.println("Kişinin soyadı:"+ obj2.surname);
        System.out.println("Kişinin yaşı :"+obj2.age);
        System.out.println("kişinin cinsiyeti:"+obj2.gander);




    }

    }



