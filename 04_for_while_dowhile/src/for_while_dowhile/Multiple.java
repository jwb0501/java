package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���ڸ� �Է��Ͽ� ����� 7���� ���Ͻÿ�
//�� �����̸� �ٽ� �Է��ϰ� 0�̸� �����Ͻÿ�
//
//[������]
//���� �Է� : -1
//���� �Է� : 9
//8 16 24 32 40 48 56
//���� �Է� : 0
//���α׷��� �����մϴ�

public class Multiple {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		while (true) {
			System.out.print("���� �Է� : ");
			num = Integer.parseInt(br.readLine());
			if (num < 0)
				continue;
			if (num == 0)
				break;
			for (int i = 1; i <= 7; i++) {
				System.out.print(num * i+" ");
			}System.out.println(); 
		}//while
		System.out.println("���α׷��� �����մϴ�");
	}

}
