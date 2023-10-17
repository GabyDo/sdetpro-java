package lab_07_02;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger() {
        final int MAX_SPEED = 70;
        this.setSpeed(new SecureRandom().nextInt(MAX_SPEED));
        this.setName("Tiger");
    }
}
