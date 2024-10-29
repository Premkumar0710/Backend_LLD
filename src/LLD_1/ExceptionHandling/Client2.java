package LLD_1.ExceptionHandling;

public class Client2 {
    public static void main(String[] args) {

        try{
            Pair pair = new Pair("A","B");
            System.out.println(pair);

            // not a meaningful code
          //  Pair nullpair = new Pair(null,null);
          //  System.out.println(nullpair);
        } catch (Exception exception){
            System.out.println("Null values are not allowed");

        }

        System.out.println("Some other code");

    }
}

// Golden rules :
// 1. Never swallow a particular exception
// 2. Never catch a generic exception
// 3. Never throw a generic exception
