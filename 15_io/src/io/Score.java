package io;

import javax.swing.JTable;


public interface Score {
	public void input(ScoreDTO dto);
	public void print(JTable output);
	public void search(JTable output);
	public void tot_desc(JTable output); //¼øÀ§
	public void save();
	public void load(JTable output);

}
