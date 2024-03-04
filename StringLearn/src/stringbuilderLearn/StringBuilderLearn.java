package stringbuilderLearn;

public class StringBuilderLearn {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
		sb.insert(1, "s");
		System.out.println(sb);
		sb.append("Stark");
		System.out.println(sb);

		sb.setCharAt(3, 'u');
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
	}

}
