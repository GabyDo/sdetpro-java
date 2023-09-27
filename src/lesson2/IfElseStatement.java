package lesson2;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        // lang nghe tin hieu tu ban phim chuan
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter arrival time:");
        int inputArrivalTime = scanner.nextInt();

        //comparison operator ==,!=, >=, <=
        boolean isHeOnTime = (inputArrivalTime == 7); // so sanh inputArrivalTime = 7 hay khong?
        if (isHeOnTime) {
            System.out.println("Let's talk");
        } else {
            System.out.println("Write a letter");
        }
    }
}
