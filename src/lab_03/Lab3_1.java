package lab_03;

public class Lab3_1 {
    public static void main(String[] args) {
        /**
         * int[] intArr = {1, 2, 3, 4, 5};
         * Count how many odd, even number(s) in an integer array
         * duyet tung phan trong mang, chia het 2 thi cong 1, khong chia het thi thui
         */
        int[] intArr = {1, 2, 3, 4, 5};
        int oddCount = 0;
        int evenCount = 0; //so chan

        for (int i = 0; i < intArr.length; i++) {
            if ((intArr[i] % 2) == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }

        System.out.printf("Even number: %d \n", evenCount);
        System.out.printf("Odd number: %d \n", oddCount);

    }
}
