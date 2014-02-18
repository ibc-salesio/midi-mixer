import java.awt.Color;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class Network {

	public String ip_fetch(){

		String IP="";

		//IPアドレス取得
		try {
			InetAddress addr = InetAddress.getLocalHost();
		   	IP=addr.getHostAddress();
	    } catch (UnknownHostException e) {
	    	e.printStackTrace();
	    }
		return IP;
	}
}

class ChkThread extends Thread{
	Show show = new Show();
	public static final int PORT = 10010;//ポート番号
	private volatile boolean runflag=true;
	JFrame window;
	DatagramSocket serverSocket = null;
	DatagramSocket socket=null;
	SocketAddress sockAddress;
	
	public ChkThread(JFrame f){
		this.window = f;
	}

	@Override
	public synchronized void run(){
			try {
				show.show_midiInfo();
			} catch (MidiUnavailableException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			} catch (InvalidMidiDataException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			} catch (RuntimeException e1){
				JLabel label = new JLabel("MIDI 01V96 not found");
			    label.setForeground(Color.RED);
			    JOptionPane.showMessageDialog(window, label);
				throw e1;
			}
			

		 	String line="";
		      try {
				serverSocket = new DatagramSocket(PORT);
			} catch (SocketException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}//インスタンス
		      System.out.println("Serverが起動しました(port="+ serverSocket.getLocalPort() + ")");

		     while(runflag){ //接続待ち受けループ
		    	 byte []buf = new byte[256];
		    	 DatagramPacket packet=new DatagramPacket(buf,buf.length);
		    	 try {
					serverSocket.receive(packet);
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}//接続
		    	 sockAddress = packet.getSocketAddress();
		    	 int len = packet.getLength();
		    	 line = new String(buf,0,len);
		    	 //System.out.println("From:"+sockAddress.toString());
		    	 //System.out.println("受信: " + line);
		    	 System.out.println(line);
					/*try {
						show.send_midi(line);
					} catch (NumberFormatException e) {
						// TODO 自動生成された catch ブロック
						e.printStackTrace();
					} catch (InvalidMidiDataException e) {
						// TODO 自動生成された catch ブロック
						e.printStackTrace();
					}*/
		     }
	      System.out.println("リッスンを停止しました");
	}

	public void halt() throws InterruptedException {
		try {
			//wait();
			runflag=false;
			//accept()を回すために自分自身に接続
			byte[]buf=new byte[1];
			InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
			buf[1]=-1;
			socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(buf, buf.length, inetAddress, 10010);
			socket.send(packet);
			//すぐに閉じる
			//socket=null;
		}catch (IOException e) {
				   e.printStackTrace(System.out);
		}
	}
}



