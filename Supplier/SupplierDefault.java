package Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDefault {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> new Random().nextInt(1000);

        int randomNum = randomNumber.get();
        System.out.println("Random number:" + randomNum);
    }
}
