import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;


public class Show {

	MidiDevice.Info[] info = MidiSystem.getMidiDeviceInfo();
	MidiDevice mixer;
	Receiver rcvr;

	public void show_midiInfo() throws MidiUnavailableException, InterruptedException, InvalidMidiDataException{
		for(int i=0; i<info.length;i++){
            if (info[i].getName().equals("Yamaha 01V96-1") &&
                    info[i].getDescription().equals("External MIDI Port"))
            {
            	mixer = MidiSystem.getMidiDevice(info[i]);
            	mixer.open();
            	rcvr=mixer.getReceiver();
            }
		}

		if(mixer==null){
//			JLabel label = new JLabel("MIDI 01V96 not found");
//		    label.setForeground(Color.RED);
//		    JOptionPane.showMessageDialog(f, label);
			throw new RuntimeException("MIDI 01V96 not found.");
		}

	}

	public void send_midi(String data) throws NumberFormatException, InvalidMidiDataException{
		IBCMessage mes = new IBCMessage(null);
		mes.setFader(1, Integer.parseInt(data));
		rcvr.send(mes, -1);
	}
}
