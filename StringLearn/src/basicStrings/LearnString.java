package basicStrings;

public class LearnString {

	public static void main(String[] args) {
//	     Basic String
//		Create String 
//		1) Literal
		String name = "Anuj";
		String sname = "Anuj";
		System.out.println(name.getClass());
		System.out.println(sname);

//		2) new Keyword method

		String n = new String("Anuj");
		System.out.println(n);

//		it points same reference  so print this both are same
//		if (name == sname) {
//			System.out.println("Both are Same");
//		}
//
////		This case print Both are name same because pointing to another location of memory
//		if (name == n) {
//			System.out.println("Both are same");
//		} else {
//			System.out.println("Both are Not same");
//		}

//		Campare values in String use equals Methods

		if (name.equals(n)) {
			System.out.println("Both are value same");
		}

	}

}
