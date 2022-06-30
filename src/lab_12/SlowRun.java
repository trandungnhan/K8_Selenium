package lab_12;

import java.security.SecureRandom;

public class SlowRun implements RunBehavior {

    @Override
    public int getSpeed() {
        int randomNumber = new SecureRandom().nextInt(50);
        return randomNumber;
    }
}
