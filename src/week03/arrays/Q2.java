package week03.arrays;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int sayı;
        int toplam = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen bir sayı giriniz : ");
            sayı = scanner.nextInt();
            if (sayı == 0) {
                System.out.println("0 sayısınıgirdini.girilen sayıların toplamı hesaplanıyor ");
                break;
            }
            toplam += sayı;
        }
        System.out.println("Sayıların toplamı = " + toplam);
    }
}

