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
		System.out.println(a+"�� "+b+" ������ �ڿ����� ����"+sum);
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MethodEx2 m = new MethodEx2();
		System.out.print("ù��° ����: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("�ι�° ����: ");
		int b = Integer.parseInt(br.readLine());
		m.summarize(a, b);
		

	}

}
