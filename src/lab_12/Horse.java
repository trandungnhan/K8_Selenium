package lab_12;

public class Horse extends Animal {

    public Horse() {

        runBehavior = new MediumRun();
        flyBehavior = new WithoutWings();
    }

    @Override
    public String getName() {
        return "Horse";
    }
}
