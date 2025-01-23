package PlayerBehavior;

public abstract class Magic {
    public String name;
    public int manaCost;
    public int damageMin;
    public int damageMax;

    public Magic(String name, int manaCost, int damageMin, int damageMax) {
        this.name = name;
        this.manaCost = manaCost;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
    }

    public int castSpell() {
        return (int) (Math.random() * (damageMax - damageMin + 1) + damageMin);
    }
}
