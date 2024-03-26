package week03.exeptions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileHandler fw = new FileHandler("file.txt");
    } catch (IOException e ) {
            System.out.println("Veri transferinde bir sorun oluştu.");
        } }
        public void throwsExample() throws IOException{
            FileWriter fw = new FileWriter("file text");

    }
}
