package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static int even() {

        final int maxRandomNumber = 5;

        Random random = new Random();
        String mainGameQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] question = new String[Engine.ROUNDS];
        String[] correctAnswer = new String[Engine.ROUNDS];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = random.nextInt(maxRandomNumber) + 1;
            question[i] = Integer.toString(randomNumber);
            correctAnswer[i] = (randomNumber % 2 == 0) ? "yes" : "no";
        }
        Engine.skeletonOfGames(mainGameQuestion, question, correctAnswer);
        return 0;
    }
}
