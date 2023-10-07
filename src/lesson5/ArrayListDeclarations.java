package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDeclarations {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList(Arrays.asList(1, 2, 3,4,5));
        //KHONG DUOC NHU SAU
        //ArrayList<Integer> myList2 = Arrays.asList(1, 2, 3,4,5);
        myList.add(6);
        myList.set(0,10);
        //unsupport method

        for(int value : myList) {

        }



    }

}
