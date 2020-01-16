package io;

import java.io.Serializable;

public class ScoreDTO implements Serializable, Comparable<ScoreDTO>{
	private long serialVersionUID=-1;	
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	
	public ScoreDTO(String hak, String name, int kor, int eng, int mat) {
		super();
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = kor+eng+mat;
		this.avg = tot/3.0;
	}

	public String getHak() {
		return hak;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}
	
	@Override
	public String toString() {
		return String.format("%6s %6s %5d %5d %5d %5d %5d", hak, name, kor, eng, mat, tot, avg);
	}

	@Override
	public int compareTo(ScoreDTO o) {
		return tot < o.tot ? 1 : -1;
	}


	

}
