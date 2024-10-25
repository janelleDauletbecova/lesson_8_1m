//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package kg.geeks.game.players;

import java.io.PrintStream;
import kg.geeks.game.general.RPG_Game;

public class Warrior extends kg.geeks.game.players.Hero {
    public Warrior(String name, int health, int damage) {
        super(name, health, damage, kg.geeks.game.players.SuperAbility.CRITICAL_DAMAGE);
    }

    public void applySuperPower(kg.geeks.game.players.Boss boss, kg.geeks.game.players.Hero[] heroes) {
        int coef = RPG_Game.random.nextInt(4) + 2;
        boss.setHealth(boss.getHealth() - this.getDamage() * coef);
        PrintStream var10000 = System.out;
        String var10001 = this.getName();
        var10000.println("Warrior " + var10001 + " hits critically " + this.getDamage() * coef + " damages to boss.");
    }
}
