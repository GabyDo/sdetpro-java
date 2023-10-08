package lesson4;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoopLearning {
    /**
     * Allow user to have 3 guess from 0-9
     * if matched -> hoooray
     * eles: Good luck
     * do while: lam xong roi moi check dieu kien
     */
    public static void main(String[] args) {
        int randomNumber = new SecureRandom().nextInt(10);
        System.out.println("magic number " + randomNumber);
        int guessingTime = 0;
        final int MAX_GUESSING_TIME = 3;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please input a number: ");
            int userInputNum = scanner.nextInt();

            if (userInputNum == randomNumber) {
                System.out.println("Hooray");
                break;
            }
            guessingTime++;
        } while (guessingTime < MAX_GUESSING_TIME);

        if (guessingTime == MAX_GUESSING_TIME) {
            System.out.println("chuc ban may man lan sau :d");
        }
    }
}
