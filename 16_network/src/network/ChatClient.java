package network;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame{
	private JTextArea output;
	private JTextField input;
	private JButton send;
	
	public ChatClient() {
		output = new JTextArea();
		JScrollPane scroll = new JScrollPane(output,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		output.setEditable(false);
		
		JPanel southP = new JPanel();
		southP.setLayout(new BorderLayout());
		input = new JTextField();
		send = new JButton("전송");
		southP.add("Center", input); southP.add("East", send);
		
		Container c = this.getContentPane();
		c.add("Center", scroll);
		c.add("South", southP);
		
		setBounds(700, 200, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	private void service() {
		//서버 다이알로그
		String serverIP = JOptionPane.showInputDialog(this, "서버IP를 입력하세요", "192.168.0.68");
		if(serverIP==null || serverIP.length()==0) {
			System.out.println("서버IP가 입력되지 않았습니다");
			System.exit(0);
		}
		
		//닉네임
		String nickName = JOptionPane.showInputDialog(this,"닉네임을 입력하세요", "닉네임",JOptionPane.INFORMATION_MESSAGE);
		if(nickName==null||nickName.length()==0) {
			nickName="guest";
		}
		
	}
	
	public static void main(String[] args) {
		new ChatClient().service();

	}


}
