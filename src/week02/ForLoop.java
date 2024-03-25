package week02;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanneer = new Scanner(System.in);
        // scanner.nextınt(), scanner.nettLong8(), scanne.nextDouble()
        // , scanner.nextFloat(), scanner.nextLine()
        int değer , count =0;
        System.out.println("Lütfen bir tam sayı girirniz :");
        değer= scanneer.nextInt();
        System.out.println(değer);

        // code of java for loop
        for(int i=1;i<=10; i++) {
            System.out.println(i);
            if( i % 2 == 0){
                count++;
                System.out.println("birden başalayarak girmiş olduğuğnuz "
                + değer + " değerinne kadar " + count + " adet çift sayı vardır");

            }
        }

    }
}
