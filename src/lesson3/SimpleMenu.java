package lesson3;

import java.security.SecureRandom;
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {

        /**
         * ==== Game menu ====
         * 1. generate random number
         * 0.exit
         */
        boolean isContinuing = true;
        while (isContinuing) {
            System.out.println("==== Game menu ====");
            System.out.println("1. generate random number");
            System.out.println("0. exit");

            System.out.println( "please enter your option");
            Scanner scanner = new Scanner(System.in);
            int userOption = scanner.nextInt();
            if(userOption == 0) {
                isContinuing = false;
            } else if (userOption == 1) {
                System.out.printf("your random number is: %d /n", new SecureRandom().nextInt(5) +1 ); // tranh so 0

            } else {
                System.out.println("nhap lui roai teo owi");
            }
        }

        System.out.println(" goodbye");
    }

}

