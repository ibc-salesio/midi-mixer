package com.example.miditest;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class network {
	 public static final int PORT = 10010;
	 public static String ip="";
	 Socket socket = null;

	 DatagramSocket sendSocket;
	InetAddress inetAddress;
	 public network(){

	 }
	public void  socket_make(){

		    try {
		    	sendSocket = new DatagramSocket();//UDP送信用ソケット
		 		inetAddress = InetAddress.getByName("10.10.4.7");//送信先
		     //socket = new Socket(ip,PORT);
		 		socket = new Socket("10.10.4.7",PORT);
		 		System.out.println("接続しました" + socket.getRemoteSocketAddress());
		    } catch (IOException e) {
			      e.printStackTrace();
			    }
	}

	public void send_packet(String data) throws IOException{
		byte[] buf = data.getBytes();
		DatagramPacket packet= new DatagramPacket(buf,buf.length, inetAddress, 10010);//IPアドレス、ポート番号も指定
		sendSocket.send(packet);//送信
	}
	public void halt_packet(){
		      try {
		        if (socket != null) {
		          socket.close();
		        }
		      } catch (IOException e) {}
		      System.out.println("切断されました");
		  }
	}
