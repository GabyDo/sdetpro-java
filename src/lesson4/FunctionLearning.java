package lesson4;

import java.util.Scanner;

public class FunctionLearning {
    public static void main(String[] args) {
        boolean isContinuning = true;
        while (isContinuning) {
            printGameMenu();
            int userOption = getUserOption();
            if (userOption == 0) {
                isContinuning = false;
            } else if (userOption == 1) {
                System.out.println(" your randome...");
            } else {
                System.out.println(" nhap lai");
            }
        }
        System.out.println("Goodbye");
    }

    /**
     * a set of instruction to do a task
     * start with a verb- camelCase
     * function must be meaning full/express what it does
     */

    //access modifier (public) class method (static) return type (void)- function name(parameter `..p2)
    //method signature ten + parameter
    public static void printGameMenu() {
        System.out.println(" === Game menu ===");
        System.out.println(" 1. Generate random number");
        System.out.println(" 0. Exit");
    }

    private static int getUserOption() {
        System.out.println("please enter your option");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
