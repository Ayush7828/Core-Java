package learnGernric;

public class TestDog {

	public static void main(String[] args) {
		Dog<String> ob1 = new Dog<>("Tommy");
		ob1.getdata();
		Dog<Integer> ob2 = new Dog<>(45);
		ob2.getdata();

	}

}
