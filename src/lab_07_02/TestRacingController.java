package lab_07_02;

import java.util.List;

public class TestRacingController {
    public static void main(String[] args) {
        List<Animal> animalList = List.of(new Horse(), new Tiger(), new Dog());

        Animal winner = RacingController.getWinner(animalList);
        System.out.printf("winner is: %s, with speed: %d ", winner.getName(), winner.getSpeed());
    }
}


