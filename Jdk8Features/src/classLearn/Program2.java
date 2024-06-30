package classLearn;

import java.util.Arrays;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 7, 8, 96, 10, 52);
		list.forEach((n) -> {
			System.out.println(n + 5);
		});
		List<String> ls = Arrays.asList("Greek", "Tka", "shubham", "Tushar");

	}

}
