package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String sayHello() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?""");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");

        return name;
    }

    public static void sayGoodbye() {
        System.out.println("Bye!");
    }
}







//Cli.sayHello();
//Scanner scanner = new Scanner(System.in);
//Random random = new Random();
//int randomNumber = random.nextInt(100);
//        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
//        System.out.println("Question: " + randomNumber);
//        System.out.println("Your answer: ");
//String answer = scanner.nextLine();
//int count = 0;
//        while (count < 4) {
//        if (randomNumber % 2 == 0) {
//var rightAnswer1 = "yes";
//                if (answer.equals(rightAnswer1)) {
//        System.out.println("Correct!");
//                    return count = count + 1;
//        }
//        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
//                                   "Let's try again, " + name + "!");
//
//            } else if (randomNumber % 2 != 0) {
//var rightAnswer2 = "no";
//                if (answer.equals(rightAnswer2)) {
//        System.out.println("Correct!");
//                    return count = count + 1;
//        }
//        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
//                                   "Let's try again, " + name + "!");
//            }
//
//                    }
//                    return randomNumber;
