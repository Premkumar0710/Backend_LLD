package LLD_1.Lambdas;

public class Operations {
    public static MathOperation add(){
        return (a,b)-> a+b;
    }

    public static MathOperation divide(){
        return (a,b)-> b==0 ? 0 : a/b;
    }
}
