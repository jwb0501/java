package io;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ScoreForm extends JFrame implements ActionListener{
	private JButton inputBtn, printBtn, serchBtn, sortBtn, saveBtn, loadBtn;
	private JLabel hakL, nameL, korL, engL, matL;
	private JTextField hakT, nameT, korT, engT, matT;
	private JTable output;
	private Score score;
	 
	
	public ScoreForm() {

		Panel westP = new Panel(new GridLayout(5, 1, 5, 2));
		hakL = new JLabel("학번", JLabel.RIGHT); nameL = new JLabel("이름", JLabel.RIGHT);
		korL = new JLabel("국어", JLabel.RIGHT); engL = new JLabel("영어", JLabel.RIGHT);
		matL = new JLabel("수학", JLabel.RIGHT); 
		hakT = new JTextField(20); nameT = new JTextField(20);
		korT = new JTextField(20); engT = new JTextField(20);
		matT = new JTextField(20);
		
		JPanel p1 = new JPanel();
		p1.add(hakL); p1.add(hakT);
		JPanel p2 = new JPanel();
		p2.add(nameL); p2.add(nameT);
		JPanel p3 = new JPanel();
		p3.add(korL); p3.add(korT);
		JPanel p4 = new JPanel();
		p4.add(engL); p4.add(engT);
		JPanel p5 = new JPanel();
		p5.add(matL); p5.add(matT);
		
		westP.add(p1);
		westP.add(p2); 
		westP.add(p3);
		westP.add(p4); 
		westP.add(p5);

		output = new JTable();
		JScrollPane scroll = new JScrollPane(output);
		
		Panel southP = new Panel(new GridLayout(1, 6, 5, 0));
		inputBtn = new JButton("입력");
		printBtn = new JButton("출력");
		serchBtn = new JButton("학번검색");
		sortBtn = new JButton("순위");
		saveBtn = new JButton("파일저장");
		loadBtn = new JButton("파일읽기");
		southP.add(inputBtn);
		southP.add(printBtn);
		southP.add(serchBtn);
		southP.add(sortBtn);
		southP.add(saveBtn);
		southP.add(loadBtn);
		
		score = new ScoreImpl();
		
		Container c = this.getContentPane();
		c.add("West", westP);
		c.add("Center", scroll);
		c.add("South", southP);

		
		//이벤트
		inputBtn.addActionListener(this);
		printBtn.addActionListener(this);
		serchBtn.addActionListener(this);
		sortBtn.addActionListener(this);
		saveBtn.addActionListener(this);
		loadBtn.addActionListener(this);
		
		setBounds(700, 200, 650, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==inputBtn) {
			ScoreDTO dto = new ScoreDTO(hakT.getText(), nameT.getText(), Integer.parseInt(korT.getText()), Integer.parseInt(engT.getText()), Integer.parseInt(matT.getText()));
			score.input(dto);
			JOptionPane.showMessageDialog(this, "등록완료!!");
			
			hakT.setText("");
			nameT.setText("");
			korT.setText("");
			engT.setText("");
			matT.setText("");
		}else if(e.getSource()==printBtn) {
			score.print(output);
		}else if(e.getSource()==serchBtn) {
			score.search(output);
		}else if(e.getSource()==sortBtn) {
			score.tot_desc(output);
		}else if(e.getSource()==saveBtn) {
			score.save();
		}else if(e.getSource()==loadBtn) {
			score.load(output);
			score.print(output);
		}
		
	}
	
	public static void main(String[] args) {
		new ScoreForm();
	}


}
