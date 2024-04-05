package Function;

import java.util.function.IntFunction;

public class FunctionInt {
    public static void main(String[] args) {
        IntFunction<String> intToString = num -> Integer.toString(num);

        int number = 42;

        String result = intToString.apply(number);
        System.out.println("Result: " + result);
    }
}
