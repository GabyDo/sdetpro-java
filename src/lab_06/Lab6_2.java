package lab_06;

import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        /**
         * String myPassword = "password123";
         * Allow user to input maximum 3 times
         * cho user nhap mat khau
         * kiem tra matkhau dung out
         * neu mat khau sai
         * nhap 3 lan
         */
        String pwdStr = "password123";

        final int MAX_TIME = 3;
        int inputTime = 1;
        String userInputPwd;

        do {
            userInputPwd = userInputPassword();
            if (userInputPwd.equals(pwdStr)) {
                System.out.println(" login successfully");
                break;
            } else {
                System.out.println("wrong password");
                inputTime++;
            }
        } while (inputTime <= MAX_TIME);

        if(inputTime ==3) {
            System.out.println(" attemp 3 times only");
        }
    }

    private static String userInputPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your pwd");
        return  scanner.next();
    }
}
