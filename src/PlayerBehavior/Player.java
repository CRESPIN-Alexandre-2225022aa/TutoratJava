package PlayerBehavior;

public class Player implements PlayerBehavior {
    public String name;
    public int health;
    public int mana;
    public Classe classe;

    public Player(String name, int health, Classe classe) {
        this.name = name;
        this.health = health;
        this.classe = classe;
        this.mana = this.classe.manaMax;
    }

    public void attack(int choosenAttack) {
        System.out.println(this.classe.attacks.get(choosenAttack).attack() + " avec " + this.classe.attacks.get(choosenAttack).name);
    }

    public void castSpell(int choosenSpell) {
        System.out.println(this.classe.spells.get(choosenSpell).castSpell() + " avec " + this.classe.spells.get(choosenSpell).name);
    }

    public void block(int ammount) {
        System.out.println("Player " + name + " has blocked " + ammount + " damage!");
    }
}
