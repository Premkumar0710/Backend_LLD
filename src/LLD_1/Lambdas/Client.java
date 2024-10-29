package LLD_1.Lambdas;

public class Client {
    public static void main(String[] args) {

      //  HelloworldPrinter helloworldPrinter = new HelloworldPrinter();
//        Thread thread = new Thread(helloworldPrinter);
//        thread.start();

        System.out.println("--------");

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello world from : " + Thread.currentThread());
//
//            }
//        };

//        Thread thread = new Thread(runnable);
//        thread.start();
        new Thread(() -> System.out.println("Hello world from : " + Thread.currentThread()));

    }
}
