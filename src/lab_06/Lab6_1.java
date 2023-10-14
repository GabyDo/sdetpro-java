package lab_06;

public class Lab6_1 {
    public static void main(String[] args) {
        /**
         *
         Given input string: "2hrs and 5 minutes"
         Please calculate how many minutes in total
         tinh ra so gio : 2
         chia ra gio va hut
         tinh ra so phut: 5
         */

        String inputString = "2hrs and 5 minutes";
        String[] hourAndMinutes = inputString.split("and");
        String hourString = hourAndMinutes[0].replaceAll("[^0-9]","");
        String minuteString = hourAndMinutes[1].replaceAll("[^0-9]", "");

        int hour = Integer.parseInt(hourString);
        int minute = Integer.parseInt(minuteString);

        int totalMinutes = hour*60 + minute;
        System.out.println("total minutes is " + totalMinutes);
    }
}
