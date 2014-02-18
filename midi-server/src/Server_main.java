import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;


public class Server_main {

	public static void main(String[] args) throws MidiUnavailableException, InterruptedException, InvalidMidiDataException {
		//MACのなまえ対策
		System.setProperty("com.apple.mrj.application.apple.menu.about.name","Yahama O1V96 midiリモートサーバ");
		GUI gui = new GUI();
	}

}
