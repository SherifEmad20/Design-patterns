
public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("Mp3")) {
			System.out.println("Playing Mp3 file.");
			System.out.println("File name: " + fileName);
		} else if (audioType.equalsIgnoreCase("Mp4") || audioType.equalsIgnoreCase("Vlc")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);

		} else {
			System.out.println("Audio type is not supported.");
		}
	}

}
