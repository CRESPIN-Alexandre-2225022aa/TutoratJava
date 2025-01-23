package PlayerBehavior;

public abstract class Attack {
    public String name;
    public int damegeMin;
    public int damegeMax;

    public Attack(String name, int damegeMin, int damegeMax) {
        this.name = name;
        this.damegeMin = damegeMin;
        this.damegeMax = damegeMax;
    }

    public int attack() {
        return (int) (Math.random() * (damegeMax - damegeMin + 1) + damegeMin);
    }
}
