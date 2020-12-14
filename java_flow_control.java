
/* ********************
Instructions included in Control Flow - PROJECT (4) (1).md
********************** */
import java.util.Scanner;
import java.util.Random;

public class java_flow_control {

    public static class AsciiChars {
        public static void printNumbers() {
            AsciiChars.printNumbers();
        }

        public static void printLowerCase() {
            AsciiChars.printLowerCase();
        }

        public static void printUpperCase() {
            AsciiChars.printUpperCase();
        }
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Do you want to me choose your lotto numbers? (y or n) ");
        String generate = userInput.next();

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

            // Number 1
            int numOne = randomNumber - carYear;
            // Number 2
            int numTwo;
            // Number 3
            int numThree;
            // Number 4
            int numFour;
            // Number 5
            int numFive;
            // Magic Number
            int magicNumber = jerseyNumber * randomNumber;
            if (magicNumber > 75) {
                Random random = new Random();
                magicNumber = random.nextInt(75);
            }
            // output
            System.out.print("Lottery numbers: " + numOne + " " + numTwo + " " + numThree + " " + numFour + " "
                    + numFive + " Magic ball: " + magicNumber);
        } else {
            System.out.print("OK. You can choose your own numbers.");
        }
    }
}
