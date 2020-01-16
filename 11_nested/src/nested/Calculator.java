package nested;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator extends JFrame implements WindowListener, ActionListener {
	private static final int CAL_WIDTH = 400;
	private static final int CAL_HEIGHT = 460;
	private JButton[] button;
	private JLabel dispL, inputL;
	private StringBuffer dispBuf, inputBuf;
	private int op;
	private double result;
	private boolean opCheck;
	private DecimalFormat df = new DecimalFormat("#.#######");

	public Calculator() {
		this.setLayout(null);

		dispL = new JLabel("", JLabel.RIGHT);
		dispL.setBackground(Color.WHITE);
		dispL.setOpaque(true);
		dispL.setFont(new Font("�ü�ü", 0, 20));
		dispL.setBounds(9, 10, 375, 50);

		inputL = new JLabel("0", JLabel.RIGHT);
		inputL.setBackground(Color.WHITE);
		inputL.setOpaque(true);
		inputL.setFont(new Font("�ü�ü", 0, 20));
		inputL.setBounds(9, 70, 375, 50);

		String[] title = { "��", "C", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", ".", "0", "=", "+", };
		button = new JButton[18];
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(title[i]);
		}

		button[0].setBounds(9, 130, 185, 50);// ��
		button[1].setBounds(199, 130, 185, 50);// c

//		for(int i=2; i<button.length;i++) {
//			int y=190;
//			button[i].setBounds(9, y, 90, 50);
//			button[i+1].setBounds(104, y, 90, 50);
//			button[i+2].setBounds(199, y, 90, 50);
//			button[i+3].setBounds(294, y, 90, 50);
//			y+=60;
//		}

		button[2].setBounds(9, 190, 90, 50);// 7
		button[3].setBounds(104, 190, 90, 50);// 8
		button[4].setBounds(199, 190, 90, 50);// 9
		button[5].setBounds(294, 190, 90, 50);///

		button[6].setBounds(9, 250, 90, 50);// 4
		button[7].setBounds(104, 250, 90, 50);// 5
		button[8].setBounds(199, 250, 90, 50);// 6
		button[9].setBounds(294, 250, 90, 50);// *

		button[10].setBounds(9, 310, 90, 50);// 1
		button[11].setBounds(104, 310, 90, 50);// 2
		button[12].setBounds(199, 310, 90, 50);// 3
		button[13].setBounds(294, 310, 90, 50);// -

		button[14].setBounds(9, 370, 90, 50);// .
		button[15].setBounds(104, 370, 90, 50);// 0
		button[16].setBounds(199, 370, 90, 50);// =
		button[17].setBounds(294, 370, 90, 50);// +

		Container c = this.getContentPane();
		c.add(dispL);
		c.add(inputL);
		for (int i = 0; i < button.length; i++) {
			add(button[i]);
			button[i].addActionListener(this);
		}

		this.addWindowListener(this);

		dispBuf = new StringBuffer();
		inputBuf = new StringBuffer("0");

		setTitle("����");
		setBounds(900, 200, CAL_WIDTH, CAL_HEIGHT);
		setVisible(true);
		setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String pushB = e.getActionCommand();
		if (pushB.equals("1") || pushB.equals("2") || pushB.equals("3") || pushB.equals("4") || pushB.equals("5")
				|| pushB.equals("6") || pushB.equals("7") || pushB.equals("8") || pushB.equals("9")) {
			if (dispBuf.length() == 0 && inputBuf.length() == 0) {
				dispL.setText("");
				inputL.setText("");
			}
			if (inputBuf.toString().equals("0"))
				inputBuf.delete(0, 1);
			inputBuf.append(pushB);
			inputL.setText(inputBuf.toString());

			opCheck = false;

		} else if (pushB.equals("0")) {
			if (inputBuf.indexOf(".") > -1 || !inputBuf.toString().equals("0")) {
				inputBuf.append(pushB);
				inputL.setText(inputBuf.toString());
			}

		} else if (pushB.equals(".")) {
			if (inputBuf.indexOf(".") == -1)
				inputBuf.append(pushB);
			inputL.setText(inputBuf.toString());

		} else if (pushB.equals("C")) {
			dispBuf.delete(0, dispBuf.length());
			inputBuf.delete(0, inputBuf.length());
			inputBuf.append("0");
			dispL.setText("");
			inputL.setText(inputBuf.toString());
			opCheck = false;
			op = 0;
			result = 0;

		} else if (pushB.equals("��")) {
			inputBuf.deleteCharAt(inputBuf.length() - 1);
			if (!inputBuf.toString().equals("0") && inputBuf.length() == 0)
				inputBuf.append("0");
			inputL.setText(inputBuf.toString());

		} else if (pushB.equals("+")) {
			if (!opCheck) {
				calc();

				dispBuf.append(inputBuf.toString() + pushB);
				op = '+';
				dispL.setText(dispBuf.toString());
				inputL.setText(df.format(result));
				inputBuf.delete(0, inputBuf.length());
				opCheck = true;
			}
		} else if (pushB.equals("-")) {
			if (!opCheck) {
				calc();

				dispBuf.append(inputBuf.toString() + pushB);
				op = '-';
				dispL.setText(dispBuf.toString());
				inputL.setText(df.format(result));
				inputBuf.delete(0, inputBuf.length());
				opCheck = true;
			}

		} else if (pushB.equals("*")) {
			if (!opCheck) {
				calc();

				dispBuf.append(inputBuf.toString() + pushB);
				op = '*';
				dispL.setText(dispBuf.toString());
				inputL.setText(df.format(result));
				inputBuf.delete(0, inputBuf.length());
				opCheck = true;
			}

		} else if (pushB.equals("/")) {
			if (!opCheck) {
				calc();

				dispBuf.append(inputBuf.toString() + pushB);
				op = '/';
				dispL.setText(dispBuf.toString());
				inputL.setText(df.format(result));
				inputBuf.delete(0, inputBuf.length());
				opCheck = true;
			}

		} else if (pushB.equals("=")) {
			if (!opCheck) {
				calc();
				dispBuf.append(inputBuf.toString() + pushB);
				dispL.setText(dispBuf.toString());
				inputL.setText(df.format(result));
				inputBuf.delete(0, inputBuf.length());
				dispBuf.delete(0, dispBuf.length());
				op = 0;
				opCheck = false;
			}
		}

	}

	public void calc() {
		if (op == 0) {
			result = Double.parseDouble(inputBuf.toString());
		} else if (op == '+') {
			result += Double.parseDouble(inputBuf.toString());
		} else if (op == '-') {
			result -= Double.parseDouble(inputBuf.toString());
		} else if (op == '*') {
			result *= Double.parseDouble(inputBuf.toString());
		} else if (op == '/') {
			result /= Double.parseDouble(inputBuf.toString());
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
		new Calculator();

	}
}
