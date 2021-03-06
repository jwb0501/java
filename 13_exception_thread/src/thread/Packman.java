package thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Packman extends Frame implements KeyListener, Runnable {

	private Image img, img2;
	private int sel = 2;
	private int x = 225, y = 225;
	private int mx, my;
	private int[] fx, fy;

	public Packman() {
		Toolkit tk = Toolkit.getDefaultToolkit();

		img = tk.getImage("packman.jpg");
		img2 = tk.getImage("food.jpg");

		fx = new int[5];
		fy = new int[5];
		for (int i = 0; i < 5; i++) {
			fx[i] = (int) (Math.random() * 461 + 20);
			fy[i] = (int) (Math.random() * 461 + 20);
		}

		setBounds(900, 200, 500, 500);
		setVisible(true);
		setResizable(false);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.addKeyListener(this);

		// 스레드 생성
		Thread t = new Thread(this);
		t.start();

	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(img, x, y, x + 50, y + 50, sel * 50, 0, sel * 50 + 50, 50, this);

		for (int i = 0; i < 5; i++) {
			if (fx[i] - 10 <= x + 25 && fx[i] + 30 >= x + 25 && fy[i] - 10 <= y + 25 && fy[i] + 30 >= y + 25) {
				fx[i] = -100;
				fy[i] = -100;
			}
			g.drawImage(img2, fx[i], fy[i], 20, 20, this);
		}

	}

	@Override
	public void run() {
		while (true) {
			if (sel % 2 == 0)
				sel++;
			else
				sel--;

			x += mx;
			y += my;
			if (x > 500)
				x = 0;
			else if (x < 0)
				x = 500;
			else if (y > 500)
				y = 0;
			else if (y < 0)
				y = 500;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
			System.exit(0);
		else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			sel = 0;
			mx = -10;
			my = 0;
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			sel = 4;
			mx = 0;
			my = -10;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			sel = 6;
			mx = 0;
			my = 10;
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			sel = 2;
			mx = 10;
			my = 0;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	public static void main(String[] args) {
		new Packman();

	}

}
