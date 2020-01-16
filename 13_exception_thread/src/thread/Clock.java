package thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Frame implements Runnable {

	public Clock() {
		setFont(new Font("돋음체", Font.BOLD, 20));
		setForeground(Color.RED);
		setBounds(900, 200, 300, 100);
		setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// 스레드 생성
		Thread t = new Thread(this);
		// 스레드 시작
		t.start();

	}

	@Override
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH시 mm분 ss초");
		Date date = new Date();
		g.drawString(simpleDateFormat.format(date), 80, 50);

	}

	public static void main(String[] args) {
		new Clock();

	}

}
