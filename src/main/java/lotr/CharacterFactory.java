package lotr;
import java.util.Random;

import lotr.Character;
public class CharacterFactory {
    public Character createCharacter() {
        Random random = new Random();
        int typech = random.nextInt(4);
        if (typech == 0){
            return new Elf();
        } else if (typech == 1){
            return new Hobbit();
        } else if (typech == 2){
            return new King();
        } else {
            return new Knight();
        }
    }
}
