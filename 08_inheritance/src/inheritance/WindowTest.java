package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame {

	public WindowTest() {
		super("���� ���� ������");//�θ������ ȣ��
		
		setForeground(Color.YELLOW);
		//setBackground(Color.CYAN);
		setBackground(new Color(98,73,194));
		
		//this.setSize(300, 400);
		setBounds(700, 200, 300, 400);
		setVisible(true);
		
	}
	
	@Override
	public void paint(Graphics g) {// call back �ݺ��޼ҵ�(���� ������ �Ǹ� jvm�� ���ؼ� ȣ��), repaint()
		g.drawLine(10, 100, 200, 300);
		g.drawLine(10, 300, 200, 100);
		g.drawRect(100, 150	, 70, 70);
		g.drawOval(120, 150, 150, 150);
	}


	public static void main(String[] args) {
		new WindowTest();

	}

}
