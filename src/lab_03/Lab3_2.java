package lab_03;

public class Lab3_2 {
    public static void main(String[] args) {
        /***
         * Finding maximum value/minimum value from an integer array
         * int[] intArr = {1, 2, 3, 4, 5};
         * Minimum: 1
         * Maximum: 5
         *
         * duyet trong mang, coi so nao lon nhat, so nho nhat
         *
         */

        int[] intArr = {1, 2, 3, 4, 5};
        int intMax = intArr[0];
        int intMin = intArr[0];

        for (int i: intArr) {
            if (intMax < i) {
                intMax = i;
            }
            if (intMin > i) {
                intMin = i;
            }
        }

        System.out.println("mininum : " + intMin);
        System.out.println("maximun: " + intMax);
    }
}
