package learnenumeration;

import java.util.Enumeration;
import java.util.Vector;

public class LearnEnumeration {

	public static void main(String[] args) {
//      Learn Enumeration
		Vector v = new Vector();
		v.add(10);
		v.add(45);
		v.add(86);
		v.add("Ayush");
		System.out.println(v);

//		hasmoreelement(),nextelemnt()

		Enumeration er = v.elements();

		while (er.hasMoreElements()) {
			System.out.println(er.nextElement());

		}
	}

}
