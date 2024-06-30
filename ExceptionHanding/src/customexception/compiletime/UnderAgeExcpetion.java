package customexception.compiletime;

public class UnderAgeExcpetion extends Exception {

	public UnderAgeExcpetion() {
		super(" You are under age ");
	}

	UnderAgeExcpetion(String msg) {
		super(msg);
	}

}
