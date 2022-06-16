package lab_09;

import java.security.SecureRandom;

public class Animal {

    private String name = "Tiger";
    private int speed = 0;
    private boolean isWithWings = true;

    protected Animal(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.isWithWings = builder.isWithWings;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWithWings() {
        return isWithWings;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speech=" + speed +
                ", isWithWings=" + isWithWings +
                '}';
    }

    // Inner class
    public static class Builder {
        private String name = "Tiger";
        private int speed = 0;
        private boolean isWithWings = false;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int maxSpeed) {
            this.speed = new SecureRandom().nextInt(maxSpeed);
            return this;
        }

        public Builder setWithWings(boolean isWithWings) {
            this.isWithWings = isWithWings;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
