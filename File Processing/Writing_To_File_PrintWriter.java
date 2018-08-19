import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Writing_To_File_PrintWriter {

	public static void main(String[] args) {
		//Text file will be located in its project folder
		File file = new File("text.txt"); //create a new .txt file called text
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