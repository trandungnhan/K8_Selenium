package lab_12;

import java.util.Arrays;
import java.util.List;

public class TestAnimal {

    void findAnimalWinner(List<lab_12.Animal> AnimalList){

        int maxSpeed = AnimalList.get(0).performanceRun();
        String winnerAnimal = AnimalList.get(0).getName();
        for (lab_12.Animal animal : AnimalList) {
            if (animal.performFly()) {
                System.out.printf("%s cannot run because it has wings\n", animal.getName());
            } else if (animal.performanceRun() > maxSpeed) {
                maxSpeed = animal.performanceRun();
                winnerAnimal = animal.getName();
            }
        }
        System.out.println("Winner animal is " + winnerAnimal);
        System.out.printf("Maximum speed is %d Km/h", maxSpeed);
    }

    public static void main(String[] args) {

        new TestAnimal().findAnimalWinner(Arrays.asList(new lab_12.Tiger(),new lab_12.Horse(),new lab_12.Dog(),new Eagle(),new Falcon()));

    }
}
