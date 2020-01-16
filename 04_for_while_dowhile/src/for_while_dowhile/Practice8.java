package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Practice8 p = new Practice8();
		int balance = 0;
		int num;

		do {
			System.out.println("***********");
			System.out.println(" 1. ����");
			System.out.println(" 2. ���");
			System.out.println(" 3. �ܰ�");
			System.out.println(" 4. ����");
			System.out.println("***********");
			System.out.print("��ȣ ���� : ");
			num = Integer.parseInt(br.readLine());

			switch (num) {
			case 1:
				balance = p.input(balance);
				break;

			case 2:
				balance = p.output(balance);
				break;
			case 3:
				System.out.println("�����  �ܾ��� " + balance + "�� �Դϴ�.");
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");

			}
		} while (!(num == 4));

	}

	// �Ա�
	public int input(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int deposit;
		System.out.print("���ݾ� : ");
		deposit = Integer.parseInt(br.readLine());
		if (deposit % 10000 == 0) {
			balance += deposit;
			System.out.println("����� �ܾ��� " + balance + "�� �Դϴ�.");
		} else {
			System.out.println("���� ������ �Է��ϼ���");
		}
		return balance;
	}

	// ���
	public int output(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int withdraw;
		System.out.print("��ݾ� : ");
		withdraw = Integer.parseInt(br.readLine());
		if (balance >= withdraw) {
			balance -= withdraw;
			System.out.println("����� �ܾ��� " + balance + "�� �Դϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�");
		}
		return balance;
	}

}
