package lesson2;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class TenerryOperater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input arrival time: ");
        int inputArrivalTime = scanner.nextInt();

        boolean isHeOnTime = (inputArrivalTime == 7)? true :false;
    }
}
