package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/***
 * Generate an ArrayList with random numbers(not fixed numbers) those are less than 1000
 * After that, have a menu (You can use while loop) to have below options
 * =====MENU======
 * 1. Print all numbers
 * 2. Print maximum value
 * 3. Print minimum value
 * 4. Search number
 *
 * Option 01: We print all the numbers that we have in the array list
 * Option 02: We need to find out the maximum number from array list and print out that value
 * Option 03: We need to find out the minimum number from array list and print out that value
 * Option 04: We allow user to input a number to search, if that number is existing in arraylist, we print the number and its index.
 * Otherwise, print that number is not in the list
 */

public class Lab4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = createAList(scanner);
        System.out.println(" * =====MENU====== \n * 1. Print all numbers \n  * 2. Print maximum value \n" +
                " * 3. Print minimum value \n * 4. Search number");
        boolean quit = false;
        do {

            int userInputNum = userInputNumber(scanner, "please input your option from menu");
            switch (userInputNum) {
                case 1:
                    printAllNumber(myList);
                    quit = quitOption(scanner);
                    break;
                case 2:
                    printMaximumNumber(myList);
                    quit = quitOption(scanner);
                    break;
                case 3:
                    printMinimumNumber(myList);
                    quit = quitOption(scanner);
                    break;
                case 4:
                    int searchValueUserInPut = userInputNumber(scanner, "Please input your searched number");
                    searchNumber(myList, searchValueUserInPut);
                    quit = quitOption(scanner);
                    break;
                default:
                    System.out.println(" please input correct option in above menu");
            }

        } while (quit = false);

    }

    private static Boolean quitOption(Scanner scanner) {
        System.out.println( "do you want to quit the game please input true or false");
        return scanner.nextBoolean();

    }

    public static List<Integer> createAList(Scanner scanner) {
        int listSize = userInputNumber(scanner, "please input the length of list");
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            myList.add(new SecureRandom().nextInt(1000));
        }

        return myList;
    }

    private static int userInputNumber(Scanner scanner, String printedString) {
        System.out.println(printedString);
        return scanner.nextInt();
    }


    private static void printAllNumber(List<Integer> myList) {
        System.out.println(myList.toString());
    }

    private static void printMaximumNumber(List<Integer> myList) {
        int max = myList.get(0);
        for (int i : myList) {
            max = max < i ? i : max;
        }
        System.out.println("max value : " + max);
    }

    private static void printMinimumNumber(List<Integer> myList) {
        int min = myList.get(0);
        for (int i : myList) {
            min = min > i ? i : min;
        }
        System.out.println("min value : " + min);
    }

    private static void searchNumber(List<Integer> myList, int searchValue) {
// * Option 04: We allow user to input a number to search,
// if that number is existing in arraylist, we print the number and its index.
// * Otherwise, print that number is not in the list
        boolean isExist = false;
        for (int i : myList) {
            if (i == searchValue) {
                isExist = true;
                System.out.println("exist in array list with index" + myList.indexOf(i));
            }
        }

        if (isExist == false) {
            System.out.println("number is not in the list");
        }
    }
}



