package lesson5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        //declaration: AVOID no data type
        List myList = new ArrayList(); //khong chi dinh loai du lieu.

        //CRUD: create- read- update - delete
        List<Integer> myIntList = new ArrayList<>(); //dyamond type.
        List<Integer> myIntList2 = new ArrayList(Arrays.asList(1, 2, 3));

        myIntList2.add(7);
        myIntList2.size();
        myIntList2.isEmpty();

        //READ
        for (int value : myIntList2) {
            //care about value only, thi no van tu chuyen doi  value
        }

        for (int i = 0; i < myIntList2.size(); i++) {
            System.out.println(myIntList2.get(i));
        }

        // CONTAIN: RETURN TRUE FALSE

        System.out.println((myIntList2.contains(5)));
        //index of: khong ton tai trong mang  -1
        // index of != -1 thi phan tu co ton tai trong mang
        System.out.println((myIntList2.indexOf(5)));

        //REMOVE ;
        myIntList2.remove(5); // remove theo index
        myIntList2.remove(Integer.valueOf(5));


    }
}
