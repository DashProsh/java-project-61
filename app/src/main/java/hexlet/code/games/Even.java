package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final int MAX_RANDOM_NUMBER = 99;

    public static String[] dataForGame() {

        int randomNumber = Utils.getRandomInt(MAX_RANDOM_NUMBER);

        String question = Integer.toString(randomNumber);
        String correctAnswer = (randomNumber % 2 == 0) ? "yes" : "no";

        return new String[]{question, correctAnswer};
    }


    public static String[][] prepareDataForEngine() {

        String[][] eachRound = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            eachRound[i] = dataForGame();
        }
        return eachRound;
    }

    public static void transferDataToEngine() {
        String mainGameQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = prepareDataForEngine();
        Engine.skeletonOfGames(mainGameQuestion, rounds);
    }
}
