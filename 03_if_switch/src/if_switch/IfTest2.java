package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3���� ����(a,b,c)�� �Է¹޾Ƽ� ������� ����Ͻÿ�

	[������]
	a�� �Է� : 78
	b�� �Է� : 25
	c�� �Է� : 36
	25 36 78
*/
public class IfTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("a�� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b�� �Է� : ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("c�� �Է� : ");
		int c = Integer.parseInt(br.readLine());

		if (a < b && a < c) {// a�� ���� ������
			if (b < c)
				System.out.println(a + "\t" + b + "\t" + c);
			else
				System.out.println(a + "\t" + c + "\t" + b);
		} else if (b < c) {// b�� ���� ������
			if (a < c)
				System.out.println(b + "\t" + a + "\t" + c);
			else
				System.out.println(b + "\t" + c + "\t" + a);
		} else {// c�� ���� ������
			if (a < b)
				System.out.println(c + "\t" + a + "\t" + b);
			else
				System.out.println(c + "\t" + b + "\t" + a);
		}

	}

}
