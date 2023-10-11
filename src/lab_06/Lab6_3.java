package lab_06;

import java.util.List;

public class Lab6_3 {
    public static void main(String[] args) {
        /**
         String myStr = "100 minutes";
         NOT using REGEX, extract digit character from that String
         Expected output: "100".
         EX: "12345nabc678" -> "12345678"
         */

        String myStr = "100 minutes";
        String outputStr  = "";
        char[] charArrays = myStr.toCharArray();
        for( char character : charArrays) {
            if (Character.isDigit(character)) {
                outputStr = outputStr + character;
            }
        }

        System.out.println("expected string is: " + outputStr);
    }
}
