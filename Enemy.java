package singleton;

// immutable class
public class Enemy {
	
	private String name;
	private int health, damage;
	
	public Enemy(String name, int health, int damage) {
		this.name = name;
		this.health = (health <= 0) ? 100 : health;
		this.damage = (damage <= 0) ? 10 : damage;
	}
	
	public void takeDamage() {
		health -= damage;
		System.out.println(name + " has taken damage. Current health = " + health);
	}
	
	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getDamage() {
		return damage;
	}
	
}
