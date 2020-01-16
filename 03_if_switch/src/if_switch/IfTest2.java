package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오

	[실행결과]
	a값 입력 : 78
	b값 입력 : 25
	c값 입력 : 36
	25 36 78
*/
public class IfTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("a값 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b값 입력 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("c값 입력 : ");
		int c = Integer.parseInt(br.readLine());

		if (a < b && a < c) {// a가 가장 작은값
			if (b < c)
				System.out.println(a + "\t" + b + "\t" + c);
			else
				System.out.println(a + "\t" + c + "\t" + b);
		} else if (b < c) {// b가 가장 작은값
			if (a < c)
				System.out.println(b + "\t" + a + "\t" + c);
			else
				System.out.println(b + "\t" + c + "\t" + a);
		} else {// c가 가장 작은값
			if (a < b)
				System.out.println(c + "\t" + a + "\t" + b);
			else
				System.out.println(c + "\t" + b + "\t" + a);
		}

	}

}
