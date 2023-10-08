package lesson2;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        //<18 |18-55 |>55 |
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input your age: ");
        int userAge = scanner.nextInt();

        if (userAge < 18) {
            System.out.println("Khong ban");
        } else if (userAge < 55) {
            System.out.println("Khong ban");
        } else {
            System.out.println("ban 2 lan");
        }

        // best practice: tối đa vòng lặp tới nested if else tới cấp thư 3.
//    if (userAge < 18) {
//        if( userAge <12) {
//            System.out.println("abc");
//        } else {
//
//        }
//    }
        final int MINIMUM_AGE = 18; //khong muon thay doi gia tri. Tai thoi diem complie se bi loi.
        if (userAge < MINIMUM_AGE) {
            System.out.println("Khong ban");
            if (userAge <= 12) {
                System.out.println("calling 119");
            }
        } else if (userAge < 55) {
            System.out.println("Khong ban");
        } else {
            System.out.println("ban 2 lan");
        }
    }
}

