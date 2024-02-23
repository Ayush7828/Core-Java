package compratic;

public class TestA {

	public static void main(String[] args) {
		/* case4 B b=new A() */

//	case 5	B b = new A();   show compile time error 

		A a1 = new A();
		B b1 = new B();
		a1 = b1;

		a1.m1();
		a1.m2();

		System.out.println(a1.a);
		System.out.println(a1.s);

		/*
		 * First run parent constructor and then run child class but call Parent class
		 * Constructor a1 = b1; this line means a1 object reference to point B class
		 * object Parent Constructor Parent Constructor Child Constructor
		 */

		/*
		 * output 111 333 10 JBk
		 */
		// System.out.println(a1.b); error

//	case 2	B b1=new B()

		B obj = new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.s);
		obj.m1();
		obj.m2();
		obj.m3();

		/*
		 * output Parent Constructor Child Constructor 10 20 TKA 111 333 444
		 */
// Case 3 A aj1=new B()

		A ag = new B();
		System.out.println(ag.a);
		System.out.println(ag.s);
		ag.m1();
		ag.m2();
		System.out.println(ag.s);

//		System.out.println(ag.b);
//		error
//		ag.m3();

//		output
//		Parent Constructor
//		Child Constructor
//		10
//		JBk
//		111
//		333
//		JBk

	}

}
