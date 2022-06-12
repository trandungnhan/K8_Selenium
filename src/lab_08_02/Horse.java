package lab_08_02;

import java.security.SecureRandom;

public class Horse extends Animal{

    @Override
    public int getSpeed() {
        int randomNumber = new SecureRandom().nextInt(75);
        return randomNumber;
    }

    @Override
    public String getName() {
        return "Horse";
    }
}
