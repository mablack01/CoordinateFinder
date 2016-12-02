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
	 * Default constructor for a (0,0) coordinate facing north.
	 */
	public Coordinate() {
		this.x = 0;
		this.y = 0;
		this.dir = Direction.NORTH;
	}
	
	/**
	 * Constructor for a (x,y) coordinate facing the direction dir.
	 * @param x Indicated x value.
	 * @param y Indicated y value.
	 * @param dir Indicated coordinate direction.
	 */
	public Coordinate(int x, int y, Direction dir) {
		this.x = x;
		this.y = y;
		this.dir = dir;
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
	
	/**
	 * Moves a coordinate based on the commands given.
	 * @param turn The direction the coordinate turns to.
	 * @param amt The amount of spaces the coordinate moves.
	 */
	public void move(char turn, int amt) {
		this.dir = Direction.setNextDirection(dir, turn);
		switch(dir) {
		case NORTH:
			y += amt;
			break;
		case EAST:
			x += amt;
			break;
		case SOUTH:
			y -= amt;
			break;
		case WEST:
			x -= amt;
			break;
		}
	}

}
