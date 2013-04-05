/**
 * Zombie.java
 * 
 * The class representing the Zombie object in the game. This class needs to
 * have some representation of current location, a reference to its target (aka
 * the Human) and a speed. You should create methods for checking to see if the
 * Zombie is colliding with another Zombie, checking to see if the Zombie is
 * close enough to eat the Human's brains, and movement.
 * 
 * @authors Jeffrey Cannon and Lauren Scott
 * @compids jmc5fm and lbs5fv
 * @lab 1111
 */
public class Zombie {
	// --------------------- instance fields ----------------------
	private int xCurrent;
	private int yCurrent;
	private int xTarget;
	private int yTarget;
	private int speed;
	
	// ----------------------- Constructors -----------------------
	/**
	 * Zombie Constructor
	 * @param xC current x position
	 * @param yC current y position
	 * @param s speed
	 */
	public Zombie (int xC, int yC, int s) {
		xCurrent = xC;
		yCurrent = yC;
		speed = s;
	}
	
	public Zombie () {
		xCurrent = 0;
		yCurrent = 0;
		xTarget = 0;
		yTarget = 0;
		speed = 10;
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
	
	// ----------------------------------------------------------
	// ---------------- other methods start here ----------------
	// ----------------------------------------------------------
}
