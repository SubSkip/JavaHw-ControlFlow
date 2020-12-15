
/* ********************
Instructions included in Control Flow - PROJECT (4) (1).md
********************** */
import java.util.Scanner;
import java.util.Random;

public class java_flow_control {

    public static class AsciiChars {
        public static void printNumbers() {
            for (int i = 1; i <= 9; ++i)
                System.out.print(i);
        }

        public static void printLowerCase() {
            for (char i = 'a'; i <= 'z'; ++i)
                System.out.print(i);
        }

        public static void printUpperCase() {
            for (char i = 'A'; i <= 'Z'; ++i)
                System.out.print(i);
        }
    }

    public static void main(String[] args) {

        System.out.println("These are the valid characters:");
        AsciiChars.printNumbers();
        System.out.println();
        AsciiChars.printLowerCase();
        System.out.println();
        AsciiChars.printUpperCase();
        System.out.println();

        Scanner userInput = new Scanner(System.in);
        // Ask user if they wanna play
        System.out.print("Do you want to me choose your lotto numbers? (y or n) ");
        String generate = userInput.next();
        // Grab some data from the user if they enter y
        if (generate.equals("y")) {
            System.out.print("Enter your first name: ");
            String userName = userInput.next();
            System.out.print("Do you have a red car? (yes or no): ");
            String carColor = userInput.next();
            System.out.print("Enter your pet's name: ");
            String petName = userInput.next();
            System.out.print("How old is your pet?: ");
            int petAge = userInput.nextInt();
            System.out.print("What is your lucky number?: ");
            int luckyNumber = userInput.nextInt();
            System.out.print("What is your favorite player's jersey number?: ");
            int jerseyNumber = userInput.nextInt();
            System.out.print("What are the last two digits of your car's year?: ");
            int carYear = userInput.nextInt();
            System.out.print("What is the first name of your favorite actor?: ");
            String actorName = userInput.next();
            System.out.print("Enter a random number between 1 and 50.: ");
            int randomNumber = userInput.nextInt();
            userInput.close();

            // Number 1 - petAge minus carYear
            int numOne = Math.abs(petAge - carYear); // Need to account for neg numbers with Math.abs()
            // Number 2 - First character of actorName converted to an ASCII int equivalent
            char firstChar = actorName.charAt(0);
            int numTwo = (int) firstChar;
            // Number 3 - Last character of actorName converted to an ASCII int equivalent
            char lastChar = actorName.charAt(actorName.length() - 1);
            int numThree = (int) lastChar;
            // Number 4 - Third character of petName converted to an ASCII int equivalent
            char thirdPetChar = petName.charAt(2);
            int numFour = (int) thirdPetChar;
            // Number 5 - Always 42
            int numFive = 42;
            // Magic Number - Jersey number times random number or random int less than 75
            int magicNumber = jerseyNumber * randomNumber;
            if (magicNumber > 75) {
                Random random = new Random();
                magicNumber = random.nextInt(75);
            }
            // output
            System.out.print("Lottery numbers: " + numOne + " " + numTwo + " " + numThree + " " + numFour + " "
                    + numFive + " Magic ball: " + magicNumber);
        } else {
            System.out.print("OK. You can choose your own numbers. Good luck!");
        }
    }
}
