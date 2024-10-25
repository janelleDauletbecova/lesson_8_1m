package kg.geeks.game.players;

class Boss {
    private int health;

    public Boss(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Босс получил урон: " + damage);
    }

    public int getHealth() {
        return health;
    }
}

class Hero {
    protected String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attack(Boss boss) {
        System.out.println(name + " атакует босса!");
    }
}

class Spitfire extends Hero {
    private static final int EXTRA_DAMAGE = 80;

    public Spitfire(String name) {
        super(name);
    }

    public void showAggression(Boss boss) {
        System.out.println(name + " проявляет агрессию!");
        boss.takeDamage(EXTRA_DAMAGE);
    }
}


