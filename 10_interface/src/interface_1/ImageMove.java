package interface_1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ImageMove extends Frame implements WindowListener, ActionListener{
	/**
	 * <font style="color:red;"> ����, ������ ��, �Ʒ��� �̵���Ű�¹�ư�̴�</font>
	 */
	private Button newB, left, up, down, right = null;
	private int x=100, y=100;
	
	public void init() {
		newB = new Button("�ʱ�ȭ");
		left = new Button("��  ��");
		up = new Button("  ��   ");
		down = new Button("��  ��");
		right = new Button("������");
		
		Panel p = new Panel();
		p.setLayout(new GridLayout(1,5,3,0));
		p.add(newB);
		p.add(left);
		p.add(up);
		p.add(down);
		p.add(right);
		
		this.add("North", p);
		
		setTitle("�̹��� �̵�");
		setBounds(700,200,500,500);
		setVisible(true);
		
		//�̺�Ʈ
		this.addWindowListener(this);
		newB.addActionListener(this);
		left.addActionListener(this);
		up.addActionListener(this);
		down.addActionListener(this);
		right.addActionListener(this);
		
	}//init
		
	@Override
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image img = t.getImage("������.jpg");
		if(x<-180) x=480;
		if(x>500) x=-180;
		if(y<-130) y=500;
		if(y>500) y=-130;
		g.drawImage(img, x, y, this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==newB) {
			x=100; y=100; repaint();
		}else if(e.getSource()==left) {
			x-=10; repaint();
		}else if(e.getSource()==up) {
			y-=10; repaint();
		}else if(e.getSource()==down) {
			y+=10; repaint();
		}else if(e.getSource()==right) {
			x+=10; repaint();
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
		new ImageMove().init();
		
	}

}
