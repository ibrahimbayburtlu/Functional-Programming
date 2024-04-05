package StreamAPI;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamFilter {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream ints = random.ints(10);
        ints.filter(value -> value > 0).forEach(value -> System.out.println(value));
    }
}
