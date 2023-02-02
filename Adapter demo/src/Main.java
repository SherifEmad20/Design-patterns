
public class Main {

	public static void main(String[] args) {

		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("Mp4", "alone.mp4");
		audioPlayer.play("Vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");

	}

}
