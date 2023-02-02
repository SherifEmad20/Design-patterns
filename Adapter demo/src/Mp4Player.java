
public class Mp4Player implements AdvanceMediaPlayer {

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing Mp4 file.");
		System.out.println("File name: " + fileName);

	}

	@Override
	public void playVlc(String fileName) {

	}

}
