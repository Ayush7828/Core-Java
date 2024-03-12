package learnGernric;

public class Dog<T> {

	T id; // generic

	public Dog(T id) {
		this.id = id;
	}

	public T getdata() {
		System.out.println(id);
		return this.id;
	}

}
