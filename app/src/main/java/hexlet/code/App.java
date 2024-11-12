package hexlet.code;

import hexlet.code.Games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:""");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1" -> Cli.sayHello();

            case "0" -> Cli.sayGoodbye();

            case "2" -> Even.even();

            case "3" -> Calc.calc();

            case "4" -> Gcd.gcd();

            case "5" -> Progression.progression();

            case "6" -> Prime.prime();

            default -> System.out.println("Invalid choice, please try again.");

        }
        scanner.close();
    }
}
