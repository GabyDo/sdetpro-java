package lab_07_02;

import java.security.SecureRandom;

public class Horse extends Animal {

    public Horse() {
        final int MAX_SPEED = 60;
        this.setSpeed(new SecureRandom().nextInt(MAX_SPEED));
        this.setName("Horse");

    }

//    @Override
//    public int getSpeed() { // xu ly noi tai, khong thay doi gia tri.
//        return 60;
//    }


}
