import java.util.Scanner;

public class UserScanner {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // name input
        System.out.println("Please enter your name: ");
        String name = userInput.next();
        // output
        System.out.printf("\nHello %s. ", name);

        // continue interaction portion
        System.out.println("\nWould you like to continue to the interactive portion? Enter 'yes' or 'y'");
        String answer = userInput.next();

        // if statement for answer
        if (answer.equals("yes") || answer.equals("y")) {
            System.out.println("Yay, lets complete a survey!");
        } else {
            System.out.println("Please return back later!");
        }

        // survey questions in a loop
        System.out.println("\nDo you have a red car? Enter 'yes' or 'no'.");
        String car = userInput.next();
        if ((answer.equals("yes") || answer.equals("y")) && car.equals("yes")) {
            System.out.println("Your car is red.");
        } else {
            System.out.println("Your car is NOT red.");
        }

        System.out.println("\nWhat is the name of your favorite pet if you have one? If no pet, enter no pet.");
        String pet = userInput.next();
        if (pet.equals("")) {
            System.out.printf("%s", pet);
        }

        System.out.println("\nWhat is the age of your favorite pet?  If no pet, enter no pet.");
        int age = userInput.nextInt();
        // if (age.equals('')) {
         System.out.printf(" Your age is: %s. \n", age);
        //}

        System.out.println("\nWhat is your lucky number?");
        String lucky = userInput.next();
        System.out.printf("Your lucky number is %s", lucky);











    }

}
