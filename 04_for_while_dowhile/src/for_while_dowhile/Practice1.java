package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com, user;
		String answer;

		while (true) {
			System.out.print("����(1),����(2),��(3) �� ��ȣ �Է� : ");
			user = Integer.parseInt(br.readLine());
			com = (int) (Math.random() * 3 + 1);
			if (user == 1) {
				if (com == 1) {
					System.out.println("��ǻ�� : ����     �� : ����");
					System.out.println("You Draw!!");
				} else if (com == 2) {
					System.out.println("��ǻ�� : ����     �� : ����");
					System.out.println("You Lose!!");
				} else {
					System.out.println("��ǻ�� : ��     �� : ����");
					System.out.println("You Win!!");
				}
			} else if (user == 2) {
				if (com == 1) {
					System.out.println("��ǻ�� : ����     �� : ����");
					System.out.println("You Win!!");
				} else if (com == 2) {
					System.out.println("��ǻ�� : ����     �� : ����");
					System.out.println("You Draw!!");
				} else {
					System.out.println("��ǻ�� : ��     �� : ����");
					System.out.println("You Lose!!");
				}
			} else {
				if (com == 1) {
					System.out.println("��ǻ�� : ����     �� : ��");
					System.out.println("You Lose!!");
				} else if (com == 2) {
					System.out.println("��ǻ�� : ����     �� : ��");
					System.out.println("You Win!!");
				} else {
					System.out.println("��ǻ�� : ��     �� : ��");
					System.out.println("You Draw!!");
				}
			}
			System.out.print("�� �ҷ�?(Y/N)");
			answer = br.readLine();
			if(answer.equals("N")||answer.equals("n")) break;
		}
		System.out.println("���α׷��� �����մϴ�");

	}

}
