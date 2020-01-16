package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class ScoreImpl implements Score {
	private ArrayList<ScoreDTO> list;
	private Vector<String> vector;
	private DefaultTableModel model;
	private JTable table;
	private File file;

	public ScoreImpl() {
		list = new ArrayList<ScoreDTO>();
	}

	@Override
	public void input(ScoreDTO dto) {
		list.add(dto);
	}

	@Override
	public void print(JTable output) {
		vector = new Vector<String>();
		vector.add("학번");
		vector.add("이름");
		vector.add("국어");
		vector.add("영어");
		vector.add("수학");
		vector.add("총점");
		vector.add("평균");

		model = new DefaultTableModel(vector, 0);// 빈 행의 수를 만든다

		for (ScoreDTO dto : list) {
			Vector<String> v = new Vector<String>();
			v.add(dto.getHak());
			v.add(dto.getName());
			v.add(dto.getKor() + "");
			v.add(dto.getEng() + "");
			v.add(dto.getMat() + "");
			v.add(dto.getTot() + "");
			v.add(dto.getAvg() + "");

			model.addRow(v);
		}
		output.setModel(model);
	}

	@Override
	public void search(JTable output) {
		String hak = JOptionPane.showInputDialog("학번을 입력해주세요");
		if (hak == null)
			return;
		int sw=0;

		for (ScoreDTO dto : list) {
			if (hak.equals(dto.getHak())) {
				if(sw==0) model.setRowCount(0);
				Vector<String> v = new Vector<String>();
				v.add(dto.getHak());
				v.add(dto.getName());
				v.add(dto.getKor() + "");
				v.add(dto.getEng() + "");
				v.add(dto.getMat() + "");
				v.add(dto.getTot() + "");
				v.add(String.format("%.2f", dto.getAvg()));

				model.addRow(v);
				sw=1;
			}
		}
		
		if(sw==0) JOptionPane.showMessageDialog(table, "찾고자 하는 학번이 없습니다.");
	}

	@Override
	public void tot_desc(JTable output) {
		Collections.sort(list);
		print(output);
	}

	@Override
	public void save() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(table);

		if (result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
		if (file == null)
			return;
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			for (ScoreDTO dto : list) {
				oos.writeObject(dto);
			}
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void load(JTable output) {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(table);

		if (result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
		if (file == null)
			return;

		list.clear();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

			while (true) {
				try {
					ScoreDTO data = (ScoreDTO) ois.readObject();
					list.add(data);
				} catch (EOFException e) {
					break;
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
