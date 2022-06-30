package lab_12;

import java.security.SecureRandom;

public class FastRun implements RunBehavior {

    @Override
    public int getSpeed() {
        int randomNumber = new SecureRandom().nextInt(100);
        return randomNumber;
    }
}
