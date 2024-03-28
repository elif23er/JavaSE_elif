package week03.constructor;

public class ConstructorOverloading {

    String country ;

    String language ;
    ConstructorOverloading(String country, String language ) {
        this.country = country;
        this.language=language;
    }
        ConstructorOverloading(String country) { //Parameterized Constructor(parametreli Constructor
        this.country= country;
        }
ConstructorOverloading(){}//NoArgsConstructor



        public static void main (String[]args){
            //no-args -contructor.Şu an herhangi bir constructor tanımlanmadığı için default constructor
            //olarak buna no-args-constructor Java tarafından getiriliyor.
            ConstructorOverloading obj1 = new ConstructorOverloading();
            obj1.country = "Turkey";
            obj1.language = "Turkısh";
            System.out.println(obj1.country + "" + obj1.language);
            ConstructorOverloading obj2 = new ConstructorOverloading("Germany");
            obj2.language= "Germany";
            System.out.println(obj2.country+""+obj2.language);

            /*2.'de Parameterized Constructor kullandık.Fielde'lardan birinin değerini nesneyi oluştururken
            argüman olarak verdik(counrty),değerini ise nesneyi oluşturduktan sonra , dışarıdan atamasını  ayptık.
             */



            ConstructorOverloading obj3 = new ConstructorOverloading("England","English");

            /* 3.'de bütün field'ları Parameterized Constructor ile aldık.Dolasıyla dışarıdan değer
            değer ataması yapmama gerek kalmadı.Nesneyi oluştururken içini de doldurdum.
             */

        }

    }