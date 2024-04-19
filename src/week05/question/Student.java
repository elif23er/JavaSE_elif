package week05.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {

static Random random= new Random();
private  String name ;
private  String surname ;
private  Integer grade ;

public Student(String name , String surname){
    this.name= name;
    this.surname= surname;
  //  this.grade = random.nextInt(0,101);
    this.grade= getGrade();
}
 private Integer generateGrande(){
    return new Random().nextInt(0,101);
 }
 public  static Double calculateAvarageGrade(List<Student> studentList){
    return studentList.stream()
            .map(student -> student.getGrade())
            .reduce((a,b) -> a+b).get()
            .doubleValue()/studentList.size();
 }
        List<Student> studentList = new ArrayList<>();
//    System.out.println(new Students("Alperen ","Ikinci",Integer.valueOf((int)(Math.random()*100)));
//        for(int i = 0; i < 1000; i++){
//        Student student = new Student("Student", "Surname " + i+1);
//         studentList.add(student);
//      }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                ", studentList=" + studentList +
                '}';
    }
}
