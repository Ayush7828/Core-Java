package throwlearn;

public class Test {
	public static void main(String[] args) {
		int age = 16;
		try {
			if (age < 18) {
				throw new ThrowKeyword("Yo cannot eligble for vote");
			} else {
				System.out.println("Vote eligible");
			}
		} catch (Exception e) {
			System.out.println("Hello");
		}
	}

}
