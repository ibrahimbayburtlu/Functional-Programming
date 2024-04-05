package Predicate;

import java.util.function.Predicate;

public class PredicateDefault {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println("4 is even: "+ isEven.test(4));
        System.out.println("5 is even: "+ isEven.test(5));
    }
}
