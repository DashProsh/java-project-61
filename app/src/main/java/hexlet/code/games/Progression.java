package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {

    private static final int MIN_ARRAY_LENGTH = 5;
    private static final int MAX_STEP = 9;
    private static final int MAX_START_VALUE = 14;

    public static int[] createProgression(int arrayLength, int step, int start) {

        int[] array = new int[arrayLength];

        for (int j = 0; j < arrayLength; j++) {
            array[j] = start + j * step;
        }
        return array;
    }


    public static String createProgressionWithoutNumber(int[] array, int indexFromArray) {
        String arrayToString = Arrays.toString(array);
        String elementToHide = String.valueOf(array[indexFromArray]);
        String oneElement = "\\b" + elementToHide + "\\b";
        String arrayWithoutNumber = arrayToString.replaceFirst(oneElement, "..");
        arrayWithoutNumber = arrayWithoutNumber.replace("[", "").replace("]", "")
                .replace(",", "");

        return arrayWithoutNumber;
    }


    public static String[] dataForGame(int arrayLength, int step, int start) {
        int[] array = createProgression(arrayLength, step, start);
        int indexFromArray = Utils.getRandomInt(MIN_ARRAY_LENGTH - 1);
        String question = createProgressionWithoutNumber(array, indexFromArray);
        String correctAnswer = String.valueOf(array[indexFromArray]);
        return new String[]{question, correctAnswer};
    }


    public static String[][] prepareData() {

        String[][] eachRound = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int arrayLength = Utils.getRandomInt(MIN_ARRAY_LENGTH) + MIN_ARRAY_LENGTH;
            int step = Utils.getRandomInt(MAX_STEP);
            int start = Utils.getRandomInt(MAX_START_VALUE);

            eachRound[i] = dataForGame(arrayLength, step, start);
        }
        return eachRound;
    }


    public static void transferDataToEngine() {
        String mainGameQuestion = "What number is missing in the progression?";
        String[][] rounds = prepareData();
        Engine.skeletonOfGames(mainGameQuestion, rounds);
    }
}
