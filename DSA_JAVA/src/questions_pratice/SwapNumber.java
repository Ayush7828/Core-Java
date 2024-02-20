package questions_pratice;

public class SwapNumber {
	public static int swapnumberwithoutthirdvariable(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
		return 1;

	}

	public static void main(String[] args) {

//		Swap Number Program
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter a two Number = ");
//		int a = sc.nextInt(), b = sc.nextInt(), temp;
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.println("After Swapping " + a + " " + b);

//		Swap Number without Use Third Variable

		System.out.println(swapnumberwithoutthirdvariable(20, 10));

	}

}
