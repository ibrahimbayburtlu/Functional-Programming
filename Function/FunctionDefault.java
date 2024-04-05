package Function;

import java.util.function.Function;

public class FunctionDefault {
    public static void main(String[] args) {
        Function<Character,Integer> showCharacterValue =
                (character -> Character.getNumericValue(character));

        System.out.println("Character number :"+ showCharacterValue.apply('a'));
        System.out.println("Character number :"+showCharacterValue.apply('b'));

    }
}
