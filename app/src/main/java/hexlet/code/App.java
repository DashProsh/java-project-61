package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:""");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1" ->
                Cli.sayHello();

            case "0" ->
                Cli.sayGoodbye();

            case "2" ->
                Games.even();

            default -> System.out.println("Invalid choice, please try again.");

        }
        scanner.close();
    }
}
