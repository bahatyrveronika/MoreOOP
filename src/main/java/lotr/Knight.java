package lotr;
import java.util.Random;

import lotr.Character;

public class Knight extends Character{
    public Knight(){
        super(GenerateVal(), GenerateVal());
    }
    @Override
    public void kick(Character c){
        Random random = new Random();
        // int randomNumber = random.nextInt(this.getPower()+1);
        c.setPower(c.getPower() - GenerateVal());
    }
    public static int GenerateVal() {
        Random random = new Random();
        return random.nextInt(11) + 2;
    }
}
