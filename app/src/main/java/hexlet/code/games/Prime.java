package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int MAX_RANDOM_NUMBER = 20;

    public static boolean trueOrFalse(int randomNumber) {

        for (int j = 2; j <= (randomNumber - 1); j++) {
            if (randomNumber % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static String[] dataForGame(int randomNumber) {

        String question = Integer.toString(randomNumber);
        String correctAnswer = trueOrFalse(randomNumber) ? "yes" : "no";

        return new String[]{question, correctAnswer};
    }

    public static String[][] prepareData() {

        String[][] eachRound = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = Utils.getRandomInt(MAX_RANDOM_NUMBER) + 1;
            eachRound[i] = dataForGame(randomNumber);
        }
        return eachRound;
    }

    public static void transferDataToEngine() {
        String mainGameQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rounds = prepareData();
        Engine.skeletonOfGames(mainGameQuestion, rounds);
    }
}
