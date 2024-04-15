package week05.function.supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.function.Supplier;

// supplier ile Localdate ile kullanımı.
public class SupplierTest03 {

    public static void main(String[] args) {

        //LocalDate date = LocalDate.now(); // YYY/MM/DD
      //  System.out.println(date);
       // LocalDate date2 = LocalDate.ofEpochDay(0);
       // System.out.println(date2);

        //System.out.println(System.currentTimeMillis());

//        long milis = 1713325511;
//        long second = 1713325511/10001;
//        long minute = second/60;
//        long hour  = minute/60;
//        long day =hour/24;
//        LocalDate date3 = LocalDate.ofEpochDay(day);
//        System.out.println(date3);
//
//        long birthDate ;

        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());

        Supplier<LocalDateTime> supplier02 = LocalDateTime::now;
        LocalDateTime localDateTime = supplier02.get();
        System.out.println(localDateTime);

        Supplier<String> supplier03 = () -> dtf.format(LocalDateTime.now());
        String localDateTimeFormatter = supplier03.get();
        System.out.println(localDateTimeFormatter);
    }
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy-MM-dd");

}
