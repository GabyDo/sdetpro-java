package lab_02;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        /***
         * Get input from user about height(m) and weight(kg) then calculate BMI
         *
         * Underweight = <18.5
         * Normal weight = 18.5 – 24.9
         * Overweight = 25–29.9
         * Obesity = BMI of 30 or greater
         * BMI = weight / (height x 2)
         *
         * user input heigh, weight
         * calculate bmi
         * if, else
         */

        Scanner scanner = new Scanner(System.in);
        System.out.printf("input your weigh in kg : ");
        float weight = scanner.nextFloat();
        System.out.printf("input your height in m: ");
        float height = scanner.nextFloat();

        float bmi = weight / (height * 2);
        System.out.printf("your bmi: %f \n", bmi);

        String status;
        if (bmi <= 18.5) {
            status = "Underweight";
        } else {
            if (bmi <= 24.9) {
                status = "normal weight";
            } else {
                if (bmi <= 29.9) {
                    status = "overweight";
                } else {
                    status = "obesity";
                }
            }
        }

        System.out.printf("your status %s", status);

    }
}
