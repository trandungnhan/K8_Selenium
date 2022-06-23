package lab_10;

import java.security.SecureRandom;

public class Dog extends Animal {

    @Override
    public int getSpeed() {
        int randomNumber = new SecureRandom().nextInt(60);
        return randomNumber;
    }

    @Override
    public String getName() {
        return "Dog";
    }
}
