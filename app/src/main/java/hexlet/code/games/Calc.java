package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Calc {

    private static final int MAX_RANDOM_NUMBER1 = 19;
    private static final int MAX_RANDOM_NUMBER2 = 9;

    public static String[] dataForGame() {
        int randomNumber1 = Utils.getRandomInt(MAX_RANDOM_NUMBER1);
        int randomNumber2 = Utils.getRandomInt(MAX_RANDOM_NUMBER2);

        String plus = randomNumber1 + " + " + randomNumber2;
        String minus = randomNumber1 + " - " + randomNumber2;
        String mult = randomNumber1 + " * " + randomNumber2;

        List<String> randomExpression = Arrays.asList(plus, minus, mult);
        Random rand = new Random();

        String question = randomExpression.get(rand.nextInt(randomExpression.size()));
        String correctAnswer;

        if (question.equals(plus)) {
            correctAnswer = String.valueOf(randomNumber1 + randomNumber2);
        } else if (question.equals(minus)) {
            correctAnswer = String.valueOf(randomNumber1 - randomNumber2);
        } else {
            correctAnswer = String.valueOf(randomNumber1 * randomNumber2);
        }
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
        String mainGameQuestion = "What is the result of the expression?";
        String[][] rounds = prepareDataForEngine();
        Engine.skeletonOfGames(mainGameQuestion, rounds);
    }
}
