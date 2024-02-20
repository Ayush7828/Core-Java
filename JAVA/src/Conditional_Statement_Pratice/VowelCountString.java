package Conditional_Statement_Pratice;

class ProgramCount {
	String s = "The Kiran Academy";
	int count = 0;

	void programvowelCountString() {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'U' || ch == 'O') {
				count++;
			}

		}
		System.out.print("Total Vowel Is = " + count);
	}
}

public class VowelCountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramCount obj = new ProgramCount();
		obj.programvowelCountString();

	}

}
