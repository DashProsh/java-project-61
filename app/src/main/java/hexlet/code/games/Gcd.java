package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.math.BigInteger;

public class Gcd {

    private static final int MAX_RANDOM_COMMON = 10;
    private static final int MAX_RANDOM_NUMBER = 10;

    public static String[] dataForGame() {
        int randomCommon = Utils.getRandomInt(MAX_RANDOM_COMMON) + 1;
        int randomNumber1 = randomCommon * (Utils.getRandomInt(MAX_RANDOM_COMMON));
        int randomNumber2 = randomCommon * (Utils.getRandomInt(MAX_RANDOM_NUMBER));

        BigInteger bigA = BigInteger.valueOf(randomNumber1);
        BigInteger bigB = BigInteger.valueOf(randomNumber2);

        String gcd = String.valueOf((bigA).gcd(bigB));

        String question = randomNumber1 + " " + randomNumber2;
        String correctAnswer = gcd;

        return new String[]{question, correctAnswer};
    }


    public static String[][] prepareDataForEngine() {

        String[][] eachRound = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            eachRound[i] = dataForGame();
        }
        return eachRound;
    }

    public static void transferDataToEngine() {
        String mainGameQuestion = "Find the greatest common divisor of given numbers.";
        String[][] rounds = prepareDataForEngine();
        Engine.skeletonOfGames(mainGameQuestion, rounds);
    }
}
