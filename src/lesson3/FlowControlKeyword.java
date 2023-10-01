package lesson3;

public class FlowControlKeyword {
    public static void main(String[] args) {
        int[] myArr = {1,2,3,4,5};

//        for(int value: myArr) {
//            if (value ==3) {
//                break;
//            } else {
//
//            }
//        }

        for(int value: myArr) {
            if (value ==3) {
                continue; // gap con so 3 thi khong in ra dong phia duoi, chay luon gia tri value++
            }
            System.out.println(value);
        }


        /**
         * cho 1 mang khong rong
         * in ra phan tu chan dau tien cua mang
         */
        int[] myArr2 = {1,1,3,1,5};
//        for (int i = 0; i < myArr2.length; i++) {
//            if (myArr2[i] %2 == 0) {
//                System.out.println("so chan dau tien " + myArr2[i]);
//                break;
//            } else {
//            if ( i == myArr2.length -1) {
//                System.out.println("mang khong co so chan");
//            }
//            }
//        }

        boolean hasNoEvenNumber = false;
        for (int i = 0; i < myArr2.length; i++) {

            if (myArr2[i] %2 == 0) {
                hasNoEvenNumber =  true;
                System.out.println("so chan dau tien " + myArr2[i]);
                break;
            }
        }

        //dao nguoc lai gia tri vat ly cua no
        //!true = false
        if(!hasNoEvenNumber) {
            System.out.println("mang khong co so chan");
        }
    }
}
