package lab_07_02;

import java.security.SecureRandom;

public class Dog extends Animal{
    public Dog() {
        final int MAX_SPEED = 10;
        this.setSpeed(new SecureRandom().nextInt(MAX_SPEED));
        this.setName("Dog");
    }
}
