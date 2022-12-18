public class Main {
    public static void main(String[] args) {

        Player frank = new Player("frank");
        System.out.println("Initial health remaining " + frank.remainingHealth());

        Player tom = new Player("tom", 60, "Crossbow");
        System.out.println("Tom just took " + tom.loseHealth(20) + "% Damage" );
        System.out.println("Health remaining " + tom.remainingHealth());
        System.out.println("Tom's health has been restored by " + tom.restoreHealth(20) + "%");
        System.out.println("Health remaining " + tom.remainingHealth());
    }
}