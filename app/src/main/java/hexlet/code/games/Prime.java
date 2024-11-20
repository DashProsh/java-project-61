package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int MAX_RANDOM_NUMBER = 20;

    public static String[] dataForGame() {

        int randomNumber = Utils.getRandomInt(MAX_RANDOM_NUMBER) + 1;
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
        String mainGameQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rounds = prepareDataForEngine();
        Engine.skeletonOfGames(mainGameQuestion, rounds);
    }
}
