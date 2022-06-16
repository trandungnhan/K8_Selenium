package lab_09;

import java.util.Arrays;
import java.util.List;

public class TestBuilder {

    public static void main(String[] args) {

        Animal.Builder builder = new Animal.Builder();
        Animal tiger = builder.setName("Tiger").setSpeed(100).setWithWings(false).build();
        Animal falcon = builder.setName("Falcon").setSpeed(200).setWithWings(true).build();
        Animal eagle = builder.setName("Eagle").setSpeed(300).setWithWings(true).build();
        Animal snake = builder.setName("Snake").setSpeed(50).setWithWings(false).build();
        Animal dog = builder.setName("Dog").setSpeed(60).setWithWings(false).build();
        Animal horse = builder.setName("Horse").setSpeed(75).setWithWings(false).build();

        System.out.println(tiger.toString());
        System.out.println(falcon.toString());
        System.out.println(eagle.toString());
        System.out.println(snake.toString());
        System.out.println(dog.toString());
        System.out.println(horse.toString());

        new TestBuilder().findAnimalWinner(Arrays.asList(tiger, falcon, eagle, snake, horse, dog));

    }

    public void findAnimalWinner(List<Animal> AnimalList) {

        int maxSpeed = AnimalList.get(0).getSpeed();
        String winnerAnimal = AnimalList.get(0).getName();
        for (Animal animal : AnimalList) {
            if (animal.isWithWings()) {
                System.out.printf("%s cannot run because it has wings\n", animal.getName());
            } else if (animal.getSpeed() > maxSpeed) {
                maxSpeed = animal.getSpeed();
                winnerAnimal = animal.getName();
            }
        }
        System.out.println("Winner animal is " + winnerAnimal);
        System.out.printf("Maximum speed is %d Km/h", maxSpeed);
    }

}
