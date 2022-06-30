package lab_12;

public class Dog extends Animal {

    public Dog() {

        runBehavior = new SlowRun();
        flyBehavior = new WithoutWings();
    }

    @Override
    public String getName() {
        return "Dog";
    }
}
