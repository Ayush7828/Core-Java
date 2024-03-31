package comLearn;

import java.io.FileWriter;
import java.io.IOException;

public class LearnFileHandling {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		fw.write("Hi ,Good Morning ");
		fw.write("\n");
		fw.write("JBK Java ");
		fw.flush(); // send the data forcefully in file
		fw.close();
	}
}
