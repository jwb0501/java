package class_2;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���ڿ� �Է� : ");
		String str = scan.next();

		System.out.print("���� ���ڿ� �Է� : ");
		String str1 = scan.next();

		System.out.print("�ٲ� ���ڿ� �Է� : ");
		String str2 = scan.next();

		str = str.toLowerCase();// �ҹ��ں�ȯ
		str1 = str1.toLowerCase();

		// ġȯ ����
//		int count = 0;
//		String str3 = str;
//		while (true) {
//			if (str3.indexOf(str1) == -1)
//				break;
//			else {
//				str3 = str3.substring(str3.indexOf(str1) + str1.length());
//				count++;
//			}
//		}	

		int count = 0, index = 0;
		while ((index = str.indexOf(str1, index)) != -1) {
			index += str1.length();
			count++;
		}

		if (str.length() < str1.length()) {
			System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�");
			return;
		} else {
			str = str.replace(str1, str2);
			System.out.println(str);
		}

		System.out.println(count + "�� ġȯ");
	}

}
