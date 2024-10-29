package LLD_1.FunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateImplementation implements BiPredicate<String,Integer> {

    @Override
    public boolean test(String s, Integer integer) {
        if(s.length() > integer){
            return true;
        }
        return false;
    }
}
