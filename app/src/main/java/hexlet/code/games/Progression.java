package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    public static void progression() {

        String mainGameQuestion = "What number is missing in the progression?";

        String[][] eachRound = new String[Engine.ROUNDS][2];

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

            String question = arrayHideNumber;
            String correctAnswer = String.valueOf(array[indexFromArray]);

            eachRound[i][0] = question;
            eachRound[i][1] = correctAnswer;
        }
        Engine.skeletonOfGames(mainGameQuestion, eachRound);
        //return 0;
    }
}
