package lesson4;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a number: ");
        int userInputNum = scanner.nextInt();

        switch (userInputNum) {
            case 1:
                System.out.println("giai nhat");
                break;
            case 2:
                System.out.println("giai nhi");
                break;
            case 3:
                System.out.println("giai ba");
                break;
            default:
                System.out.println(" cam on ban da tham gia chuong trinh");
        }
    }
}
