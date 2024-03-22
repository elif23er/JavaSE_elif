package week02;

public class ArithmetricOperator {
    public static void main(String[] args) {
        int number1 =25, number2 = 3, number3 =17 ;
        String websiteName = "Web Sitwemiz", websiteUri = "www.bigeadam.com";

        //Stringlerde ekleme operatörü kullanısak ;
        System.out.println( "Merhaba!\n"+websiteName + websiteUri); // \->alt + +
        // Ekleme - çıkarma operatörleri :
        System.out.println("A + B = "+ (number1+number2));
        System.out.println("A - C =" +(number1- number3));

        // Çarpma ve Bölme operatörleri
        System.out.println("A * B = " + ( number1* number2));
        System.out.println("A/ 5 = " + ( number1/5 ) );

        // Mod Alma Operatörü:
        System.out.println("C % B = " + (number3%number2));

    }



}
