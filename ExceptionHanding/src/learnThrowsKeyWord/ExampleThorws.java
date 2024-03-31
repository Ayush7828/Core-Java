package learnThrowsKeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExampleThorws {

	void readFile() throws FileNotFoundException {
		FileInputStream fi = new FileInputStream("abc.txt");
	}

	void savefile() throws FileNotFoundException {
		FileOutputStream f = new FileOutputStream("abc.txt");

	}
}
