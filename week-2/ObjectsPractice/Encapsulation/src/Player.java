public class Player {

    private String name;
    private int health;
    private String weapon;

    // Default constructor
    public Player(String name) {
        this(name, 100, "Sword");
    }

    public Player(String name, int health, String weapon) {
        if (health <= 0) {
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        this.name = name;
        this.weapon = weapon;
    }

    public int loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player is dead");
        }
        return damage;
    }

    public int remainingHealth() {
        return this.health;
    }

    public int restoreHealth(int extraHealth) {
        this.health += extraHealth;
        if (this.health > 100) {
            System.out.println("Player health restored to 100%");
            this.health = 100;
        }
        return extraHealth;
    }


}
