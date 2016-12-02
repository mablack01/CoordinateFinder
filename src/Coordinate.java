/**
 * 
 * @author Miles Black (mablack01@aol.com)
 *
 */

public class Coordinate {
	
	/**
	 * Fields for a coordinate.
	 */
	private int x;
	private int y;
	private Direction dir;
	
	/**
	 * Default constructor for a (0,0) coordinate.
	 */
	public Coordinate() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Constructor for a (x,y) coordinate.
	 * @param x Indicated x value.
	 * @param y Indicated y value.
	 */
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Gets the x value of a coordinate.
	 * @return The x position.
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Gets the y value of a coordinate.
	 * @return The y position.
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Gets the direction of a coordinate.
	 * @return The direction.
	 */
	public Direction getDirection() {
		return dir;
	}
	
	/**
	 * Sets the x value of a coordinate.
	 * @param amt The new value of x.
	 */
	public void setX(int amt) {
		x = amt;
	}
	
	/**
	 * Sets the y value of a coordinate.
	 * @param amt The new value of y.
	 */
	public void setY(int amt) {
		y = amt;
	}
	
	/**
	 * Sets the direction of a coordinate.
	 * @param dir The new direction.
	 */
	public void setDirection(Direction dir) {
		this.dir = dir;
	}

}
