package PlayerBehavior;

import java.util.ArrayList;

public class Warrior extends Classe {
    public Warrior() {
        super("Warrior", false, new ArrayList<Attack>(), new ArrayList<Magic>(), 0);
        this.attacks.add(new Sword("Sword", 10, 20));
        this.attacks.add(new Dagger("Dagger", 5, 10));
    }
}
