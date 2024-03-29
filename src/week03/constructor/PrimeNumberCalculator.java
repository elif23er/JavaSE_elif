package week03.constructor;

public class PrimeNumberCalculator {


    long number ; //*
    // long number dediğimiz değişken PrimenNumberCalculator sınınfının bir fieldı'dır
    //long değişkenini veri türünü, number ise değişkene verdiğimiz ismi ifade eder
   /* değişkenin veri türü herhangi bir primitive type yada herhangi bir class da olabilir
   ör ; Scanner scanner = new scanner (System.in);
   burada veri türü soldaki scanner classdır .scanner ise bu oluşturduğumuz değişkene kodumuzda hangi isimle sesklendiğimizi belirtir.
   sağ taraf ise atama öperatörü (=) aracılığıyla değişkenimie atadığımız değeri barındırıyor
   scanner (System.in ) -> ifadesi aslında scanner sınıfından bir yapıcı metotdur
   scanner yapıcı metodu içinde System.in türünde bir parametre almadan benim ,için bir scanner nesnesi oluşturmuyor

   bir sınıf içerisinde sonsuz sayıda field/attribute barındırabilir
   dikkat edilmesi gereken tek şey bu fieldlarrın isimlerinin birbiriyle çakışmamasıdır

   bir field yada sıradan bir metot nasıl isimlendirilir?
   ilk kelimenin başlangıç harfi küçük olmalıdır
   sonrasında gelen her  kelime için baş harfi büyük yazılmalı
   String plakano-> ilk kelimenin ilk harfi küçük başlar sonrasındaki bütün kelimellerin ilk harfi büyük harfle yazılır.bu sayede boşluk tuşu (space)
  okunması kolay olur
  public int sayitopla (int sayı1,int sayi2)
  -> bu sıradan bir metot old. için (yeni bir constuructor metodu olmadığı için )
  ismin ilk harfi küçük harfle başlar .
    */

    /*Constructor;
    1- Constructor metodunun ismi sınıfın ismi ile aynı olmalıdır."PrimeNumberCalculator"
    2-Parametreler için () uygulanmalı. bu sayede metot olduğuda JVM tarafından anlaşılır .
    3- Constructor metotlarında geri dönüş tipi olmadığı için normal metotların aksine bir geri dönüş
    tipi belirtilmez.dolasıyla herhangi bir koşulda "return" da kullanılmaz.
    4-geri dönüş tipi olmazsa da. Access Modifier kullannılabilir.
    4.1-Access Modifiarlarım; public ,private,protected,default
    4.1.1- Access Modifier public ise ilgili metot/field yada classa'a projenin herhangi bir yerinden erişebilir.
    4.1.2- Accesss modifier private ise ilgili metot yada field'a sadece ve sadece metot yada field'ın tanımlandığı sınıfta erişelim.
         4.1.3 Accesss modifier default iise (yani hiçbir şey belirtilmediyse - kendiliğinden default olur -)
         metot ve fieldlara sadece bulundukları sınıf ile aynu opakkette bulunan diğer sınıflar erişebilir.
         4.1.4- Access modifier procted ise default özelliklerine ek olaarak kalıtım durumu var ise metot ve fieldın
         başka paketlerdeki sınıflardan daerişebilir .
         5-her metot da olduğu gibi constructor metotodunun da gövdesi "{}" bulunmak zorundadır .
         6- conctructor metotodu sınıfın yapıcı metotdu, sınıfın bir nesnensini yaratmak için kullanılır.
         */
    /* hiç bir sey yazmadığığm için acccess modifierı default oldu doloasıylabu constructor metoduna
   sadece bu sınıfın bulunduğu pakette bulunan sınıflar erişebilir .
     */
     void PrimentNumberCalculator(/* parametre /argüman kısmı burasıdır buraya string isim ,int sayı,gibi değerler gelir /*)
        // herhangi bir parametre girilmeyen constructorlara
        // NoArgsConstructor (argümansız/parametresiz ) constructor denir
    }

    PrimeNumberCalculator (/* parametre/argüman kısmı burasıdır buraya string isim, int sayı gibi değerler gelir.)

        PrimeNumberCalculator(long number ){
        /*bu sınıfın bir nesnesi oluşturulurken dışarıdan bir sayının parametre olarak girilmesi durumunda bu consturuvctor çalışacaktır
        yukarıda parametre olarak aldığım number değişkni bir alt satırda number isimli field ma değer olarak atıyorum bu şekilde olan
        cunstructorlara parametreli denir argüman olarak nesne üretmek için kullanılır
    this.number=number; // buradaki this ifadesi sınıfın değişkeni olan number a seslendiğimi ifade eder

        }

        public /*access modifier */ boolean/*dönüş tipi */ asal  /* metot ismi */)/*parametre alanı */{
        }
}
