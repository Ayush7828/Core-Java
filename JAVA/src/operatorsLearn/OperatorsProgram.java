package operatorsLearn;

class Operators {
//	Learn Operators
	int a = 4, b = 6, ans;

//	Types of Operators 

//1) Arithmetic Operator
	void arthmetic() {
		ans = a + b;
		System.out.println("Additon " + ans);

		ans = a - b;
		System.out.println("Subtract " + ans);

		ans = a * b;
		System.out.println("Multiply " + ans);

		ans = a / b;
		System.out.println("Division " + ans);

		ans = a % b;
		System.out.println("Modulo give remainder " + ans);

	}

//2) Assignemnt Operator 
	void assignemntOperator() {
		int y = 78;
		System.out.println(y);
	}

//3)Relational operator 
//	<,>,<=,>=,==,!=
	void relationalOperator() {
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != b);
	}

//4) Logical operator
//	&& ,||,!

//5)Ternay Operator

	void ternary() {
		String con = a > b ? "Hello Ayush" : "Tushar";
		System.out.println(con);
	}

//6)Bitwise operator

//7)Unary Operator
//	++,--
//	p++ -->Post Increment
//	++p --Pre Increment

//	p-- -->Post Dcrement
//	--p --Pre Drement

	void unary() {
		int j = 4;
		System.out.println(j);
		System.out.println(j++);
		System.out.println(j);

		System.out.println(j--);
		System.out.println(--j);
	}

}

public class OperatorsProgram {

	public static void main(String[] args) {

		Operators obj = new Operators();
		obj.arthmetic();
		obj.assignemntOperator();
		obj.relationalOperator();
		obj.unary();
	}

}
