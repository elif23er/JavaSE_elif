package week03.methods.staticmethods;

import java.util.Scanner;

public class MethodQuestion {
    public static void main(String[] args) {
        MethodQuestion methodQuestion = new MethodQuestion(); // -> MethodQuestion() -> constructor method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen 1. sayiyi giriniz : ");
        int num1 = scanner.nextInt(); // -> scanner.nextInto()+"/n";
        scanner.nextLine();
        System.out.print("Lutfen 2. sayiyi giriniz:");
        int num2 = Integer.parseInt(scanner.nextLine());  // Integer.parsInt("/n")



        int min;
        int max;
         if (num1>num2){
         max = num1 ;
         min = num2 ;
    } else {
             max = num2;
             min = num1;
         }
         for (int i= min ; i<= max; i++){
             System.out.println(methodQuestion.getSquare(i));
         }
         // min Math.min(num1,num2);
         // max =Math max(num1,num2);
        // System.out.println();
        // System.out.println();


}
    public long getSquare(int number) {
        return (long) Math.pow(number, 2);
        // return number * number;

    }

}
