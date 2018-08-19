import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Use Scanner if you want to parse specific type of token from a stream (using .nextLine(), .nextInt(), etc.)
public class Reading_Text_File_Scanner {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\...\\text.txt");
		//file path needs to have 2 forward slashes "\"
		try {
			Scanner sc = new Scanner(file); //uses Scanner to read file
			//loop to print all lines of file
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) { //Must catch possible FileNotFoundException error from Scanner
			System.out.println("Error: " + e);
		}
	}
}
