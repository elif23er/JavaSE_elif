package week05.function;

import java.util.function.Function;

public class functionTest03 {
    /*
    Encapsulation kurallarına uygun bir employee sınıfı oluşturalım.
    her bir employee nin ismi ve yaşı olsun .
    AllArgs constructor üretelim.
     */
    public static void main(String[] args) {
        Function<Employee,String> employeetoStringName = e -> e.getName();
        Employee emp = new Employee ("Alperen",28);
        System.out.println(employeetoStringName.apply(emp));
    }
}
