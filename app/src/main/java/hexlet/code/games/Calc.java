package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calc {

    private static final int MAX_RANDOM_NUMBER1 = 19;
    private static final int MAX_RANDOM_NUMBER2 = 9;

    public static int calculateResult(int randomNumber1, int randomNumber2, String randomOperator) {

        int resultOfExpression;

        switch (randomOperator) {
            case "+" -> {
                int result = randomNumber1 + randomNumber2;
                resultOfExpression = result;
            }
            case "-" -> {
                int result = randomNumber1 - randomNumber2;
                resultOfExpression = result;
            }
            case "*" -> {
                int result = randomNumber1 * randomNumber2;
                resultOfExpression = result;
            }
            default -> throw new IllegalStateException("Unexpected value: " + randomOperator);
        }
        return resultOfExpression;
    }


    public static String[] dataForGame(int randomNumber1, int randomNumber2, String randomOperator) {

        String question = randomNumber1 + " " + randomOperator + " " + randomNumber2;
        String correctAnswer = String.valueOf(calculateResult(randomNumber1, randomNumber2, randomOperator));
        return new String[]{question, correctAnswer};
    }


    public static String[][] prepareData() {

        String[][] eachRound = new String[Engine.ROUNDS][2];
        char[] operators = "+-*".toCharArray();
        Random rand = new Random();

        for (var i = 0; i < Engine.ROUNDS; i++) {

            int randomNumber1 = Utils.getRandomInt(MAX_RANDOM_NUMBER1);
            int randomNumber2 = Utils.getRandomInt(MAX_RANDOM_NUMBER2);
            String randomOperator = String.valueOf(operators[rand.nextInt(operators.length)]);

            eachRound[i] = dataForGame(randomNumber1, randomNumber2, randomOperator);
        }
        return eachRound;
    }


    public static void transferDataToEngine() {
        String mainGameQuestion = "What is the result of the expression?";
        String[][] rounds = prepareData();
        Engine.skeletonOfGames(mainGameQuestion, rounds);
    }
}
