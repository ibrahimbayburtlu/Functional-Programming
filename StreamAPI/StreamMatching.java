package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamMatching {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        boolean anyEven = numbers.stream().anyMatch(num -> num % 2 == 0);


        if (anyEven){
            System.out.println("There is at least one even number in the list");
        }else {
            System.out.println("There are no even number in the list");
        }
    }
}
