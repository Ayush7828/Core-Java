package classWork;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Player> mi = new ArrayList<Player>();
		Player p = new Player("Virat", 2, 14000, 50000);
		Player p1 = new Player("Rohit", 45, 2000, 10000);

		Player p2 = new Player("Hardik", 9, 4000, 5000);
		Player p3 = new Player("Shikar", 4, 9000, 6000);
		Player p4 = new Player("Shubham Gill", 9, 5000, 1000);
		Player p5 = new Player("Rahul ", 14, 8000, 9000);
		Player p6 = new Player("Rahul Tewatia", 155, 6000, 7000);

		mi.add(p);
		mi.add(p1);
		mi.add(p2);
		mi.add(p3);
		mi.add(p4);

		for (Player e : mi) {
			if (e.getPlayerrun() > 5000) {
				System.out.println(e.getPlayername() + " " + "---Player Run --- " + e.getPlayerrun());
			} else if (e.getPalyerarrrounder() > 6000) {
				System.out.println("All rounder Player name = " + e.getPlayername());
			}

		}

	}

}
