package io;

import java.awt.Event;
import java.awt.event.KeyAdapter;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuPane extends JMenuBar{
	private JMenu fileM, editM, viewM;
	private JMenuItem newM, openM, saveM, exitM, cutM, copyM, pasteM;
	
	public MenuPane() {
		
		fileM = new JMenu("����");
		newM = new JMenuItem("���θ����");
		openM = new JMenuItem("����");
		saveM = new JMenuItem("����");
		exitM = new JMenuItem("����");
		fileM.add(newM);
		fileM.add(openM);
		fileM.add(saveM);
		fileM.add(exitM);
		
		editM = new JMenu("����");
		cutM = new JMenuItem("�߶󳻱�");
		copyM = new JMenuItem("����");
		pasteM = new JMenuItem("�ٿ��ֱ�");
		editM.add(cutM);
		editM.add(copyM);
		editM.add(pasteM);
		
		viewM = new JMenu("����");
		
		this.add(fileM);
		this.add(editM);
		this.add(viewM);
		
		//����Ű
		cutM.setAccelerator(KeyStroke.getKeyStroke('X', Event.ALT_MASK));
		copyM.setAccelerator(KeyStroke.getKeyStroke('C', Event.ALT_MASK));
		pasteM.setAccelerator(KeyStroke.getKeyStroke('V', Event.ALT_MASK));
		
	}

	public JMenuItem getNewM() {
		return newM;
	}

	public JMenuItem getOpenM() {
		return openM;
	}

	public JMenuItem getSaveM() {
		return saveM;
	}

	public JMenuItem getExitM() {
		return exitM;
	}

	public JMenuItem getCutM() {
		return cutM;
	}

	public JMenuItem getCopyM() {
		return copyM;
	}

	public JMenuItem getPasteM() {
		return pasteM;
	}
	
	

}
