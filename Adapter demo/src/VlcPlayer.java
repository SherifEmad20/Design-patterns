
public class VlcPlayer implements AdvanceMediaPlayer {

	@Override
	public void playMp4(String fileName) {

	}

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing Vlc file.");
		System.out.println("File name: " + fileName);
	}

}
