package polymorphism.multimedia;

public class MultiMedia {

	String title;
	float duration;
	int filesize;

	public MultiMedia(String title, float duration, int filesize) {
		this.title = title;
		this.duration = duration;
		this.filesize = filesize;
	}

	public void play() {
		System.out.println("Title of  MultiMedia  : " + title);
		System.out.println("Duration of MultiMedia  : " + duration);
		System.out.println("File Size of  MultiMedia  : " + filesize);
		System.out.println("-------------------------------");
	}

}

class AudioFile extends MultiMedia {
	String artist;
	String album;

	public AudioFile(String title, float duration, int filesize, String artist, String album) {
		super(title, duration, filesize);
		this.artist = artist;
		this.album = album;

	}

	@Override
	public void play() {
		super.play();// this line call parent method
		System.out.println("Audio File ");
		System.out.println("Artist Name " + artist);
		System.out.println("Album = " + album);
		System.out.println("-------------------------------");
	}

}

class VideoFile extends MultiMedia {

	int resolution;
	String feature;

	public VideoFile(String title, float duration, int filesize, int resolution, String feature) {
		super(title, duration, filesize);
		this.resolution = resolution;
		this.feature = feature;

	}

	@Override
	public void play() {
		super.play();
		System.out.println("Video File resolution : " + resolution);
		System.out.println("Video File Features : " + feature);
	}

}