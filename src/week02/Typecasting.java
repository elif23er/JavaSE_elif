package week02;



public class Typecasting {
    public static void main(String[] args) {
        int dollar = 5 ;
        float dollarF = dollar ;
        long dollarL = dollar ;
        System.out.println("int cinsinden"+dollar);
        System.out.println( "float cinsinden " + dollar );
        System.out.println( " long cinsinden "+dollar );

        float floatdollar = 13.5f;
        int intdollar = (int) floatdollar ;
        System.out.println("float dollar " + floatdollar );

        long longDollar = 2;
        int intDollar2 = (int) longDollar;

        long longValue= 1000000000L;
        int intValue= (int) longValue ;
        System.out.println(longValue);
        System.out.println(intValue);

        float number1 = 5.3f;
        int sum =(int) number1 +  5;
        System.out.println(sum);
        String sum2 = String.valueOf(sum);
        System.out.println(sum2);
        System.out.println(sum2+10);
        System.out.println(sum+10);


    }
}
