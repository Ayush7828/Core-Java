package comLearn;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("abc.txt");
		int i = fr.read();
		// System.out.println((char) i);
		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();

		}
		fr.close();
	}
}
