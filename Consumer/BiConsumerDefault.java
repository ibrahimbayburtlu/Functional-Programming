package Consumer;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerDefault {
    public static void main(String[] args) {
        Map<String,Integer> moneys = Map.of("ibrahim",100,"Buse",200);
        BiConsumer<String,Integer> biConsumer =
                (person,money) -> System.out.println(person + " has money "+ money);

        moneys.forEach(biConsumer);
    }
}
