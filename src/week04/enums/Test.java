package week04.enums;

public class Test {

    Size pizzaSize;

    public Test(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

   public void orderPizza () {
       switch (pizzaSize) {
           case SMALL: {
               System.out.println("I order a small size pizza ");
               break;
           }
           case MEDIUM:{
               System.out.println("I order a medıum size pizza" );
           }
           case LARGE: {
               System.out.println("I order a large size pizza ");
               break;
           }
           case EKSRTALARGE:
               System.out.println("I order a extralarge size pizza ");
               break;
       }
   }
    }

