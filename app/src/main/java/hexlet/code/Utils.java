package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomInt(int maxRandomNumber) {
        Random random = new Random();
        int number = random.nextInt(maxRandomNumber) + 1;

        return number;
    }
}
