package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static int even() {

        Random random = new Random();
        String mainGameQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] question = new String[Engine.rounds];
        String[] correctAnswer = new String[Engine.rounds];

        for (var i = 0; i < Engine.rounds; i++) {
            int randomNumber = random.nextInt(99) + 1;
            question[i] = Integer.toString(randomNumber);
            correctAnswer[i] = (randomNumber % 2 == 0) ? "yes" : "no";
        }
        Engine.skeletonOfGames(mainGameQuestion, question, correctAnswer);
        return 0;
    }
}
