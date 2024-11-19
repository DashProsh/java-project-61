package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void prime() {

        String mainGameQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] eachRound = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            final int maxRandomNumber = 20;

            int randomNumber = Utils.getRandomInt(maxRandomNumber) + 1;
            String question = Integer.toString(randomNumber);

            boolean isPrime = true;

            for (int j = 2; j <= (randomNumber - 1); j++) {
                if (randomNumber % j == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;

            }
            String correctAnswer = isPrime ? "yes" : "no";

            eachRound[i][0] = question;
            eachRound[i][1] = correctAnswer;
        }
        Engine.skeletonOfGames(mainGameQuestion, eachRound);
        //return 0;
    }
}
