package hexlet.code;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
}



//        while (count < rounds) {
//            int randomNumber1 = random.nextInt(19) + 1;
//            int randomNumber2 = random.nextInt(9) + 1;
//
//            String plus = randomNumber1 + "+" + randomNumber2;
//            String minus = randomNumber1 + "-" + randomNumber2;
//            String mult = randomNumber1 + "*" + randomNumber2;
//
//            int resultPlus = randomNumber1 + randomNumber2;
//            int resultMinus = randomNumber1 - randomNumber2;
//            int resultMult = randomNumber1 * randomNumber2;
//
//            List<String> givenList = Arrays.asList(plus, minus, mult);
//            Random rand = new Random();
//            String randomQuestion = givenList.get(rand.nextInt(givenList.size()));
//
//            System.out.println("Question: " + randomQuestion);
//            System.out.println("Your answer: ");
//            String answer = scanner.nextLine();
//
//            if (randomQuestion.equals(plus) && Integer.parseInt(answer) == resultPlus
//                    || randomQuestion.equals(minus) && Integer.parseInt(answer) == resultMinus
//                    || randomQuestion.equals(mult) && Integer.parseInt(answer) == resultMult) {
//                System.out.println("Correct!");
//                count++;
//
//            } else {
//                if (randomQuestion.equals(plus)) {
//                    System.out.println("'" + answer + "'" + " is wrong answer ;(. " +
//                            "Correct answer was " + "'" + resultPlus + "'" + ".\n"
//                            + "Let's try again, "
//                            + name
//                            + "!");
//                } else if (randomQuestion.equals(minus)){
//                    System.out.println("'" + answer + "'" + " is wrong answer ;(. " +
//                            "Correct answer was " + "'" + resultMinus + "'" + ".\n"
//                            + "Let's try again, "
//                            + name
//                            + "!");
//                } else {
//                    System.out.println("'" + answer + "'" + " is wrong answer ;(. " +
//                            "Correct answer was " + "'" + resultMult + "'" + ".\n"
//                            + "Let's try again, "
//                            + name
//                            + "!");
//                }
//                count = 0;
//                return count;
//            }
//        }
//        System.out.println("Congratulations, " + name + "!");
//        return count;
//    }
//}
//
