package week02;

import java.util.Random;

public class WhileZarSorusu {
    public static void main(String[] args) {
        int zar1, zar2;
        ;
        Random random = new Random();
        while (true)
            for (int i = 0; i < 50; i++) {
                System.out.println(random.nextInt(6));

                zar1 = random.nextInt(1, 7);
                zar2 = random.nextInt(6) + 1;
                if (zar1 + zar2 == 12 || zar1 == 6 && zar2 == 6) {
                    System.out.println("6-6atıldı.");
                    break;
                } else{
                        System.out.println("zar1 : " + zar1 + "\tZar2 :" + zar2);
                        // sayac++;
                    }
                //  sayac++;
                }
            }
    }
