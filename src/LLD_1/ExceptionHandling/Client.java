package LLD_1.ExceptionHandling;

public class Client {

    public static void main(String[] args) throws Exception {
        Pair pair = new Pair("A","B");
        System.out.println(pair);

        // not a meaningful code
        Pair nullpair = new Pair(null,null);
        System.out.println(nullpair);
    }

}
