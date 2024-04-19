package week05.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    /*
     * *1- student sınıfı oluşturalım -> name ,surname,grade ;
     * 1.1- > Encapsulated
     * 2- Main sınıfında girilen sayı kadar student nesnesi üreten bir metot yazalım.
     * (grade kısmı 0-100 arasında rastgele değer alsın )
     * 3- daha sonra öğrencilerin not ortalamasını hesaplayıp dönen bir stream yazalım .
     * 4- notu 50 'den düşük olan öğrencileri liste olarak dönen bir stream .
     * 5- öğrencilerin isimleri ve öğrencilerin notlarını yazdıran bir stream .
     * 6- öğrencilerin isimleri ve öğrencilerin notlarını bir collection yapısına uayrlayalım
     */
    public static void main(String[] args) {

//   List<Student> studentList = Student.generateStudents(15);
//    Double averageGrade =studentList.stream()
//            .map(student -> student.getGrade())
//            .reduce((a,b) -> a+b).get()
//            .doubleValue()/studentList.size();
//        System.out.println(averageGrade);
//        List<Student> studentList = Student.generateStudents(50);
//        Double averageGrade = Student.calculateAvarageGrade(studentList);
//  List<Student> studentsBellowBound = studentList.stream()
//          .filter(x-> x.getGrade()<50).collect(Collectors.toList());
//        System.out.println(averageGrade);
//        studentsBellowBound.forEach(System.out::println);
//        studentList.forEach(x-> System.out.println(x.getName() + " " + x.getGrade()));
//
//        Map<String,Integer> studentsAndGrades = new HashMap<>();
//        studentsAndGrades = studentList.stream().collect(Collectors.toMap(k)-> k.getName(),v-> v.getGrade())
//
//        studentsAndGrades.entrySet()
//                .forEach(entry -> System.out.println()
//                "Öğrenci adı :" + entry.getKey()+
//                        "\nOgrenci Notu : " + entry.getValue()+"\n"
//                  );
    }
}
