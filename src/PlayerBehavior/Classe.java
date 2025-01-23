package PlayerBehavior;

import java.util.ArrayList;

public abstract class Classe {
    public String name;
    public boolean asMagic;
    public ArrayList<Attack> attacks;
    public ArrayList<Magic> spells;
    public int manaMax;

    public Classe(String name, boolean asMagic, ArrayList<Attack> attacks, ArrayList<Magic> spells, int manaMax) {
        this.name = name;
        this.asMagic = asMagic;
        this.manaMax = manaMax;
        this.attacks = attacks;
        this.spells = spells;
    }
}
