package week05.suppressedeException;

public class SuppressedExceptionExample {

    public static void main(String[] args) {
        try (Computer computer = new Computer()){
            System.out.println("try block!!");
            int number =1/0;
        } catch (Exception e ){
            System.out.println("Catch block");
            System.out.println(e.getMessage());
        }
    }
}
