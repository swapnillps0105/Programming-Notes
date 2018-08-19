import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Writing_To_File {

	public static void main(String[] args) {
		//To find the text file, right-click the project folder and find its location
		File file = new File("text.txt"); //create a new text file called text.txt
		try {
			PrintWriter output = new PrintWriter(file); 
			output.println("sample text");
			output.println(16);
			output.close(); //remember to release the file for use
		} catch (IOException e) { //Must catch possible IOException error from PrintWriter
			System.out.println("Error: " + e);
		}
	}

}