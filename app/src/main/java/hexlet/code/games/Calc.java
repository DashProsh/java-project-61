package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Calc {
    public static void calc() {

        String mainGameQuestion = "What is the result of the expression?";

        String[][] eachRound = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            final int maxRandomNumber1 = 19;
            final int maxRandomNumber2 = 9;

            int randomNumber1 = Utils.getRandomInt(maxRandomNumber1);
            int randomNumber2 = Utils.getRandomInt(maxRandomNumber2);

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
            eachRound[i][0] = question;
            eachRound[i][1] = correctAnswer;
        }
        Engine.skeletonOfGames(mainGameQuestion, eachRound);
        //return 0;
    }
}
