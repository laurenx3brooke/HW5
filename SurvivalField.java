import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

/**
 * SurvivalField.java
 * 
 * The SurvivalField is the field of play for the game. It passes messages
 * between the Human and the Zombies. It also picks up the commands from the
 * mouse and does the appropriate action. This is the class that will have the
 * main method to start the game.
 * 
 * @authors
 * @compid
 * @lab
 */
public class SurvivalField {

	// The SurvivalField needs a canvas to draw on
	private SimpleCanvas canvas;

	// The InfoFrame that you use for output instead of System.out
	private InfoFrame output;

	// Default board size
	private final int BOARDHEIGHT = 700;
	private final int BOARDWIDTH = 700;

	// -----------------------------------------
	// Fields
	// You should setup fields to keep up with:
	// - a whole bunch of Zombies
	// - a single Human
	// - some way to know if the game is over
	// - a way to keep track of the score
	// - how many zombies you should start with
	// -----------------------------------------
	private ArrayList<Zombie> zombies;
	private Human human;
	private boolean gameOver;
	private int score;
	private int initialZombies;

	// -----------------------------------------
	// Methods

	/**
	 * The Constructor - This method should instantiate a new canvas, create a
	 * new player character, and create the first four zombies in random
	 * locations around the board.
	 */
	public SurvivalField() {
		// Create canvas object with 500x500 spatial dimensions.
		canvas = new SimpleCanvas(BOARDWIDTH, BOARDHEIGHT, this);

		// Initialize your output frame
		output = new InfoFrame(this);

		// Here is where you should create your initial zombies and your Human
		// 20 is a good speed for the human - 10 for the zombie, but experiment!
		gameOver = false;
		score = 0;
		initialZombies = 4;
		
		Human human = new Human(350,350,20,3);
		this.human = human;
		
		Random rand = new Random();
		zombies = new ArrayList<>();
		for (int i = 0; i < initialZombies; i++) {
			Zombie zombie = new Zombie(rand.nextInt(551), rand.nextInt(551), 10);
			zombies.add(zombie);
		}
	}

	/**
	 * This method should control all of your mouse actions. The mouse activity
	 * is picked up by the SimpleCanvas and then it should call this method,
	 * passing either the button that was pressed or some other flag.
	 */
	public void mouseAction(float x, float y, int button) {
		if (button == -1) {
			output.println("Mouse: " + x + "," + y);
		}

		if (button == 1) {
			output.println("You clicked the left mouse button!");
		}

		if (button == 3) {
			output.println("You clicked the right mouse button!");
		}

	}

	/**
	 * This method controls the bomb action. It should ask the player if it has
	 * any bombs. If so, that count should be decremented by one. Then every
	 * zombie within a 50 pixel radius of the player should be eliminated.
	 */
	public void detonateBomb() {

	}

	/**
	 * This is the main drawing function that is automatically called whenever
	 * the canvas is ready to be redrawn. The 'elapsedTime' argument is the
	 * time, in seconds, since the last time this function was called.
	 * 
	 * Other things this method should do: - draw the zombies and the human on
	 * the screen - tell the zombies and human to move - check to see if the
	 * game is over after they move - halt the game if the game is over - update
	 * the score for every cycle that the user is alive - add a new zombie every
	 * 5000 cycles - add a new bomb every 50000 cycles
	 * 
	 * 
	 */
	public void draw(Graphics2D g, float elapsedTime) {

		// This is how you draw the Human, replacing the null with the human
		// object
		canvas.drawHuman(g, human);

		// This is how you draw the Zombies, replacing the null with a zombie
		// object
		for (int i = 0; i < zombies.size(); i++) {
			canvas.drawZombie(g, zombies.get(i));
		}
	}

	/**
	 * Your standard main method
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		SurvivalField simulator = new SurvivalField();
		simulator.play();
	}

	/**
	 * This method starts the game.
	 */
	public void play() {
		canvas.setupAndDisplay();
	}
}
