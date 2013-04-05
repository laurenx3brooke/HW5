/**
 * Human.java
 * 
 * The player's character. It should have a location, a location to which it is
 * trying to go, a relative speed, and a number of bombs. You should create
 * appropriate methods for movement, changing the target location,
 * incrementing/decrementing bombs, and all appropriate constructors.
 * 
 * @authors Jeffrey Cannon and Lauren Scott
 * @compids jmc5fm and lbs5fv
 * @lab 1111
 * 
 */
public class Human {
	// --------------------- instance fields ----------------------
	private int xCurrent;
	private int yCurrent;
	private int xTarget;
	private int yTarget;
	private int speed;
	private int numBombs;
	
	// ----------------------- Constructors -----------------------
	/**
	 * Human Constructor
	 * @param xC current x position
	 * @param yC current y position
	 * @param s speed
	 * @param b number of bombs human starts with
	 */
	public Human (int xC, int yC, int s, int b) {
		xCurrent = xC;
		yCurrent = yC;
		xTarget = 0;
		yTarget = 0;
		speed = s;
		numBombs = b;
	}
	
	public Human () {
		xCurrent = 0;
		yCurrent = 0;
		xTarget = 0;
		yTarget = 0;
		speed = 20;
		numBombs = 3;
	}

	// ----------------------------------------------------------------
	// --------------- getters and setters for fields -----------------
	// ----------------------------------------------------------------
	public int getxCurrent() {
		return xCurrent;
	}

	public void setxCurrent(int xCurrent) {
		this.xCurrent = xCurrent;
	}

	public int getyCurrent() {
		return yCurrent;
	}

	public void setyCurrent(int yCurrent) {
		this.yCurrent = yCurrent;
	}

	public int getxTarget() {
		return xTarget;
	}

	public void setxTarget(int xTarget) {
		this.xTarget = xTarget;
	}

	public int getyTarget() {
		return yTarget;
	}

	public void setyTarget(int yTarget) {
		this.yTarget = yTarget;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getNumBombs() {
		return numBombs;
	}

	public void setNumBombs(int numBombs) {
		this.numBombs = numBombs;
	}
	
	// ----------------------------------------------------------
	// ---------------- other methods start here ----------------
	// ----------------------------------------------------------
	public void useBomb() {
		numBombs--;
	}

	public void earnBomb() {
		numBombs++;
	}
}
