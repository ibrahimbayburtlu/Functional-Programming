package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThen {
    public static void main(String[] args) {
        Consumer<Integer> consumer1 = i -> System.out.println(i);
        Consumer<Integer> consumer2 = i -> System.out.println(i+1);
        List<Integer> numberList = Arrays.asList(1,3,5);

        numberList.forEach(consumer1.andThen(consumer2));
    }
}
