package week03.exeptions;

public class UncheckedException {
    //->Runtime hataları yani çalışma zamanında gerçekleşen hatalar.

    public static void main(String[] args) {
        String name = null;
        // kötü yaklaşım
        try {
            if(name.equals("elif")){
            System.out.println("name: elif");
            }
        }catch (NullPointerException e ){
            System.out.println("Catch!");
        }
        // eh işte idare eder. fena değil

        if ("elif "!= null && name.equals("elif")){
            System.out.println("name : elif");

        }
       // WOW mükemmel. en süper birinci yöntem
        if("elif".equals(name)){
            System.out.println("name : elif");
        }
        // null deger sadece objelere verilir.
    }
}