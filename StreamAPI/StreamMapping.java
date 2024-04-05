package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamMapping {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java","python","c++","javascript","ruby");

        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Upper Case Converting List:" );
        upperCaseStrings.forEach(System.out::println);
    }
}
