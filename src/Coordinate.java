
public class Coordinate {
	
	/**
	 * Fields for a coordinate.
	 */
	private int x;
	private int y;
	
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

}
