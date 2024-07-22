package singleton;

public class Driver {

	public static void main(String[] args) {
		
		GameController gameController = GameController.getInstance();
		
		Enemy browser = new Enemy("Browser", 100, 20);
		
		gameController.moveBackward(3);
		gameController.jump();
		gameController.moveForward(7);
		gameController.hitEnemy(browser);
	}

}
