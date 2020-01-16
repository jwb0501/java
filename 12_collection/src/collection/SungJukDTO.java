package collection;

public class SungJukDTO implements Comparable<SungJukDTO> {
	private int num, kor, eng, mat, tot;
	private String name;
	private double avg;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTot() {
		return tot;
	}
	public double getAvg() {
		return avg;
	}
	public void calc() {
		this.tot = kor+eng+mat;
		this.avg = tot/3.0;
	}
	@Override
	public int compareTo(SungJukDTO dto) {//총점 내림차순
//		if(tot < dto.tot ) return 1;
//		else if(tot == dto.tot) return 0;
//		else return -1;
		return tot < dto.tot ? 1 : -1;
	}
	
	
	
}
