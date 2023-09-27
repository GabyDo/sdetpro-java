package lab_02;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        /***
         * Allow user to input a number, print out it’s an odd or even number
         * user input a number from keyboard
         * character odd number: number %2 = 1
         * character even number: number %2 = 0
         * print out number and it character
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your number: ");
        int inputNumber = scanner.nextInt();

        String numberCharacter = (inputNumber % 2) == 1 ? "odd" : "even";

        System.out.println("your number is " + numberCharacter);

    }
}
