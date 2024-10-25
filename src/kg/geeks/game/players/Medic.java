//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package kg.geeks.game.players;

public class Medic extends kg.geeks.game.players.Hero {
    private int healPoints;

    public Medic(String name, int health, int damage, int healPoints) {
        super(name, health, damage, SuperAbility.HEAL);
        this.healPoints = healPoints;
    }

    public void applySuperPower(kg.geeks.game.players.Boss boss, kg.geeks.game.players.Hero[] heroes) {
        kg.geeks.game.players.Hero[] var3 = heroes;
        int var4 = heroes.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            kg.geeks.game.players.Hero hero = var3[var5];
            if (hero.getHealth() > 0 && this != hero) {
                hero.setHealth(hero.getHealth() + this.healPoints);
            }
        }

    }
}
