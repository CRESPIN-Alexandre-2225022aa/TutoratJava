import PlayerBehavior.*;

public class Main {
    public static void main(String[] args) {
        // Créer un joueur de type Warrior
        Player warrior = new Player("WarriorPlayer", 100, new Warrior());
        // Créer un joueur de type Magicien
        Player magicien = new Player("MagicienPlayer", 80, new Magicien());

        // Faire attaquer le Warrior avec sa première attaque
        System.out.print("Warrior attaque avec ");
        warrior.attack(0);

        // Faire attaquer le Magicien avec sa première attaque
        System.out.print("Magicien attaque avec ");
        magicien.castSpell(0);
    }
}