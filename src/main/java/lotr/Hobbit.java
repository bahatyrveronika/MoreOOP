package lotr;
import lombok.Getter;
import lombok.Setter;
import lotr.Character;
@Getter @Setter
public class Hobbit extends Character{
    public Hobbit() {
        super(3, 0);
    }
    @Override
    public void kick(Character c) {
        toCry();
    }
    public void toCry() {
        System.out.println("Hobbit is crying!");
    }
}
