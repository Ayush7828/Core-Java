package loopPratice;

public class AlphabetPrint {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		for (char ch = 'a'; ch <= 'z'; ch++) {
			// System.out.println(ch + " ");
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + " " + " Vowel");
			} else {
				System.out.println(ch + " " + "Consonat");
			}
		}
	}
}