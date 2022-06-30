package lab_12;

public class Animal {

    protected RunBehavior runBehavior;
    protected FlyBehavior flyBehavior;

    protected int performanceRun(){
        return runBehavior.getSpeed();
    }

    protected boolean performFly(){
        return flyBehavior.fly();
    }

    protected String getName() {
        return null;
    }

}
