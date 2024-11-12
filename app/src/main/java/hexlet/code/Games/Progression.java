package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;

public class Progression {
    public static int progression() {
        Random random = new Random();
        String mainGameQuestion = "What number is missing in the progression?";

        String[] question = new String[Engine.rounds];
        String[] correctAnswer = new String[Engine.rounds];

        for (var i = 0; i < Engine.rounds; i++) {

            int arrayLength = random.nextInt(5) + 5;
            int[] array = new int[arrayLength];

            int step = random.nextInt(9) + 1;
            int start = random.nextInt(14) + 1;

            for (int j = 0; j < arrayLength; j++) {
                array[j] = start + j * step;
            }

            int indexFromArray = random.nextInt(arrayLength - 1);

            String arrayToString = Arrays.toString(array);
            String elementToHide = String.valueOf(array[indexFromArray]);
            String oneElement = "\\b" + elementToHide + "\\b";
            String arrayHideNumber = arrayToString.replaceFirst(oneElement, "..");
            arrayHideNumber = arrayHideNumber.replace("[", "").replace("]", "")
                    .replace(",", "");

            question[i] = arrayHideNumber;
            correctAnswer[i] = String.valueOf(array[indexFromArray]);

        }
        Engine.skeletonOfGames(mainGameQuestion, question, correctAnswer);
        return 0;
    }

}
