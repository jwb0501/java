package instance;

public class Practice4 {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		int kor = 90;
		int eng = 85;
		int mat = 100;
		int tot = kor+eng+mat;
		double avg = tot/3.0;
		
		System.out.println("�̸�"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"���");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+(int)tot+"\t"+String.format("%.2f", avg));

	}

}
