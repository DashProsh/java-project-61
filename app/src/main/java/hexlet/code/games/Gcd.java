package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.math.BigInteger;
import java.util.Random;


public class Gcd {
    public static void gcd() {

        String mainGameQuestion = "Find the greatest common divisor of given numbers.";

        String[][] eachRound = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            final int maxrandomCommon = 10;
            final int maxRandomNumber = 10;

            int randomCommon = Utils.getRandomInt(maxrandomCommon) + 1;
            int randomNumber1 = randomCommon * (Utils.getRandomInt(maxRandomNumber));
            int randomNumber2 = randomCommon * (Utils.getRandomInt(maxRandomNumber));

            BigInteger bigA = BigInteger.valueOf(randomNumber1);
            BigInteger bigB = BigInteger.valueOf(randomNumber2);

            String gcd = String.valueOf((bigA).gcd(bigB));

            String question = randomNumber1 + " " + randomNumber2;
            String correctAnswer = gcd;

            eachRound[i][0] = question;
            eachRound[i][1] = correctAnswer;
        }
        Engine.skeletonOfGames(mainGameQuestion, eachRound);
        //return 0;
    }
}
