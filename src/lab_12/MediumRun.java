package lab_12;

import java.security.SecureRandom;

public class MediumRun implements RunBehavior {

    @Override
    public int getSpeed() {
        int randomNumber = new SecureRandom().nextInt(75);
        return randomNumber;
    }
}
