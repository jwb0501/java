package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame {

	public WindowTest() {
		super("내가 만든 윈도우");//부모생성자 호출
		
		setForeground(Color.YELLOW);
		//setBackground(Color.CYAN);
		setBackground(new Color(98,73,194));
		
		//this.setSize(300, 400);
		setBounds(700, 200, 300, 400);
		setVisible(true);
		
	}
	
	@Override
	public void paint(Graphics g) {// call back 콜벡메소드(일정 시점이 되면 jvm에 의해서 호출), repaint()
		g.drawLine(10, 100, 200, 300);
		g.drawLine(10, 300, 200, 100);
		g.drawRect(100, 150	, 70, 70);
		g.drawOval(120, 150, 150, 150);
	}


	public static void main(String[] args) {
		new WindowTest();

	}

}
