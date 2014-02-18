import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class GUI implements ActionListener {

	JFrame f = new JFrame("yamaha o1v midiサーバ");
	JPanel p = new JPanel();
	JLabel log = new JLabel();
	JButton button1 = new JButton("開始");
	JButton button2 = new JButton("停止");
	JLabel ip = new JLabel();
	Show show = new Show();
	Network net = new Network();
	ChkThread re = null;




	public GUI() throws MidiUnavailableException, InterruptedException, InvalidMidiDataException{
		//IPアドレス取得
		ip.setText("IPアドレス:"+net.ip_fetch());


		//this.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,200);
		f.setLocationRelativeTo(null);
		//log.setSize(new Dimension(f.getWidth(),100));
		//log.setBackground(Color.white);
		button1.setPreferredSize(new Dimension(100, 30));
		button2.setPreferredSize(new Dimension(100, 30));




	    button1.addActionListener(this);

		button2.addActionListener(this);
		JTextField log = new JTextField();
		log.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 10));
		log.setHorizontalAlignment(JTextField.LEADING );
		log.setPreferredSize(new Dimension(480, 130));

		p.add(button1);
		p.add(button2);
		p.add(ip);
		p.add(log);
		Container contentPane = f.getContentPane();
	    contentPane.add(p, BorderLayout.CENTER);
	   //contentPane.add(log,BorderLayout.SOUTH);

		f.setVisible(true);//GUI表示
		//midi実行
//		try{
//			show.show_midiInfo(f);
//		}catch(RuntimeException e){
//			//f.dispose();
//		}
		//log.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource() == button1){
			re = new ChkThread(this.f);
			re.start();
		}
		else if(e.getSource()==button2){
            JLabel msg = new JLabel("接続が解除されます");
            JOptionPane.showMessageDialog(f, msg);
            try {
				re.halt();
				re=null;
			} catch (InterruptedException ex) {
				// TODO 自動生成された catch ブロック
				ex.printStackTrace();
			}
            //System.exit(0);//なぜがエラるから無理矢理終了！
		}
	}

}