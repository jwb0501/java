package class_1;

public class SungJukMain2 {

	public static void main(String[] args) {
		SungJuk[] ar = new SungJuk[3];//객체배열
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		
		ar[0].setName("홍길동");
		ar[0].setKor(90);
		ar[0].setEng(91);
		ar[0].setMath(100);
		
		ar[1].setName("또치");
		ar[1].setKor(80);
		ar[1].setEng(81);
		ar[1].setMath(85);
		
		ar[2].setName("코난");
		ar[2].setKor(95);
		ar[2].setEng(70);
		ar[2].setMath(80);
		
		for(SungJuk data : ar) {
			data.calc();
			System.out.println(data.getName()+"\t"+data.getKor()+"\t"+data.getEng()+"\t"+data.getMath()+"\t"+data.getTot()+"\t"+String.format("%.2f", data.getAvg())+"\t"+data.getGrade());
		}

	}

}
