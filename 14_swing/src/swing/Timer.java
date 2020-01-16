package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Timer extends JFrame implements ActionListener, Runnable {
	private JButton startBtn, stopBtn;
	private boolean sw = true;
	private static int time =1;

	public Timer() {
		startBtn = new JButton("����");
		stopBtn = new JButton("����");

		Panel p = new Panel(new GridLayout(2,1,0,10));
		p.add(startBtn);
		p.add(stopBtn);

		Container con = this.getContentPane();
		con.add("East", p);

		startBtn.addActionListener(this);
		stopBtn.addActionListener(this);
		

		setBounds(900, 300, 200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void run() {
		time=1;
		
		for(int i = time;i<=21;i++) {
			if(!sw) break;
			repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			time =i;
		}
		startBtn.setEnabled(true);
		stopBtn.setEnabled(false);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 200, 200);
		g.setColor(Color.BLACK);
		g.drawString(Integer.toString(time), 70, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startBtn) {
			sw=true;
			new Thread(this).start();
			startBtn.setEnabled(false);
			stopBtn.setEnabled(true);
		} else if (e.getSource() == stopBtn) {
			sw=false;
			startBtn.setEnabled(true);
			stopBtn.setEnabled(false);
		}

	}

	public static void main(String[] args) {
		new Timer();

	}
}
