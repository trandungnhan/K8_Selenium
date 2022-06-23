package lab_10;
/*
SIMPLE! Do the LAB 8.2 again with abstraction! (speed method should be abstract method)
* */

public abstract class Animal {

    public int speed;
    public String name;

    public Animal() {
    }

    public Animal(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public abstract int getSpeed();

    public abstract String getName();

}
