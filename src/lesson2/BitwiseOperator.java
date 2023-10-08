package lesson2;

public class BitwiseOperator {
    public static void main(String[] args) {
        // check coi co thuc thi hay khong thi  calling...
        // hien chi su dung 1 dau &
        /**
         *
         * if false and true -> result: false
         *
         */
        if (getFirstNumber() != 0 & getSecondNumber() != 0) {
            System.out.println("calling...");
        }

        /**
         *
         * if false and true -> result: true
         * di evaluable 2 ben , bat chap ket qua ra sao.
         *
         */
        if (getFirstNumber() != 0 | getSecondNumber() != 0) {
            System.out.println("calling...");
        }


        /***
         *  &&: truong hop 2 dau va neu phat hien ben trai sai roi thi khong chay them ve ben phai
         *  nen voi 2 dau && su dung de han che NPE
         */
//        if (getFirstNumber() != null && getSecondNumber() != 0) {
//            System.out.println("calling...");
//        }

        /**
         *
         * if false and true -> result: true
         * di evaluable ben trai true roai thi khong tinh toan ve tiep theo.
         *
         */
        if (getFirstNumber() != 0 || getSecondNumber() != 0) {
            System.out.println("calling...");
        }
    }


    private static int getFirstNumber() {
        System.out.println("calling get first number");
        return 0;
    }

    private static int getSecondNumber() {
        System.out.println("calling get second number");
        return 2;
    }
}
