import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/* Why use BufferedReader and BufferedWriter?
 * https://medium.com/@isaacjumba/why-use-bufferedreader-and-bufferedwriter-classses-in-java-39074ee1a966
 */
public class Reading_BufferedReader {

	public static void main(String[] args) {
		//Use instance of FileReader class with BufferedReader
		try {
			FileReader fr = new FileReader("C:\\Users\\...\\text.txt");
			//file path needs to have 2 forward slashes "\"
			BufferedReader br = new BufferedReader(fr);
			//loop to read and print all lines of file
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			//close br after reading (will also close fr)
			br.close();
		} catch (Exception e) { 
			//Must catch possible FileNotFoundException error from FileReader and possible IOException error from .readLine();
			System.out.println("Error: " + e);
		}
	}
}
