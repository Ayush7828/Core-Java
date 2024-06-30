package hashmaplearn;

import java.util.HashMap;
import java.util.Map;

public class LearnHashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap();

		hm.put(101, "Ayush");
		hm.put(102, "Tusahr");
		hm.put(103, "Shubham");
		hm.put(104, "Jay");
		hm.put(105, "Viru");
		System.out.println(hm);

//		ek ek kar ke rerive karna hai to 

		for (Map.Entry me : hm.entrySet()) {
			System.out.println(me.getKey() + " " + me.getValue());
		}
	}

}
