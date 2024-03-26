package week03;

public class HandlingException2 {
    public static void main(String[] args) {
        String name = null;
        name.toUpperCase();
        int number = 5;
        try {
            System.out.println();
            System.out.println("try blok içi");
        }catch (NullPointerException e) {
            // e.printStackTrace(); //try-catch'e almasak görünecek hatayı konsola yazdırır.
            System.out.println(e.getMessage());
            System.out.println("Caugh NPE");
        }finally {

            System.out.println("finaly block");
        }


    }
}
