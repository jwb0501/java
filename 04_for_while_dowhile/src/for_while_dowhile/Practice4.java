package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����4] ���� ����
10~99 ������ ������ 2��(a,b) �߻��Ͽ� ���� ���ߴ� ����
�������� �� 5������ �����Ѵ�
1������ ���� 20���� ���
���� Ʋ���� ��ȸ�� 1�� �� �����Ѵ�

[������]
[1] 25 + 36 = 45
Ʋ�ȴ�
[1] 25 + 36 = 61
������

[2] 78 + 10 = 100
Ʋ�ȴ�
[2] 78 + 10 = 95
Ʋ�ȴ�...���� :
...

����� �� x������ ���߾ xx�� �Դϴ�

continue(y/n) : w
continue(y/n) : n
���α׷��� �����մϴ�
*/
public class Practice4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, sum, answer, count, ok;
		String yn;

		do {
			ok = 0;
			for (int i = 1; i <= 5; i++) {
				num1 = (int) (Math.random() * 90 + 10);
				num2 = (int) (Math.random() * 90 + 10);
				sum = num1 + num2;
				count = 0;
				while (true) {
					System.out.print("[" + i + "] " + num1 + " + " + num2 + " = ");
					answer = Integer.parseInt(br.readLine());
					if (answer == sum) {
						System.out.println("������");
						ok++;
						break;
					} else {
						System.out.println("Ʋ�ȴ�");
						count++;
					}
					if (count == 2) {
						System.out.println("Ʋ�ȴ�... ���� : " + sum);
						break;
					}
				}
			}
			System.out.println("����� �� " + ok + "������ ���߾ " + ok * 20 + "�� �Դϴ�");
			System.out.println();

			do {
				System.out.print("continue(y/n)");
				yn = br.readLine();
			} while (!yn.equals("n")&&!yn.equals("N")&&!yn.equals("y")&&!yn.equals("Y"));
			if (yn.equals("n")||yn.equals("N"))
				break;
		} while (true);
		System.out.println("���α׷��� �����մϴ�");
	}

}
