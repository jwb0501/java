package interface_1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Frame�� BorderLayout(��������)
public class WindowTest2 extends Frame implements WindowListener, ActionListener{
	private Button newB, exitB = null;
	private TextArea area;
	
	public void init() {
		newB = new Button("���θ����");
		exitB = new Button("������");
		area = new TextArea();
		
		Panel p = new Panel();//FlowLayout(������ġ-�߾�)
		p.setBackground(new Color(255,150,150));
		p.add(newB);
		p.add(exitB);
		
		this.add("North", p);
		this.add("Center", area);
		
		setBounds(700, 200, 300, 400);
		setVisible(true);
		
		//�̺�Ʈ
		this.addWindowListener(this);
		exitB.addActionListener(this);
		newB.addActionListener(this);
		
	}

	public static void main(String[] args) {
		new WindowTest2().init();

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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==newB) {
			area.setText(" ");
			area.setText("");//�ʱ�ȭ
		}
		else if(e.getSource()==exitB) System.exit(0);
		
	}

}
