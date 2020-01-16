package interface_1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements WindowListener, ActionListener {
	private JLabel idL, pwdL;
	private JTextField idT;
	private JTextField pwdT;
	private JButton loginB, cancelB;
	private String id, pwd;

	public Login() {
		this.setLayout(null);

		idL = new JLabel("아이디 :");
		pwdL = new JLabel("비밀번호 :");

		idT = new JTextField();
		pwdT = new JPasswordField();
		
		loginB = new JButton("로그인");
		cancelB = new JButton("취소");

		idL.setBounds(50, 50, 50, 30);
		pwdL.setBounds(50, 90, 100, 30);
		idT.setBounds(120, 50, 100, 30);
		pwdT.setBounds(120, 90, 100, 30);
		loginB.setBounds(50, 130, 80, 30);
		cancelB.setBounds(150, 130, 80, 30);

		Container c = this.getContentPane();
		c.add(idL);
		c.add(pwdL);
		c.add(idT);
		c.add(pwdT);
		c.add(loginB);
		c.add(cancelB);

		setBounds(900, 100, 300, 300);
		setVisible(true);

		// 이벤트
		this.addWindowListener(this);
		cancelB.addActionListener(this);
		loginB.addActionListener(this);

	}// login


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cancelB) {
			idT.setText("");
			pwdT.setText("");
		}
		if (e.getActionCommand()=="로그인") {
			id = idT.getText();
			pwd = pwdT.getText();
			System.out.println(pwd);
			new LoginResult(id, pwd);
		}

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new Login();

	}

}
