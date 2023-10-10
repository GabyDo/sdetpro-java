package lesson3;

public class ArrayLearning {
    public static void main(String[] args) {
        // mang la tap hop phan tu du lieu giong nhau
        //CRUD
        /**
         * datatype [] arrayName // int[]myNums;
         * datatype arrayName[] // int myNums[]
         */
        int a;
        a = 3;

        // tui dung 1 so nguyen
        int [] myIntArray = new int[5]; // dat 5 cho
        int l =  myIntArray.length; //length khong co ngoac nhon

        for (int index = 0; index < myIntArray.length; index++) {
            System.out.println(myIntArray[index]);

        }

        // khai bao luon
        int [] myIntArray2 = new int[]{1,2,3,4,5};
        int [] myIntArray3 = new int[]{1,2,3,4,'a'}; // a  ma ascii la 97

        //output = ... exception array index out about exception
        for (int index = 0; index <= myIntArray.length; index++) { // co dau = de gay exception
            System.out.println(myIntArray[index]);
        }

        // enhanced for - di qua gate :
        for (int num: myIntArray) {
            System.out.println(num);
        }

        // lay phan tu cuoi cung cua mang
        System.out.println(myIntArray[l-1]);
        // lay phan tu dau tien cua mang
        System.out.println(myIntArray[0]);
    }
}
