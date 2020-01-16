package omok;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class OmokFrame extends JFrame {
	private int lineX, lineY, WhiteX, whiteY, BlackX, BlackY;
	
	public OmokFrame() {
		
		Container c = getContentPane();
		c.setBackground(new Color(220, 120, 0));
		
		setTitle("¿À¸ñ");
		setBounds(500, 50, 900, 950);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawRect(50, 50, 800, 800);
		for(int i=1; i<16; i++) {
			g.drawLine(50+50*i, 50, 50+50*i, 850);
			g.drawLine(50, 50+50*i, 850, 50+50*i);
		}
		
	}
	
	
	public static void main(String[] args) {
		new OmokFrame();
	}

}
