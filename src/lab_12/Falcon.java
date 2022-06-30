package lab_12;

public class Falcon extends Animal{

    public Falcon() {
        flyBehavior = new WithWings();
    }

    @Override
    public String getName() {
        return "Falcon";
    }
}
