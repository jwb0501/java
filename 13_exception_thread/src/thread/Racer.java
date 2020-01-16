package thread;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Racer extends Canvas implements Runnable {// �� 1����
	private int pos = 0;
	private static int rank;
	private String name;

	public Racer(String name) {
		this.name = name;

	}

	@Override
	public void paint(Graphics g) {
		Image img = Toolkit.getDefaultToolkit().getImage("horse.gif");
		g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
		g.drawImage(img, pos, 0, 50, this.getHeight(), this);
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i += (int) (Math.random() * 10 + 1)) {
			pos = i;
			repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(++rank + "�� : " + name);	
	}

}