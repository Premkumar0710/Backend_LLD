package LLD_1.FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
            BiConsumer<String,Integer> biConsumer;

            // Can we create objects for interface ? No
            // Way : 1 we cann create a class BiPredicateImplementation & inplement the intrface , we can create object for the class that we created now
            BiPredicate<String,Integer> biPredicate = new BiPredicateImplementation();
            System.out.println(biPredicate.test("prem",3));

            // Way 2 : Anonymous class
            BiPredicate<String , Integer> biPredicate1 = new BiPredicate<String, Integer>() {
                @Override
                public boolean test(String s, Integer integer) {
                    return s.length() > integer;
                }
            };
            System.out.println(biPredicate1.test("asdfgh",10));

            // Way 3 : Lambdas (Java 8)
            // () : Input params , {} : Implementation
            // Applicable for Functional Interfaces alone
            BiPredicate<String , Integer> biPredicate2 = (str,val) ->  str.length() > val; // implementation of a single abstract methods
            biPredicate2.test("asdfg",6);// it will above line

        BinaryOperator<String> binaryOperator = (str1 , str2) -> {
            System.out.println("Lambda expression");
            return str1 + " " + str2 ;
        };
        System.out.println(binaryOperator.apply("Prem","Kumar"));



    }
}
