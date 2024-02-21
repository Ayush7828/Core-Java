package learnThrowAndThrows;

class InvalidException extends Exception {
	InvalidException(String msg) {
		System.out.println(msg);
	}
}

public class Test {
	/* User Defined Exception */
	public static void vote(int a) throws InvalidException {

		if (a < 18) {
			throw new InvalidException("Not Eligible for Voting");
		} else {
			System.out.println("Eligble for vote");
		}
	}

	/* try catch vs throws **/

//	public static void print() throws InterruptedException {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
//	}

	public static void main(String[] args) {

//		try {
//			print();
//			System.out.println(10 / 0);
//		} catch (Exception e) {
//			System.out.println("Exception Sucessfullu Handle");
//		}
//		System.out.println("Main Program Ended");

		try {
			vote(12);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
