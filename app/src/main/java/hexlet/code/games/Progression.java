package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    public static int progression() {

        String mainGameQuestion = "What number is missing in the progression?";

        String[] question = new String[Engine.ROUNDS];
        String[] correctAnswer = new String[Engine.ROUNDS];

        for (var i = 0; i < Engine.ROUNDS; i++) {

            final int minArrayLength = 5;
            final int maxStep = 9;
            final int maxStartValue = 14;

            int arrayLength = Utils.getRandomInt(minArrayLength) + minArrayLength;
            int[] array = new int[arrayLength];

            int step = Utils.getRandomInt(maxStep);
            int start = Utils.getRandomInt(maxStartValue);

            for (int j = 0; j < arrayLength; j++) {
                array[j] = start + j * step;
            }

            int indexFromArray = Utils.getRandomInt(minArrayLength - 1);

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
