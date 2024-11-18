package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.math.BigInteger;
import java.util.Random;


public class Gcd {
    public static int gcd() {

        String mainGameQuestion = "Find the greatest common divisor of given numbers.";

        String[] question = new String[Engine.ROUNDS];
        String[] correctAnswer = new String[Engine.ROUNDS];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            final int maxrandomCommon = 10;
            final int maxRandomNumber = 10;

            int randomCommon = Utils.getRandomInt(maxrandomCommon) + 1;
            int randomNumber1 = randomCommon * (Utils.getRandomInt(maxRandomNumber));
            int randomNumber2 = randomCommon * (Utils.getRandomInt(maxRandomNumber));

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
