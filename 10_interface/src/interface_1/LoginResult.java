package interface_1;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LoginResult extends JFrame implements WindowListener {
	// JLabel jLabel = new JLabel();

	private String id, pwd;

	public LoginResult(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;

		setBounds(900, 400, 150, 150);
		setVisible(true);

//		jframe.add(jLabel, "Center");
//		
//		if(this.id.equals("angel")&&this.pwd.equals("1004")) {
//			jLabel.setText("성공");
//		}else jLabel.setText("실패");

		this.addWindowListener(this);

	}

	@Override
	public void paint(Graphics g) {
		if (this.id.equals("angel") && this.pwd.equals("1004")) {
			g.drawString("성공", 40, 80);
			JOptionPane.showMessageDialog(this, "로그인 성공");
		} else {
			g.drawString("실패", 40, 80);
			JOptionPane.showMessageDialog(this, "로그인 실패");
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
		// System.exit(0);
		setVisible(false);

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

}
