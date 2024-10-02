package lotr;
import java.util.Random;

import lombok.Getter;
import lombok.Setter;
import lotr.Character;


@Getter @Setter
public class King extends Character {
    public King() {
        super(GenerateVal(), GenerateVal());
    }
    @Override
    public void kick(Character c) {
        Random random = new Random();
        // int randomNumber = random.nextInt(this.getPower()+1);
        c.setPower(c.getPower() - GenerateVal());
    }

    public static int GenerateVal() {
        Random random = new Random();
        return random.nextInt(11) + 5;
    }


}
