package lesson2;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        //<18 |18-55 |>55
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input your age: ");
        int userAge = scanner.nextInt();

        if (userAge < 18) {
            System.out.println("Khong ban");
        } else if (userAge < 55) {
            System.out.println("unlimited");

        } else {
            System.out.println("ban 2 lan");
        }

    }
    //00:28
//    https://us02web.zoom.us/rec/share/s9-pit94dvX6ukQs8wtpTY75xSr0OPDB17ZfvaPgY7hY438D04sFOafyew5aVaPP.aZjC4pBRCjVWtji0
//    Passcode: jg?j%m0&

}

