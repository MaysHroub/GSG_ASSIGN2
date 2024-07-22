package singleton;

/*
 * Using a singleton pattern for a game controller ensures that all player inputs,
 * like movement and jumping, are managed by a single instance.
 * This centralises control and avoids conflicts that could arise from multiple controllers.
 * It also makes it easier to switch between different input methods,
 * such as using arrows or WASD keys, while keeping the control logic consistent
 * throughout the game.
 */
public class GameController {
	
	private static GameController instance;
	
	private GameController() {}
	
	public static synchronized GameController getInstance() {
		if (instance == null) 
			instance = new GameController();
		return instance;
	}
	
	public void moveForward(int numOfSteps) {
		System.out.println("Player has moved " + numOfSteps + " block(s) forward");
	}
	
	public void moveBackward(int numOfSteps) {
		System.out.println("Player has moved " + numOfSteps + " block(s) backward");
	}
	
	public void jump() {
		System.out.println("Player has jumped");
	}
	
	public void hitEnemy(Enemy enemy) {
		enemy.takeDamage();
	}

}
