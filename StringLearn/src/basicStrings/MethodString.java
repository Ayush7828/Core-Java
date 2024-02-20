package basicStrings;

public class MethodString {

	public static void main(String[] args) {
		String name = "aNus24";
		System.out.println(name.toUpperCase());

		String a = "      AYUSHSINGH       ";
		System.out.println(a.toLowerCase());
//		check trim() - remove whitespaces

		System.out.println(a.trim());

//		StartWith()
		System.out.println("Carpet".startsWith("Bike"));

		System.out.println("Carpet".startsWith("Ca"));

//		endsWith()
		System.out.println("HuundaiVerna".endsWith("na"));

//		charAt()
		System.out.println("TusharSingh".charAt(7));

//		ValueOf
		int age = 456;

		String newage = String.valueOf(age);
		System.out.println(newage);

//		replace
		String sent = "Java Programming Language";
		System.out.println(sent);
		String newsent = sent.replace("Java", "Flutter");
		System.out.println(newsent);

//		Contains
		System.out.println(sent.contains("java"));

//		Substring
		System.out.println(sent.substring(2, 5));

	}

}
