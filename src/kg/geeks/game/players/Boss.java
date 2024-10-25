//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Boss extends GameEntity {
    private static final String name = "Ni" ;
    private SuperAbility defence;
    private Object RPG_Game;

    public Boss(int health) {
        super(name, health, damage);
    }

    public void attack(Hero[] heroes) {
        Hero[] var2 = heroes;
        int var3 = heroes.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Hero hero = var2[var4];
            if (hero.getHealth() > 0) {
                if (hero instanceof kg.geeks.game.players.Berserk && this.defence != SuperAbility.BLOCK_DAMAGE_AND_REVERT) {
                    int blocked = (RPG_Game.random.nextInt(2) + 1) * 5;
                    ((kg.geeks.game.players.Berserk)hero).setBlockedDamage(blocked);
                    hero.setHealth(hero.getHealth() - (this.getDamage() - blocked));
                } else {
                    hero.setHealth(hero.getHealth() - this.getDamage());
                }
            }
        }

    }

    public void chooseDefence() {
        SuperAbility[] variants = SuperAbility.values();
        
        int randomIndex = RPG_Game.random.nextInt(variants.length);
        this.defence = variants[randomIndex];
    }

    public SuperAbility getDefence() {
        return this.defence;
    }

    public String toString() {
        String var10000 = super.toString();
        return "BOSS " + var10000 + " defence: " + String.valueOf(this.defence);
    }
}
