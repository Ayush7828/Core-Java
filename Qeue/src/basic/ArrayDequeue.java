package basic;

import java.util.ArrayDeque;

public class ArrayDequeue {
	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque();
		ad.offer(10);
		ad.offerFirst(30);
		ad.offerLast(40);
		System.out.println(ad);

		System.out.println(ad.poll());

		System.out.println(ad.pollLast());

	}

}
