import java.util.*;

public class ControlFlow {
    public static void main(String[] args) {
        // Prints the valid ASCII values in decimal form
        AsciiChars.printNumbers();
        // separate the block of values
        System.out.println();
        AsciiChars.printLowerCase();
        System.out.println();
        AsciiChars.printUpperCase();
        System.out.println();

        Scanner userInput = new Scanner(System.in);

        // name input
        System.out.println("Please enter your name: ");
        String name = userInput.next();
        // output
        System.out.println("\nHello " + name);

        // continue interaction portion
        System.out
                .println("\nWould you like to continue to the interactive portion? Enter 'y' for yes or 'n' for no: ");
        String answer = userInput.next();
        switch (answer) {
            case "y":
            case "yes":
                break;
            default:
                System.out.println("Please return later to complete the survey.");
                System.exit(0);
        }

        // survey questions in a loop
        while (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            System.out.println("Enter the name of your favorite pet: ");
            String answer1 = userInput.next();

            System.out.println("Enter the age of your favorite pet: ");
            int answer2 = userInput.nextInt();

            System.out.println("Enter your lucky number: ");
            int answer3 = userInput.nextInt();

            System.out.println("Enter the jersey number of your favorite player: ");
            int answer4 = userInput.nextInt();

            System.out.println("Enter the two-digit model year of your car: ");
            int answer5 = userInput.nextInt();

            System.out.println("What is the first name of your favorite actor/actress: ");
            String answer6 = userInput.next();

            System.out.println("Enter a random number between 1 and 50.");
            int answer7 = userInput.nextInt();

            System.out.println();

            int randomNum = (int) ((Math.random() * 10) + 1);

            // lottery numbers
            int magicBall = answer4 + randomNum;
            int userNum1 = (int) answer1.charAt(2);
            int userNum2 = answer2 + answer5;
            int userNum3 = answer3 + 42;
            int userNum4 = answer4 + answer2 + answer3;
            int userNum5 = answer5 + answer3;

            // array for lotto numbers
            int[] lottoArray = { userNum1, userNum2, userNum3, userNum4, userNum5 };

            // checking to see if numbers are in range and adjust
            for (int i = 0; i < lottoArray.length; i++) {
                while (lottoArray[i] < 1) {
                    lottoArray[i] += 65;
                }
                while (lottoArray[i] > 65) {
                    lottoArray[i] -= 65;
                }
                if (i == lottoArray.length - 1) {
                    while (lottoArray[i] < 1) {
                        lottoArray[i] += 75;
                    }
                    while (lottoArray[i] > 75) {
                        lottoArray[i] -= 75;
                    }
                }
            }

            // sorting numbers in ascending order
            Arrays.sort(lottoArray);
            System.out.print("Lotto Numbers: ");

            // lotto numbers and magic ball number
            for (int i = 0; i < lottoArray.length; i++) {
                System.out.print(lottoArray[i] + " ");
            }
            System.out.print("\nMagic Ball: " + magicBall);
            System.out.println();
            System.out.println("\nWant to play again? Enter 'y' for yes or 'n' for no: ");
            answer = userInput.next();

        }
        System.out.printf("Thank you for playing, %s!", name);

        userInput.close();
    }

}
