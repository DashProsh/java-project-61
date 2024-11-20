package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {

    private static final int MIN_ARRAY_LENGTH = 5;
    private static final int MAX_STEP = 9;
    private static final int MAX_START_VALUE = 14;

    public static String[] dataForGame() {

        int arrayLength = Utils.getRandomInt(MIN_ARRAY_LENGTH) + MIN_ARRAY_LENGTH;
        int[] array = new int[arrayLength];

        int step = Utils.getRandomInt(MAX_STEP);
        int start = Utils.getRandomInt(MAX_START_VALUE);

        for (int j = 0; j < arrayLength; j++) {
            array[j] = start + j * step;
        }

        int indexFromArray = Utils.getRandomInt(MIN_ARRAY_LENGTH - 1);

        String arrayToString = Arrays.toString(array);
        String elementToHide = String.valueOf(array[indexFromArray]);
        String oneElement = "\\b" + elementToHide + "\\b";
        String arrayHideNumber = arrayToString.replaceFirst(oneElement, "..");
        arrayHideNumber = arrayHideNumber.replace("[", "").replace("]", "")
                .replace(",", "");

        String question = arrayHideNumber;
        String correctAnswer = String.valueOf(array[indexFromArray]);

        return new String[]{question, correctAnswer};
    }

    public static String[][] prepareDataForEngine() {

        String[][] eachRound = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            eachRound[i] = dataForGame();
        }
        return eachRound;
    }

    public static void transferDataToEngine() {
        String mainGameQuestion = "What number is missing in the progression?";
        String[][] rounds = prepareDataForEngine();
        Engine.skeletonOfGames(mainGameQuestion, rounds);
    }
}
