package lab_12;

public class Eagle extends Animal {

    public Eagle() {
        flyBehavior = new WithWings();
    }
    @Override
    public String getName() {
        return "Eagle";
    }
}
