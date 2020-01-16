package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx2 extends JFrame implements ActionListener {
	private ArrayList<PersonDTO> list;
	private Vector<String> vector;
	private DefaultTableModel model;
	private JTable table;
	private JButton addBtn, deleteBtn;

	public JTableEx2() {
		list = new ArrayList<PersonDTO>();
		list.add(new PersonDTO("hong", "ȫ�浿", "111", "010-123-1234"));
		list.add(new PersonDTO("conan", "�ڳ�", "123", "010-234-2356"));

		// ����
		vector = new Vector<String>();
		vector.addElement("���̵�");
		vector.addElement("�̸�");
		vector.add("��й�ȣ");
		vector.add("�ڵ���");

		model = new DefaultTableModel(vector, 0) {
			@Override
			public boolean isCellEditable(int r, int c) {
				return (c != 0) ? true : false;
			}
		};// �� ���� ���� �����

		for (PersonDTO dto : list) {
			Vector<String> v = new Vector<String>();
			v.add(dto.getId());
			v.add(dto.getName());
			v.add(dto.getPwd());
			v.add(dto.getTel());

			model.addRow(v);
		}

		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);

		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT));
		addBtn = new JButton("�߰�");
		deleteBtn = new JButton("����");
		p.add(addBtn);
		p.add(deleteBtn);

		Container con = this.getContentPane();
		con.add("Center", scroll);
		con.add("South", p);

		addBtn.addActionListener(this);
		deleteBtn.addActionListener(this);

		setBounds(900, 300, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addBtn)
			input();
		else if (e.getSource() == deleteBtn)
			delete();
	}

	public void input() {
		String id = JOptionPane.showInputDialog(this, "���̵� �Է����ּ���");
		if(id==null) return;
		for (int i = 0; i<model.getRowCount();i++) {
			if (id.equals(model.getValueAt(i, 0))) {
				JOptionPane.showMessageDialog(this, "�ߺ��� ���̵��Դϴ�");
				return;
			} 
		}
		String name = JOptionPane.showInputDialog(this, "�̸��� �Է����ּ���");
		String pwd = JOptionPane.showInputDialog(this, "��й�ȣ�� �Է����ּ���");
		String tel = JOptionPane.showInputDialog(this, "�ڵ�����ȣ�� �Է����ּ���");
		list.add(new PersonDTO(id, name, pwd, tel));

		Vector<String> v = new Vector<String>();
		v.add(id);
		v.add(name);
		v.add(pwd);
		v.add(tel);

		model.addRow(v);

	}

	public void delete() {
		while (true) {
			String name = JOptionPane.showInputDialog(this, "�̸��� �Է����ּ���");
			int count = 0;

			Iterator<PersonDTO> it = list.iterator();
			while (it.hasNext()) {
				PersonDTO dto = it.next();
				if (dto.getName().equals(name)) {
					it.remove(); // it.next()�� ��ȯ�� ���� �����
					model.removeRow(count);
					count++;
				}
			}
			if (count != 0)
				break;
		}

	}

	public static void main(String[] args) {
		new JTableEx2();
	}

}
