package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static int prime() {

        Random random = new Random();
        String mainGameQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] question = new String[Engine.rounds];
        String[] correctAnswer = new String[Engine.rounds];

        for (var i = 0; i < Engine.rounds; i++) {
            int randomNumber = random.nextInt(20) + 2;
            question[i] = Integer.toString(randomNumber);

            boolean isPrime = true;

            for (int j = 2; j <= (randomNumber - 1); j++) {
                if (randomNumber % j == 0) {
                    isPrime = false;
                    break;
                } isPrime = true;

            } correctAnswer[i] = isPrime ? "yes" : "no";
        }
        Engine.skeletonOfGames(mainGameQuestion, question, correctAnswer);
        return 0;
    }
}
