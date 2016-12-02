import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Miles Black (mablack01@aol.com)
 *
 */
public class Console {
	
	/**
	 * The main method that handles the text file input.txt
	 * @param args
	 */
	public static void main(String[] args) {
        String fileName = "./data/input.txt";
        String line = null;
        String input = "";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null)
                input += line;
            bufferedReader.close();
            Coordinate coord = processCommand(input);
            System.out.println("The final coordinate is: (" + coord.getX() + "," + coord.getY() + ")");
        } catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
            System.exit(2);
        } catch(IOException ex) {
            System.out.println("Error reading file '"  + fileName + "'");
            System.exit(3);
        }
	}
	
	public static Coordinate processCommand(String input) {
		Coordinate coord = new Coordinate();
		String[] cmd = input.split(", ");
		for(String move : cmd) {
			//handle all the moves in order
		}
		return coord;
	}

}
