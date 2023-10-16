package lab_07_02;

import java.util.List;

public class RacingController {
    public static Animal getWinner(List<Animal> ainmalList) {
        //TODO: what if animal list is null and empty.
        Animal winner = null;
        for(Animal animal: ainmalList) {
           if( animal.getSpeed() > winner.getSpeed()) {
                winner = animal;
            }

        }
        return  winner;
    }

}
