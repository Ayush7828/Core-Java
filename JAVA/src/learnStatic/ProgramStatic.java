package learnStatic;

class Area {

	public Area() {
		System.out.println("Hello");
	}

	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Non Static Block");
	}
	public static int a;

	public static void run() {

		System.out.println("Car Run");
	}

}

public class ProgramStatic {

	public static void main(String[] args) {
		Area obj = new Area();
		Area.a = 45;
		Area.run();
		Area obj1 = new Area();
	}

}
