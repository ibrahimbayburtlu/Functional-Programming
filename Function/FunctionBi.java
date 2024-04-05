package Function;

import java.util.function.BiFunction;

public class FunctionBi {
    public static void main(String[] args) {
        // public interface BiFunction<T, U, R>
        BiFunction<Integer,Integer,Integer> sumFunction = (num1,num2) -> num1 + num2;

        int number1 = 10;
        int number2 = 20;
        int result = sumFunction.apply(number1,number2);
        System.out.println("Sum: "+ result);
    }
}
