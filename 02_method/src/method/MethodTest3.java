package method;

// �̸�, ����, ����, ������ �Է� �޾Ƽ� ����, ����� ���Ͻÿ�.
// ������ calcTot()
// ����� calcAvg()
// �̸� �Է� :
// ���� �Է� :
// ���� �Է� : 
// ���� �Է� :
/*   *** ȫ�浿 ����ǥ ***
   ���� ���� ���� ���� ���
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest3 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�̸� �Է� : ");
		String name = br.readLine();
		System.out.print("���� �Է� : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("���� �Է� : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("���� �Է� : ");
		int mat = Integer.parseInt(br.readLine());
		
		MethodTest3 mt = new MethodTest3();
		int tot = mt.calcTot(kor, eng, mat);
		double avg = mt.calcAvg(tot);

		System.out.println("\t *** " + name + " ����ǥ ***");
		System.out.println("����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "���");
		System.out.println(kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + String.format("%.2f", avg));

	}

	public int calcTot(int kor, int eng, int mat) {
		return kor + eng + mat;
	}
	
	public double calcAvg(int tot) {
		return tot / 3.0;
	}
}
