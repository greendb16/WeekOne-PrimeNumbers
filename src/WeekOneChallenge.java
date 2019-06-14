

import java.util.Random;
import java.util.Scanner;

public class WeekOneChallenge {

    public static void main(String[] args) {

        while (true) {
            Random randomNumber = new Random();
            Scanner key = new Scanner(System.in);
            System.out.println("Would you like to choose a number?  Or use a random one? (Random/Choose)");
            String input = key.nextLine();
            //Generating Random Number and testing for prime.
            if (input.equalsIgnoreCase("random")) {
                System.out.println("Generating  a Random number:\t");
                int testNumber = randomNumber.nextInt(250) + 1;
                System.out.println("Your random number is:\t" + testNumber);
                if (testNumber == 2) {
                    System.out.println("2  is a prime number.");
                }
                for (int i = 2, t = 0; i < testNumber; i++) {
                    //Finding each divisor
                    int remainder = (testNumber % i);
                    if (remainder == 0) {
                        System.out.println("It is divisible by:\t" + i);
                        t++;
                    }
                    //Printing Determination after all tests
                    if (i == (testNumber - 1) && t==0){
                        System.out.println(testNumber + "  Is a Prime number\n");
                        break;
                    } else if ((i == (testNumber - 1))) {
                        System.out.println(testNumber + "  Is not a prime number.\n");

                        break;
                    }

                }

                //Input option
            } else {
                System.out.println("Enter a Number:\t");
                int testNumber = key.nextInt();
                key.nextLine();
                if (testNumber == 2) {
                    System.out.println("2  Is a prime number");
                }
                for (int i = 2, p = 0; i < testNumber; i++) {
                    int remainder = (testNumber % i);

                    //Finding each divisor
                    if (remainder == 0) {
                        System.out.println("It is divisible by:\t" + i);
                        p++;
                    }
                    //Printing declaration after all tests
                    if (i == (testNumber - 1) && p == 0) {
                        System.out.println(testNumber + " Is a Prime number\n");
                        break;

                    } else if (i == (testNumber - 1)) {
                        System.out.println(testNumber + "  Is not a prime number.\n");
                        break;
                    }


                }
            }
            //looping for additional responses
            System.out.println("Would you like to try again? (Yes/No)");
            String inputRedo = key.nextLine();
            if (inputRedo.equalsIgnoreCase("yes")) {
                continue;
            } else {
                System.out.println("Goodbye")
                ;
                break;
            }


        }
    }

}

