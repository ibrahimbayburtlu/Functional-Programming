package Supplier;

import java.util.Random;
import java.util.function.DoubleSupplier;

public class SupplierDouble {
    public static void main(String[] args) {
        DoubleSupplier randomNumber = () -> new Random().nextInt(1000);

        double randomNum = randomNumber.getAsDouble();
        System.out.println("Random number :" + randomNum);
    }
}
