package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���ڸ��߱� ����
//1~100������ ������ �߻��Ͽ� ���ߴ� ����
//[������]
//		���� �Է�: 50
//		50���� Ů�ϴ�
//		���� �Է�: 90
//		90���� �۽��ϴ�
//		...
//		���� �Է�: 87
//		������ xx������ ���߼̽��ϴ�
//	        �� �ҷ�(Y/N) : N
//  	���α׷� ����
public class NumberGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com, user, count;
		
		do {
			com = (int) (Math.random() * 100 + 1);
			count = 0;

			while (true) {
				System.out.print("���� �Է� : ");
				user = Integer.parseInt(br.readLine());
				count++;
				if (user == com)
					break;
				if (user < com)
					System.out.println(user + "���� Ů�ϴ�");
				else
					System.out.println(user + "���� �۽��ϴ�");
			} // while
			System.out.println();
			System.out.println("������ " + count + "������ ���߼̽��ϴ�");
			System.out.println();
			System.out.print("�� �ҷ�(Y/N) : ");
			String again = br.readLine();
			System.out.println();
			if (again.equals("N")||again.equals("n"))
				break;
		} while (true);
		System.out.println("���α׷� ����");

	}

}
