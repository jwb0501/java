package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����4] �߱�����
ũ�Ⱑ 3���� ������ �迭�� ��� 1~9������ ������ �߻��Ѵ�
�߻��� ���� ���ߴ� ����
�ߺ��� �����Ѵ�

[������]
������ �����Ͻðڽ��ϱ�(Y/N) : w
������ �����Ͻðڽ��ϱ�(Y/N) : u
������ �����Ͻðڽ��ϱ�(Y/N) : y

������ �����մϴ�

�����Է� : 123
0��Ʈ����ũ 0��

�����Է� : 567
0��Ʈ����ũ 2��

�����Է� : 758
1��Ʈ����ũ 2��
...

�����Է� : 785
3��Ʈ����ũ 0��
*/

public class Practice4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] com = new int[3];
		int[] user = new int[3];
		String yn;
		int strike;
		int ball;

		while (true) {
			do {
				System.out.print("������ �����Ͻðڽ��ϱ�(Y/N) : ");
				yn = br.readLine();
			} while (!yn.equals("y") && !yn.equals("Y") && !yn.equals("n") && !yn.equals("N"));
			if (yn.equals("n") || yn.equals("N"))
				break;

			System.out.println();
			System.out.println("������ �����մϴ�");
			System.out.println();

			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9 + 1);
				for (int j = 0; j < i; j++) { // �ߺ�
					if (com[i] == com[j]) {
						i--;
						break;
					}
				}
			}

			do {
				System.out.print("���� �Է� : ");
				int num = Integer.parseInt(br.readLine());
				user[0] = num / 100;
				user[1] = num % 100 / 10;
				user[2] = num % 100 % 10;
				strike = 0;
				ball = 0;
				for (int i = 0; i < user.length; i++) {
					for (int j = 0; j < com.length; j++) {
						if (user[i] == com[j])
							if (i == j) {
								strike++;
							} else
								ball++;
					}
				}
				System.out.println(strike + "��Ʈ����ũ" + ball + "��");
			} while (strike != 3);
			if (strike == 3)
				break;
		}

	}

}
