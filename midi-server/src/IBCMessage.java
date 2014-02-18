import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiMessage;


public class IBCMessage extends MidiMessage{

	protected IBCMessage(byte[] initial) {
		super(initial);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public Object clone() {
		// TODO 自動生成されたメソッド・スタブ
		return this;
	}

	public void setFader(int ch,int vol) throws InvalidMidiDataException{
		String temp = this.translate(vol);
		byte[] data = new byte[14];
		data[0]=(byte)0xF0;
		data[1]=(byte)0x43;
		data[2]=(byte)0x10;
		data[3]=(byte)0x3E;
		data[4]=(byte)0x7F;
		data[5]=(byte)0x01;
		data[6]=(byte)0x1C;
		data[7]=(byte)0x00;
		data[8]=(byte)(ch-1);
		data[9]=(byte)0;
		data[10]=(byte)0;
		data[11]=(byte)Byte.parseByte(temp.substring(0,1),16);
		data[12]=(byte)Byte.parseByte(temp.substring(1,3),16);
		data[13]=(byte)0xF7;
		this.setMessage(data, data.length);
	}

	public void setOn(int ch,boolean status) throws InvalidMidiDataException{
		byte[] data = new byte[14];
		data[0]=(byte)0xF0;
		data[1]=(byte)0x43;
		data[2]=(byte)0x10;
		data[3]=(byte)0x3E;
		data[4]=(byte)0x0D;
		data[5]=(byte)0x20;
		data[6]=(byte)0x00;
		data[7]=(byte)0x00;
		data[8]=(byte)(ch-1);
		if(status)data[9]=(byte)1;
		else data[9]=(byte)0;
		data[10]=(byte)0xF7;
		this.setMessage(data, data.length);
	}

	public void setSolo(int ch,boolean status) throws InvalidMidiDataException{
		byte[] data = new byte[14];
		data[0]=(byte)0xF0;
		data[1]=(byte)0x43;
		data[2]=(byte)0x10;
		data[3]=(byte)0x3E;
		data[4]=(byte)0x0D;
		data[5]=(byte)0x20;
		data[6]=(byte)0x00;
		data[7]=(byte)0x01;
		data[8]=(byte)(ch-1);
		if(status)data[9]=(byte)1;
		else data[9]=(byte)0;
		data[10]=(byte)0xF7;
		this.setMessage(data, data.length);
	}
	

	private String translate(int moto){
		String temp = String.format("%10s", Integer.toBinaryString(moto)).replace(" ", "0");
		String result="";
		result+=Integer.toOctalString(Integer.parseInt(temp.substring(0,3),2));
		result+=Integer.toOctalString(Integer.parseInt(temp.substring(3,6),2));
		result+=Integer.toHexString(Integer.parseInt(temp.substring(6,10),2));
		return result;
	}
}
