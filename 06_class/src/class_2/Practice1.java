package class_2;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String str = scan.next();

		System.out.print("현재 문자열 입력 : ");
		String str1 = scan.next();

		System.out.print("바꿀 문자열 입력 : ");
		String str2 = scan.next();

		str = str.toLowerCase();// 소문자변환
		str1 = str1.toLowerCase();

		// 치환 개수
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
			System.out.println("입력한 문자열의 크기가 작습니다");
			return;
		} else {
			str = str.replace(str1, str2);
			System.out.println(str);
		}

		System.out.println(count + "번 치환");
	}

}
