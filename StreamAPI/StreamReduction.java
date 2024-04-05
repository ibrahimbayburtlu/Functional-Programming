package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamReduction {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sum = numbers.stream().reduce(0,(subTotal,element) -> subTotal + element);

        System.out.println("Total:" + sum);
    }
}
