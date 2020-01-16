package instance;

public class Practice4 {

	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 90;
		int eng = 85;
		int mat = 100;
		int tot = kor+eng+mat;
		double avg = tot/3.0;
		
		System.out.println("이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+(int)tot+"\t"+String.format("%.2f", avg));

	}

}
