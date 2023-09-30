package lab_03;

public class Lab3_3 {
    public static void main(String[] args) {
        /***
         * Sort an integer array from min to max
         * Input: {12, 34, 1, 16, 28}
         * Expected output: {1, 12, 16, 28, 34}
         *
         * input 1 mang
         * duyet tung phan tu, so sanh voi phan tu truoc no
         * neu nho hon, duyet lai tu no toi dau mang
         * doi cho cho nhau*
         */

        int[] intArr = {12, 34, 1, 16, 28};
        int temp = 0;

        for (int i = 1; i < intArr.length; i++) {

            if(intArr[i] < intArr[i -1]) {
                for (int j = i; j >= 1 ; j--) {
                    if (intArr [j] < intArr [j-1]) {
                        temp = intArr[j - 1];
                        intArr[j - 1] = intArr[j];
                        intArr[j] = temp;
                    }
                }
            }

        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

    }
}


