package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void skeletonOfGames(String mainGameQuestion, String[][] rounds) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?""");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println(mainGameQuestion);

        for (var i = 0; i < ROUNDS; i++) {

            String question = rounds[i][0];
            String correctAnswer = rounds[i][1];

            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");

            } else {
                System.out.println("'" + userAnswer + "'" + "is wrong answer ;(. "
                        + "Correct answer was " + "'" + correctAnswer + "'" + ". \n"
                        + "Let's try again, "
                        + name
                        + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
