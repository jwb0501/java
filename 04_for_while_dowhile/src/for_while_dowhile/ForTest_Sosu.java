package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
�Ҽ��� ���ϱ�
��, 0�� �ԷµǸ� ���α׷� �����մϴ�
[������]
���� �Է� : 12
12�� �Ҽ��� �ƴϴ�

���� �Է� : 37
37�� �Ҽ��̴�

���� �Է� : 0
���α׷��� �����մϴ�
*/
public class ForTest_Sosu {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		int sw;
//		int count = 0;
//
//		while (true) {
//			System.out.print("���� �Է� : ");
//			num = Integer.parseInt(br.readLine());
//			if(num==0) break;
//
//			for (int i = 1; i <= num; i++) {
//				if (num % i == 0) {
//					count++;
//				}
//			}
//			
//			if (count == 2) {
//				System.out.println(num + "�� �Ҽ��̴�");				
//			} else {
//				System.out.println(num + "�� �Ҽ��� �ƴϴ�");
//			}System.out.println();
		while (true) {
			sw=0;
			System.out.print("���� �Է� : ");
			num = Integer.parseInt(br.readLine());
			if(num==0) break;

			for (int i = 2; i < num; i++) {
				if (num % i == 0) sw=1;
			}
			
			if(sw==0) System.out.println(num + "�� �Ҽ��̴�");
			else System.out.println(num + "�� �Ҽ��� �ƴϴ�");
			System.out.println();
		}//while
		System.out.println("���α׷��� �����մϴ�");
	}

}
