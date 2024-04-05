package Consumer;

import java.util.function.Consumer;

public class ConsumerDefault {
    public static void main(String[] args) {
        Consumer<String> printString = str -> System.out.println("Started param: "+ str);

        printString.accept("Hello,World!");
    }
}
