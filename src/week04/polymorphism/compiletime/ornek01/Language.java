package week04.polymorphism.compiletime.ornek01;

public abstract class Language {
    abstract  void method1(); // absract method gövdesi olmaz

    // standart method gövdesi olur
    void method2(){
        System.out.println("This is a regular method");
    }
}
