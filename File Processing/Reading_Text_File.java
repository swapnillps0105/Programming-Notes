import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading_Text_File {

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
