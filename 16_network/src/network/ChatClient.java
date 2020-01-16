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
		send = new JButton("����");
		southP.add("Center", input); southP.add("East", send);
		
		Container c = this.getContentPane();
		c.add("Center", scroll);
		c.add("South", southP);
		
		setBounds(700, 200, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	private void service() {
		//���� ���̾˷α�
		String serverIP = JOptionPane.showInputDialog(this, "����IP�� �Է��ϼ���", "192.168.0.68");
		if(serverIP==null || serverIP.length()==0) {
			System.out.println("����IP�� �Էµ��� �ʾҽ��ϴ�");
			System.exit(0);
		}
		
		//�г���
		String nickName = JOptionPane.showInputDialog(this,"�г����� �Է��ϼ���", "�г���",JOptionPane.INFORMATION_MESSAGE);
		if(nickName==null||nickName.length()==0) {
			nickName="guest";
		}
		
	}
	
	public static void main(String[] args) {
		new ChatClient().service();

	}


}