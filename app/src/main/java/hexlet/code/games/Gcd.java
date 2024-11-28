package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.math.BigInteger;

public class Gcd {

    private static final int MAX_RANDOM_COMMON = 10;
    private static final int MAX_RANDOM_NUMBER = 10;

    public static BigInteger findGCD(int randomNumber1, int randomNumber2) {
        BigInteger bigA = BigInteger.valueOf(randomNumber1);
        BigInteger bigB = BigInteger.valueOf(randomNumber2);

        BigInteger gcd = ((bigA).gcd(bigB));
        return gcd;
    }


    public static String[] dataForGame(int randomNumber1, int randomNumber2) {

        String question = randomNumber1 + " " + randomNumber2;
        String correctAnswer = String.valueOf(findGCD(randomNumber1, randomNumber2));

        return new String[]{question, correctAnswer};
    }


    public static String[][] prepareData() {

        String[][] eachRound = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int randomCommon = Utils.getRandomInt(MAX_RANDOM_COMMON) + 1;
            int randomNumber1 = randomCommon * (Utils.getRandomInt(MAX_RANDOM_COMMON));
            int randomNumber2 = randomCommon * (Utils.getRandomInt(MAX_RANDOM_NUMBER));
            eachRound[i] = dataForGame(randomNumber1, randomNumber2);
        }
        return eachRound;
    }


    public static void transferDataToEngine() {
        String mainGameQuestion = "Find the greatest common divisor of given numbers.";
        String[][] rounds = prepareData();
        Engine.skeletonOfGames(mainGameQuestion, rounds);
    }
}
