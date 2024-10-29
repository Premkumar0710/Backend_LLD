package LLD_1.Lambdas;

public class Client2 {
    public static void main(String[] args) {

        System.out.println("Without using Lambdas");
        MathOperation addOperation = new AddOperation();
        MathOperation subOperation = new SubtractOperation();
        System.out.println(addOperation.operate(4,6));
        System.out.println(subOperation.operate(4,6));

        System.out.println("--------------");

        System.out.println("Using Lambdas");
        MathOperation add = (a,b)-> a+b;
        MathOperation sub = (a,b)-> a-b;
        MathOperation mul = (a,b)-> a*b;
        MathOperation div = (a,b)-> a/b;

        MathOperation div1 = (a,b)-> {
            if(b==0) {return 0;}
            return a/b;
        };

        System.out.println(add.operate(4,6));
        System.out.println(sub.operate(4,6));
        System.out.println(mul.operate(4,6));
        System.out.println(div.operate(4,6));

//        // try this out ; unable to understand
//        System.out.println(execute(2,8,(a,b)->a+b;));
//
//        private static int execute(int a , int b , MathOperation mathoperation){
//            return mathoperation.operate();
//        }




    }
}
