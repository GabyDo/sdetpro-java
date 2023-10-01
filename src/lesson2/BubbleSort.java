package lesson2;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        /**
         * 1.Explain the solution without coding
         * 2.Express related character of the solution
         * 3.Psedu code
         * 4.real code > running > edge case
         * loop over the array from 2-> len-1: unsorted index
         * loop over the iner array from 0-> unsorted Index
         */
        int[] intArr = {12, 34, 1, 16, 28};
        int length = intArr.length;

        //n
        for (int unsortedIndex = length -1; unsortedIndex > 0; unsortedIndex--) {
            //n-1
            for (int i = length; i < unsortedIndex; i++) {


            }
        }
        System.out.println(Arrays.toString(intArr));
        //bigO, algorithm.
        //O(n^2)
        // 1 vong lap di n lan
    }
}
