package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Games {

    // Game №2 Even
    public static int even() {
        String name = Cli.sayHello();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 0;

        while (count < 3) {
            int randomNumber = random.nextInt(99) + 1;
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");
            String answer = scanner.nextLine();

            if ((randomNumber % 2 == 0 && answer.equals("yes"))
                    || (randomNumber % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
                count++;

            } else {
                if (randomNumber % 2 == 0) {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n"
                            + "Let's try again, "
                            + name
                            + "!");
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                            + "Let's try again, "
                            + name
                            + "!");
                }
                count = 0;
            }
        }
        System.out.println("Congratulations, " + name + "!");
        return count;
    }
}
