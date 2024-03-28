package week03.constructor;

public class Main {

    private String name ;

    Main(){
       System.out.println("Constructor Called...");
       name = "Constructor name field.";

    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("The name is :"+ obj.name);
        Main obj2 = new Main();
        System.out.println("The name is :"+obj2.name);

    }
}
