/**
 * 
 * @author Miles Black (mablack01@aol.com)
 *
 */

public enum Direction {
	
	NORTH(),
	
	EAST(),
	
	SOUTH(),
	
	WEST();
	
	/**
	 * Calculates the new coordinate direction given a command.
	 * @param origin The original direction of a coordinate.
	 * @param turn The direction command, either L or R.
	 * @return The new direction of a coordinate.
	 */
	public static Direction setNextDirection(Direction origin, char turn) {
		switch(turn) {
		case 'L':
			if (origin == NORTH)
				return WEST;
			else if (origin == EAST)
				return NORTH;
			else if (origin == SOUTH)
				return EAST;
			else if (origin == WEST)
				return SOUTH;
		case 'R':
			if (origin == NORTH)
				return EAST;
			else if (origin == EAST)
				return SOUTH;
			else if (origin == SOUTH)
				return WEST;
			else if (origin == WEST)
				return NORTH;
		default:
			System.out.println("Invalid move detected, closing program.");
			System.exit(1);
		}
		return null;
	}

}
