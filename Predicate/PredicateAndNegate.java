package Predicate;

import java.util.function.Predicate;

public class PredicateAndNegate {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> sixEquals = num -> num == 6;
        Predicate<Integer> isEvenAndNotSixEquals = isEven.and(sixEquals.negate());
        System.out.println(isEvenAndNotSixEquals.test(3));
        System.out.println(isEvenAndNotSixEquals.test(6));
        System.out.println(isEvenAndNotSixEquals.test(4));
    }
}
