package week05.suppressedeException;

public class Computer implements AutoCloseable {

    @Override
    public void close () throws Exception{
        System.out.println("Shut down...");
        throw  new IllegalStateException("Exception is closed");
    }
}
