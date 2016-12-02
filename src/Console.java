import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Miles Black (mablack01@aol.com)
 *
 */
public class Console {
	
	private static boolean DEBUG = true;
	private static String fileLocation = "./data/input.txt";
	
	/**
	 * The main method that handles the text file input.txt
	 * @param args
	 */
	public static void main(String[] args) {
        File file = new File(fileLocation);
        String line = null;
        String input = "";
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null)
                input += line;
            bufferedReader.close();
            System.out.println("Starting coordinate at (0,0)");
            Coordinate coord = processCommand(input);
            System.out.println("The final coordinate is: (" + coord.getX() + "," + coord.getY() + ")");
            System.out.println("This coordinate is " + (Math.abs(coord.getX()) + Math.abs(coord.getY())) + " blocks away from the original coordinate.");
        } catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + file.getName() + "'");
            System.exit(2);
        } catch(IOException ex) {
            System.out.println("Error reading file '"  + file.getName() + "'");
            System.exit(3);
        } catch(StringIndexOutOfBoundsException ex) {
            System.out.println("No input detected in file '"  + file.getName() + "'");
            System.exit(4);
        }
	}
	
	public static Coordinate processCommand(String input) {
		Coordinate coord = new Coordinate();
		String[] cmd = input.split(", ");
		for(String instr : cmd) {
			coord.move(instr.charAt(0), Integer.parseInt(instr.substring(1)));
			if (DEBUG)
				System.out.println("The coordinate's new position is: (" + coord.getX() + "," + coord.getY() + ")");
		}
		return coord;
	}

}
