package kg.geeks.game.players;
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(500); // Здоровье босса
        Spitfire spitfire = new Spitfire("Spitfire");

        // Имитация убийства героя
        spitfire.attack(boss);
        spitfire.showAggression(boss); // Вызываем супер способность

        System.out.println("Здоровье босса после атаки: " + boss.getHealth());
    }
}
