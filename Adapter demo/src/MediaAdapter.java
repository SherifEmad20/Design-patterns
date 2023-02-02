
public class MediaAdapter implements MediaPlayer {

	AdvanceMediaPlayer advanceMediaPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("VLC")) {
			advanceMediaPlayer = new VlcPlayer();
		}

		else if (audioType.equalsIgnoreCase("Mp4")) {
			advanceMediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {

		if (audioType.equalsIgnoreCase("VLC")) {
			advanceMediaPlayer.playVlc(fileName);
		}

		else if (audioType.equalsIgnoreCase("Mp4")) {
			advanceMediaPlayer.playMp4(fileName);
		}
	}

}
