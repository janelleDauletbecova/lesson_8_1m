//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package kg.geeks.game.players;

import java.io.PrintStream;

public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BLOCK_DAMAGE_AND_REVERT);
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }

    public int getBlockedDamage() {
        return this.blockedDamage;
    }

    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth() - this.blockedDamage);
        PrintStream var10000 = System.out;
        String var10001 = this.getName();
        var10000.println("Berserk " + var10001 + " reverted " + this.blockedDamage + " damages to boss.");
    }
}
