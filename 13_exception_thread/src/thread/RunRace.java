package thread;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class RunRace extends Frame implements ActionListener{
	
	private int count;
	private String[] name;
	private Button btn;
	private Racer[] racer;
	
	public RunRace(int count, String[] name) {
		this.count = count;
		this.name = name;
		btn = new Button("  출발   ");
		
		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p.add(btn);
				
		Panel p2 = new Panel(new GridLayout(count, 1));
		racer = new Racer[count];
		
		for(int i=0; i<count; i++) {
			racer[i] = new Racer(name[i]);
			p2.add(racer[i]);
		}
		
		add("South", p);
		add("Center", p2);
		

		setBounds(500, 200, 1000, 500);
		setVisible(true);
		setResizable(false);
		
		btn.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		btn.setEnabled(false);
		
		Thread[] t = new Thread[count];
		for(int i=0; i<count; i++) {
			t[i] = new Thread(racer[i]);
			t[i].setPriority((int)(Math.random()*10+1));//1~10
			t[i].start();
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("경주마 수를 입력 : ");
		int count = scan.nextInt();
		
		String[] name = new String[count]; 
		for (int i = 0; i < count; i++) {
			System.out.print("경주마 이름 입력 : ");
			name[i] = scan.next();
		}
		
		new RunRace(count, name); 
	}


}
