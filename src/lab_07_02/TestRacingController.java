package lab_07_02;

import java.util.List;

public class TestRacingController {
    public static void main(String[] args) {
        List<Animal> animalList = List.of(new Horse(), new Tiger());

        Animal winner = RacingController.getWinner(animalList);
        System.out.println("winner is" +  winner.getName());
    }
}


