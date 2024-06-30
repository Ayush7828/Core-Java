package classLearn;

import java.util.Arrays;
import java.util.List;

public class ExampleStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 8);
		System.out.println("Even Numbers ");
		list.stream().filter(integer -> integer % 2 == 0).forEach(System.out::println);
		System.out.println("ODD Numbers ");
		list.stream().filter(t -> t % 2 != 0).forEach(System.out::println);

//		Function interface contains single abstract method

//		Lambda expression is used  todefine abstract method form fucntional interface 

//		Lambda expression ,implementation class and it's object is generated automatically

//		Think Functional interface ,Think Lambda expression

	}

}
