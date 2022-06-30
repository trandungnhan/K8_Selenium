package lab_12;

public class Tiger extends Animal {

    public Tiger() {

        runBehavior = new FastRun();
        flyBehavior = new WithoutWings();
    }

    @Override
    public String getName() {
        return "Tiger";
    }
}
