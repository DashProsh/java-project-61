package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.Random;


public class Gcd {
    public static int gcd() {

        final int maxrandomCommon = 10;
        final int maxRandomNumber = 10;

        Random random = new Random();
        String mainGameQuestion = "Find the greatest common divisor of given numbers.";

        String[] question = new String[Engine.ROUNDS];
        String[] correctAnswer = new String[Engine.ROUNDS];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            int randomCommon = random.nextInt(maxrandomCommon) + 2;
            int randomNumber1 = randomCommon * (random.nextInt(maxRandomNumber) + 1);
            int randomNumber2 = randomCommon * (random.nextInt(maxRandomNumber) + 1);

            BigInteger bigA = BigInteger.valueOf(randomNumber1);
            BigInteger bigB = BigInteger.valueOf(randomNumber2);

            String gcd = String.valueOf((bigA).gcd(bigB));

            question[i] = randomNumber1 + " " + randomNumber2;
            correctAnswer[i] = gcd;
        }
        Engine.skeletonOfGames(mainGameQuestion, question, correctAnswer);
        return 0;
    }
}
