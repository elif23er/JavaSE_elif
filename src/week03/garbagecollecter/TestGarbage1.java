package week03.garbagecollecter;



public class TestGarbage1 {
    public void finalize(){
        System.out.println("object is garbage collection ");
    }

    public static void main(String[] args) {
        TestGarbage1 garbage1 = new TestGarbage1();
        /* bunlar heapta ayrı yerde tutuluyorlar.*/
       TestGarbage1 garbage2 = new TestGarbage1();

         TestGarbage1 garbage3 = new TestGarbage1();
         /* Bunlar heapta aynı nesneyi referans alıyotrlar */
        TestGarbage1 garbage4 = garbage3 ;

        garbage1 = null ;
        garbage2 = null ;
        garbage3 = null ;
        garbage4 = null ; // Bunun çöpü yoktur, çünkü değerini garbage3'ten alıyor.
        // yani garbage3 ve garbage4 heap'te aynı değere referanslanmış.
        new TestGarbage1();

        System.gc();

    }
}

