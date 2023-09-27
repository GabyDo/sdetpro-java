package lesson1;

public class OperatorLearning {
    //default value
    static int intDefault; // by default value is 0;

    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        //right operator myNum1 + myNum2;
        int total = myNum1 + myNum2;

        //tinh toan trong ngoac truoc rooi moi in ra
        System.out.println("\tTotal" + total);
        System.out.printf("\tTotal is %d\n", total);

        int multiple = 3 * 2;

        //7:3 = 2 du 1
        int phanNguyen = 7/3;
        int phanDu = (7%3);

    }
}
