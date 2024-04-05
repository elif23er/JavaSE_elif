package week04.generics;

public class GenericsVarArgExample {

    public static <T> void prinArray(T...items){

        for (T item :items ) {
            System.out.println(item + "");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        System.out.println("String Dizisi ");
        prinArray("Merhaba","Dünya");

        System.out.println("Integer Dizisi ");
        prinArray(1,2,3,4,5,6,7);

        System.out.println("Double Dizisi ");
        prinArray(3.14,9.80,2.718);
    }
}
