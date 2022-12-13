public class Main {
    public static void main(String[] args) {

        Player player1 = new Player(20, 10);
        Monster monster = new Monster(10, 10);
        Goblin goblin = new Goblin(1, 10);

        System.out.println("Player health: " + player1.getHealth());
        goblin.attack(player1);
        System.out.println("Player health: " + player1.getHealth());
        System.out.println("Monster health: " + monster.getHealth());
        System.out.println("Goblin health: " + goblin.getHealth());
    }
}