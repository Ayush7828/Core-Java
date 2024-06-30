package customexception.runtimeexception;

public class UnderAge extends RuntimeException {

	UnderAge() {
		super("You are not eligible for voting ");
	}

	UnderAge(String msg) {
		super(msg);
	}
}
