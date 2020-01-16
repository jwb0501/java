package class_2;

import java.util.Scanner;

public class StringBufferTest {
	Scanner scan = new Scanner(System.in);
	private int dan;

	public StringBufferTest() {
		System.out.print("원하는 단을 입력 : ");
		dan = scan.nextInt();
	}

	public void output() {
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < 10; i++) {
			// System.out.println(dan+"*"+i+"="+dan*i);
			sb.append(dan);
			sb.append("*");
			sb.append(i);
			sb.append("=");
			sb.append(dan * i);
			System.out.println(sb.toString());

			sb.delete(0, sb.length());
		}
	}

	public static void main(String[] args) {
		new StringBufferTest().output();

	}

}
