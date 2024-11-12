package hexlet.code.Games;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.Random;


public class Gcd {
    public static int gcd() {
        Random random = new Random();
        String mainGameQuestion = "Find the greatest common divisor of given numbers.";

        String[] question = new String[Engine.rounds];
        String[] correctAnswer = new String[Engine.rounds];

        for (var i = 0; i < Engine.rounds; i++) {

            int randomCommon = random.nextInt(10) + 2;
            int randomNumber1 = randomCommon * (random.nextInt(10) + 1);
            int randomNumber2 = randomCommon * (random.nextInt(10) + 1);

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
