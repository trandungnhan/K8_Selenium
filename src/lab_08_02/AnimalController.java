package lab_08_02;

import java.util.Arrays;
import java.util.List;

public class AnimalController {

    public static void main(String[] args) {

        Animal tiger = new Tiger();
        Animal horse = new Horse();
        Animal dog = new Dog();

        new AnimalController().findAnimalWinner(Arrays.asList(tiger,horse,dog));

    }

    public void findAnimalWinner(List<Animal> AnimalList){

        int maxSpeed = AnimalList.get(0).getSpeed();
        String winnerAnimal = AnimalList.get(0).getName();
        for (Animal animal : AnimalList) {
                if (animal.getSpeed() > maxSpeed) {
                    maxSpeed = animal.getSpeed();
                    winnerAnimal = animal.getName();
                }
        }
        System.out.println("Winner animal is " + winnerAnimal);
        System.out.printf("Maximum speed is %d Km/h", maxSpeed);
    }

}
