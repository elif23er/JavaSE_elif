package week03.oop;

public class Test {
    public static void main(String[] args) {
        ClassName className = new ClassName();
       System.out.println (className.sayHello("Alperen"));
       System.out.println(className.sum(1,5));

       ClassName className2 = new ClassName();
       System.out.println(className2.sayHello("elif"));
       System.out.println(className2.sum(8,12));

       Person p1 = new Person();
       p1.name = "Alperen";
       p1.gander = "Male";
       p1.nickname ="Alp";
       p1.sleep();
       Person p2 = new Person();
       p2.name = "elif";
       p2.nickname = "Büşra";
       p2.walk();
       p2.sleep();
       System.out.println(p2.nickname);
    }
}
