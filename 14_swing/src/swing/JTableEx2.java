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
		list.add(new PersonDTO("hong", "홍길동", "111", "010-123-1234"));
		list.add(new PersonDTO("conan", "코난", "123", "010-234-2356"));

		// 제목
		vector = new Vector<String>();
		vector.addElement("아이디");
		vector.addElement("이름");
		vector.add("비밀번호");
		vector.add("핸드폰");

		model = new DefaultTableModel(vector, 0) {
			@Override
			public boolean isCellEditable(int r, int c) {
				return (c != 0) ? true : false;
			}
		};// 빈 행의 수를 만든다

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
		addBtn = new JButton("추가");
		deleteBtn = new JButton("삭제");
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
		String id = JOptionPane.showInputDialog(this, "아이디를 입력해주세요");
		if(id==null) return;
		for (int i = 0; i<model.getRowCount();i++) {
			if (id.equals(model.getValueAt(i, 0))) {
				JOptionPane.showMessageDialog(this, "중복된 아이디입니다");
				return;
			} 
		}
		String name = JOptionPane.showInputDialog(this, "이름을 입력해주세요");
		String pwd = JOptionPane.showInputDialog(this, "비밀번호를 입력해주세요");
		String tel = JOptionPane.showInputDialog(this, "핸드폰번호를 입력해주세요");
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
			String name = JOptionPane.showInputDialog(this, "이름을 입력해주세요");
			int count = 0;

			Iterator<PersonDTO> it = list.iterator();
			while (it.hasNext()) {
				PersonDTO dto = it.next();
				if (dto.getName().equals(name)) {
					it.remove(); // it.next()가 반환한 값을 지운다
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
