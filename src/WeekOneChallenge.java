import java.util.Random;
import java.util.Scanner;

public class WeekOneChallenge {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int testNumber;
        Scanner key = new Scanner(System.in);
        System.out.println("Would you like to choose a number?  Or use a random one? (Random/Choose)");
        String input = key.nextLine();
        if (input.equalsIgnoreCase("random")) {
            int testNumber = randomNumber.nextInt(250) + 1;
        } else {
            System.out.println("Enter a Number:\t");
            testNumber = key.nextInt();
        }


        System.out.println(testNumber);
        for (int i = 2; i < testNumber; i++) {
            int remainder = (testNumber % i);


            if (remainder == 0) {
                System.out.println(testNumber + "  Is not a prime number.\n");
                break;
            } else if (i == (testNumber - 1) && i != 2) {
                System.out.println(testNumber + " Is a Prime number\n");
                break;

            }


        }
    }
}

