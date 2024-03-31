package basic;

import java.util.LinkedList;
import java.util.Queue;

public class LearnBasicQueue {
	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<Integer>();
		q1.offer(10);
		q1.offer(20);
		q1.offer(40);
		q1.offer(20);
		q1.offer(40);

		System.out.println(q1);
		System.out.println(q1.remove());
		System.out.println(q1.peek());

		while (!q1.isEmpty()) {
			System.out.println(q1.poll());
		}

	}

}
