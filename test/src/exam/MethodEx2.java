package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx2 {
	public void summarize(int a, int b) {
		int sum = 0;
		for(int i = a; i<=b; i++) {
			sum +=i;
		}
		System.out.println(a+"와 "+b+" 사이의 자연수의 합은"+sum);
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MethodEx2 m = new MethodEx2();
		System.out.print("첫번째 숫자: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두번째 숫자: ");
		int b = Integer.parseInt(br.readLine());
		m.summarize(a, b);
		

	}

}
