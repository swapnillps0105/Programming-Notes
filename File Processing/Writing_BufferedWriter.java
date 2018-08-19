import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/* Why use BufferedReader and BufferedWriter?
 * https://medium.com/@isaacjumba/why-use-bufferedreader-and-bufferedwriter-classses-in-java-39074ee1a966
 */
public class Writing_BufferedWriter {

	public static void main(String[] args) {
		//Use instance of FileWriter class with BufferedWriter
		try {
			//create a new .txt file called text
			//Text file will be located in its project folder
			FileWriter fw = new FileWriter("text.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			//Write to file using .write(String)
			bw.write("sample text here");
			bw.newLine(); //creates a new line
			bw.write("16");
			//Close bw when finished writing (it will also close fw)
			bw.close();
		} catch (IOException e) { //must catch possible IOException error from FileWriter
			System.out.println("Error: " + e);
		}
	}
}
