package lab_08_02;

public class Animal {

    public int speed;
    public String name;

    public Animal() {
    }

    public Animal(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
}
