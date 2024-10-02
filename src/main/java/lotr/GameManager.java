package lotr;
import lotr.Character;

public class GameManager {
    public void fight(Character c1, Character c2){
        System.out.println("Починається бій між " + c1 + " та " + c2);
        while (c1.isAlive() && c2.isAlive()){
            System.err.println(c1 + " атакує " + c2);
            c1.kick(c2);
            if (!c2.isAlive()){
                System.out.println(c2 + " помер в цьому бою");
                break;
            } else {
                System.out.println(c2 + " продовжує битву з такою кількістю здоровʼя " + c2.getHp());
            }
            System.err.println(c2 + " атакує " + c1);
            c2.kick(c1);
            if (!c1.isAlive()){
                System.out.println(c1 + " помер в цьому бою");
                break;
            } else {
                System.out.println(c1 + " продовжує битву з такою кількістю здоровʼя " + c1.getHp());
            }
        }
        if (c1.isAlive()){
            System.out.println(c1+"переміг в цій битві");
        } else {
            System.out.println(c2+"переміг в цій битві");
        }
    }
    public static void main(String[] args) {
        Character elf = new Elf();
        Character hobbit = new Hobbit();
        GameManager gameManager = new GameManager();
        gameManager.fight(hobbit, elf);
    }
}
