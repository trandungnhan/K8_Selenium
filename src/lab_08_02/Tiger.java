package lab_08_02;

import java.security.SecureRandom;

public class Tiger extends Animal {

    @Override
    public int getSpeed() {
        int randomNumber = new SecureRandom().nextInt(100);
        return randomNumber;
    }

    @Override
    public String getName() {
        return "Tiger";
    }
}
