package learnThrowsKeyWord;

import java.io.FileNotFoundException;

public class TestThrows {

	public static void main(String[] args) {
		ExampleThorws obj = new ExampleThorws();
		try {
			obj.readFile();
		} catch (FileNotFoundException e) {

			System.out.println("File Not Found Eception Occur");
		}
	}

}
