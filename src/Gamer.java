import java.util.Random;

public class Gamer {
	
	private String name;
	private int health;
	private int strength;
	private int attack;
	
	public Gamer(String name, int health, int strength, int attack) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.attack = attack;
	}
	
	 public String getName() {
	        return name;
	    }

	    public int getHealth() {
	        return health;
	    }

	    public void setHealth(int health) {
	        this.health = health;
	    }

	    public int getStrength() {
	        return strength;
	    }

	    public int getAttack() {
	        return attack;
	    }

	    public boolean isAlive() {
	        return health > 0;
	    }

	    public int rollDie() {
	        Random random = new Random();
	        return random.nextInt(6) + 1; 
	    }

	    public int calculateAttackDamage(int dieRoll) {
	        return attack * dieRoll;
	    }

	    public int calculateDefenseStrength(int dieRoll) {
	        return strength * dieRoll;
	    }

	    public void takeDamage(int damage) {
	        health -= damage;
	        if (health < 0) {
	            health = 0;
	        }
	    }
}
