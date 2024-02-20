package combasis.praticearray;

class Example {

//	Program 1 start  here
	void program1() {
		int[][] matrix = new int[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = i + j;
			}
		}
		System.out.println(matrix[2][1]);
//		Ouput 3
	}
//	Program 1 ends here

//	Program 2 start  here

	void program2() {
		String[] names = { "Alice", "Bob", "Charlie" };
		for (String name : names) {
			System.out.print(name + " ");
		}
	}
	// Program 2 ends here

//	Program 3 start  here
	void program3() {
		String str = "    Java Programming   ";
		System.out.println("\n" + str.trim());
	}
//	Program 3 Ends here

//	Program 4 start  here
	void program4() {
		String str = "Java";
		System.out.println("\n" + str.concat("Programming"));
	}
//	Program 4 Ends here

//	Program 5 start  here
	void program5() {
		String str = "Hello World!";
		System.out.println("\n" + str.substring(2));
	}
//	Program 5 Ends here

//	Program 6 start  here
	void program6() {
		String str = "Hello, World!";
		System.out.println(str.contains(" World ") + " ");
		System.out.println(str.isEmpty());
	}

//	Program 6 Ends here

//	Program 7 start  here
	void program7() {
		String str1 = "java";
		String str2 = "Java";
		System.out.println(str1.equals(str2) + " ");
		System.out.println(str2.equalsIgnoreCase(str2));
	}

//	Program 7 Ends here

//	Program 8 start  here
	void program8() {
		String str1 = "java Programming";
		String[] words = str1.split("a");
		System.out.println(words.length);

	}

//	Program 8 Ends here
}

public class PrariceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example obj = new Example();
		obj.program1();
		obj.program2();
		obj.program3();
		obj.program4();
		obj.program5();
		obj.program6();
		obj.program7();
		obj.program8();
	}

}
