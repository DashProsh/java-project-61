package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 10;

    public static void skeletonOfGames(String mainGameQuestion, String[] question, String[] correctAnswer) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?""");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println(mainGameQuestion);

        for (var i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + question[i]);
            System.out.println("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(correctAnswer[i])) {
                System.out.println("Correct!");

            } else {
                System.out.println("'" + userAnswer + "'" + "is wrong answer ;(. "
                        + "Correct answer was " + "'" + correctAnswer[i] + "'" + ". \n"
                        + "Let's try again, "
                        + name
                        + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
