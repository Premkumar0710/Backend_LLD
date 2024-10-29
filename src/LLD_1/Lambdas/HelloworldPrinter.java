package LLD_1.Lambdas;

public class HelloworldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello world from : " + Thread.currentThread());
    }
}
