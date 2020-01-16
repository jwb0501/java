package nested;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RGBTest extends JFrame {
	private JButton redB, greenB, blueB;
	private DrCanvas can;

	public RGBTest() {
		//redB = new JButton("빨강");
		redB = new JButton(new ImageIcon("smile.gif"));//인터페이스
		greenB = new JButton("초록");
		blueB = new JButton("파랑");

		can = new DrCanvas();

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1, 3, 5, 0));
		p.add(redB);
		p.add(greenB);
		p.add(blueB);
		
		Container c = this.getContentPane();
		c.add("North", p);
		c.add("Center", can);

		setBounds(700, 200, 500, 500);
		setVisible(true);

		// 이벤트
		this.addWindowListener(new WindowAdapter() {//추상클래스
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		redB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(255, 0, 0));
			}
		});
		greenB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(0,255,0));
			}
		});
		blueB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(0,0,255));
			}
		});

	}

	class DrCanvas extends Canvas {
		public DrCanvas() {
			this.setBackground(new Color(255, 200, 255));
		}
	}
	
	

	public static void main(String[] args) {
		new RGBTest();
	}

}
