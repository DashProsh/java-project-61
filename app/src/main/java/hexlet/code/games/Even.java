package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void even() {

        String mainGameQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] eachRound = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {

            final int maxRandomNumber = 99;
            int randomNumber = Utils.getRandomInt(maxRandomNumber);

            String question = Integer.toString(randomNumber);
            String correctAnswer = (randomNumber % 2 == 0) ? "yes" : "no";

            eachRound[i][0] = question;
            eachRound[i][1] = correctAnswer;

        }
        Engine.skeletonOfGames(mainGameQuestion, eachRound);
        //return 0;
    }
}
