package week02;

public class NestedForLoop {
    public static void main(String[] args) {
        // Birinci (üst) dongu
        for(int i = 1;i <=10;i++){
            //Ikinci(alt)dongu
            for(int j =1; j<=10;j++){
                System.out.println(i+ "x" + j +"="+(i*j));
            }
        }
    }
}
