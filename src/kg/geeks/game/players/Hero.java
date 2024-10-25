//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package kg.geeks.game.players;


public abstract class Hero extends kg.geeks.game.players.GameEntity implements kg.geeks.game.players.HavingSuperAbility {
    private SuperAbility ability;

    public Hero(String name, int health, int damage, SuperAbility ability) {
        super(name, health, damage);
        this.ability = ability;
    }

    public SuperAbility getAbility() {
        return this.ability;
    }

    public void attack(kg.geeks.game.players.Boss boss) {
        boss.setHealth(boss.getHealth() - this.getDamage());
    }
}
