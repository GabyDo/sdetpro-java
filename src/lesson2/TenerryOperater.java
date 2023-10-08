package lesson2;

import java.util.Scanner;

public class TenerryOperater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input arrival time: ");
        int inputArrivalTime = scanner.nextInt();

        //comparison operator: == , !=, >, <, >==, <==
        //input arrival time = 7 hay khong, true cong khong thi false
        boolean isHeOnTime = (inputArrivalTime == 7) ? true : false;

        // co the them dieu kien  ben trong ngoặc tron
        // boolean isHeOnTime = (inputArrivalTime == 7)? true :( 2==2 ? true: false));

    }
}
