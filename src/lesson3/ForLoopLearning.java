package lesson3;

public class ForLoopLearning {
    //use for khi so lan lap la co dinh

    /**
     * for (init value; conditional; conditional change trigger)
     * excute some thing if the condition is true
     * init value: only one time at begining
     * condition: before the code block body
     * conditional change trigger: after the body excute
     * xem xet theo vong dong ho
     */
    //out put: 1,2,3,4
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // reuse i for other purpose exept for circle.
        int k =0 ;
        for (; k < 5; k++) {
            System.out.println(k);
        }
        System.out.printf( "i =%d\n", k);

        // output: 0, 2, 4
        for (int i = 0; i < 5; i++) {
            System.out.println(i ++);
        }

        //output: chay hoai infinitive loop
        for (int j = 0; j < 5; ) {
            System.out.println(j ++);
        }
        // infiniti , coi nhu true, luon luon chay
        for (; ; ) {
            System.out.println();
        }


    }
}
