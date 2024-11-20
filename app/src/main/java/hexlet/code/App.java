package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

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

            case "2" -> Even.transferDataToEngine();

            case "3" -> Calc.transferDataToEngine();

            case "4" -> Gcd.transferDataToEngine();

            case "5" -> Progression.transferDataToEngine();

            case "6" -> Prime.transferDataToEngine();

            default -> System.out.println("Invalid choice, please try again.");

        }
        scanner.close();
    }
}
