package hexlet.code;

import java.util.Random;
import java.util.Arrays; // for game №3 calc
import java.util.List; // for game №3 calc
import java.math.BigInteger; // for game №4 gcd

public class Games {

    // Game №2 Even
    public static int even() {

        Random random = new Random();
        String mainGameQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] question = new String[Engine.rounds];
        String[] correctAnswer = new String[Engine.rounds];

        for (var i = 0; i < Engine.rounds; i++) {
            int randomNumber = random.nextInt(99) + 1;
            question[i] = Integer.toString(randomNumber);
            correctAnswer[i] = (randomNumber % 2 == 0) ? "yes" : "no";
        }
        Engine.skeletonOfGames(mainGameQuestion, question, correctAnswer);
        return 0;
    }



    // Game №3 Calc
    public static int calc() {

        Random random = new Random();
        String mainGameQuestion = "What is the result of the expression?";

        String[] question = new String[Engine.rounds];
        String[] correctAnswer = new String[Engine.rounds];

        for (var i = 0; i < Engine.rounds; i++) {
            int randomNumber1 = random.nextInt(19) + 1;
            int randomNumber2 = random.nextInt(9) + 1;

            String plus = randomNumber1 + "+" + randomNumber2;
            String minus = randomNumber1 + "-" + randomNumber2;
            String mult = randomNumber1 + "*" + randomNumber2;

            List<String> randomExpression = Arrays.asList(plus, minus, mult);
            Random rand = new Random();
            String randomQuestion = randomExpression.get(rand.nextInt(randomExpression.size()));

            question[i] = randomQuestion;

            if (randomQuestion.equals(plus)) {
                correctAnswer[i] = String.valueOf(randomNumber1 + randomNumber2);
            } else if (randomQuestion.equals(minus)) {
                correctAnswer[i] = String.valueOf(randomNumber1 - randomNumber2);
            } else {
                correctAnswer[i] = String.valueOf(randomNumber1 * randomNumber2);
            }
        }
        Engine.skeletonOfGames(mainGameQuestion, question, correctAnswer);
        return 0;
    }


    // Game №4 GCD
    public static int gcd() {
        Random random = new Random();
        String mainGameQuestion = "Find the greatest common divisor of given numbers.";

        String[] question = new String[Engine.rounds];
        String[] correctAnswer = new String[Engine.rounds];

        for (var i = 0; i < Engine.rounds; i++) {

            int randomCommon = random.nextInt(10) + 2;
            int randomNumber1 = randomCommon * (random.nextInt(10) + 1);
            int randomNumber2 = randomCommon * (random.nextInt(10) + 1);

            BigInteger bigA = BigInteger.valueOf(randomNumber1);
            BigInteger bigB = BigInteger.valueOf(randomNumber2);

            String gcd = String.valueOf((bigA).gcd(bigB));

            question[i] = randomNumber1 + " " + randomNumber2;
            correctAnswer[i] = gcd;
        }
        Engine.skeletonOfGames(mainGameQuestion, question, correctAnswer);
        return 0;
    }
}


