package lesson4;

import java.util.Scanner;

public class SwitchCaseWithoutBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a number: ");
        int userInputNum = scanner.nextInt();
        switch (userInputNum) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("weekdays");
                break;
            case 7:
            case 8:
                System.out.println("weekends");
                break;
            default:
                System.out.println("wrong input");
        }
    }
}
