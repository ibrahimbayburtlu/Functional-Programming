package Predicate;

import java.util.function.IntPredicate;

public class PredicateInt {
    static IntPredicate isEven = num -> num % 2 == 0;
    public static void main(String[] args) {
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(9));
    }
}
