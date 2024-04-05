package Predicate;

import java.util.function.BiPredicate;

public class PredicateBi {
    static BiPredicate<Integer,Integer> equals = (x,y) -> x==y;
    public static void main(String[] args) {
        System.out.println(equals.test(10,10)); // True
        System.out.println(equals.test(10,12)); // False
    }
}
