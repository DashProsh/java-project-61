package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Calc {
    public static int calc() {

        //Random random = new Random();
        String mainGameQuestion = "What is the result of the expression?";

        String[] question = new String[Engine.ROUNDS];
        String[] correctAnswer = new String[Engine.ROUNDS];

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
            String randomQuestion = randomExpression.get(rand.nextInt(randomExpression.size()));

            question[i] = randomQuestion;

            if (randomQuestion.equals(plus)) {
                correctAnswer[i] = String.valueOf(randomNumber1 + randomNumber2);
            } else if (randomQuestion.equals(minus)) {
                correctAnswer[i] = String.valueOf(randomNumber1 - randomNumber2);
            } else {
                correctAnswer[i] = String.valueOf(randomNumber1 * randomNumber2);
            }
        }
        Engine.skeletonOfGames(mainGameQuestion, question, correctAnswer);
        return 0;
    }

}
