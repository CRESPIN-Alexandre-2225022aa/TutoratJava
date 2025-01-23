package PlayerBehavior;

import java.util.ArrayList;

public class Magicien extends Classe {
    public Magicien() {
        super("Magicien", true, new ArrayList<Attack>(), new ArrayList<Magic>(), 100);
        this.attacks.add(new Dagger("Dagger", 5, 10));
        this.spells.add(new Fireball("Fireball", 10, 20, 30));
    }
}
