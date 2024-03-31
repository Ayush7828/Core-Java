package polymorphism.multimedia;

public class TestMultiMedia {

	public static void main(String[] args) {
		MultiMedia m1 = new MultiMedia("Ms-Dhoni", 14, 245);
		m1.play();

		AudioFile af = new AudioFile("RRR", 75, 741, "NTR", "Song-Dj");
		af.play();

		VideoFile v = new VideoFile("Pushpa", 24, 123, 146, "Auto Play");
		v.play();

	}

}
