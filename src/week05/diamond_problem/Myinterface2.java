package week05.diamond_problem;

public interface Myinterface2 {
    // default ayarlarda metodun modifieri public old. için gri gösteriyor.
    public  default void defaultMethod(){
        System.out.println("Myinterface2 defaultMethod");
    }

    // interface de varsayılan olarak bütün methodlar abstrasct gelir. o yüzden gri görünüyor.

    abstract void test();
}
