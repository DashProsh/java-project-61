package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final int MAX_RANDOM_NUMBER = 99;

    public static boolean trueOrFalse(int randomNumber) {
        return randomNumber % 2 == 0;
    }

    public static String[] dataForGame(int randomNumber) {

        String question = Integer.toString(randomNumber);
        String correctAnswer = trueOrFalse(randomNumber) ? "yes" : "no";

        return new String[]{question, correctAnswer};
    }


    public static String[][] prepareData() {

        String[][] eachRound = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = Utils.getRandomInt(MAX_RANDOM_NUMBER);
            eachRound[i] = dataForGame(randomNumber);
        }
        return eachRound;
    }

    public static void transferDataToEngine() {
        String mainGameQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = prepareData();
        Engine.skeletonOfGames(mainGameQuestion, rounds);
    }
}
