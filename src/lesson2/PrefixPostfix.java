package lesson2;

public class PrefixPostfix {
    // prefix ->right operator -> assign result into left operator -> post prefix
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        int c = ++a + b++;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);

        /**
         * c= 3
         * a= 2; prefix truoc, sau do thuc hien toan tu, gan qua ben trai
         * b= 2
         */

    }
}
