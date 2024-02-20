package learnStatic;

class Area {
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
	}

}
