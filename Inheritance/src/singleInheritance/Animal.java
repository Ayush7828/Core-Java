package singleInheritance;

public class Animal {

	void eat() {
		System.out.println("I am Eating");
	}

}

class Dog extends Animal {

}

class Test {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.eat();

	}
}