package comLearn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileBuffer {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		System.out.println(s);
		while (s != null) {
			System.out.print(s);
			s = br.readLine();
		}

	}

}
