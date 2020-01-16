package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx5 {
	public int calcGCM(int num1, int num2) {
		int sum = 0;
		int max = num1;
		int min = num2;
		if(num1<num2) {
			max=num2;
			min=num1;
		}
		for(int i=1;i<=min;i++) {
			if(max%i==0&&min%i==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MethodEx5 m = new MethodEx5();
		System.out.println("첫번째 숫자: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.println("두번째 숫자: ");
		int num2 = Integer.parseInt(br.readLine());
		int sum = m.calcGCM(num1, num2);
		System.out.println(num1+"과 "+num2+"의 공약수와 그것들의 합은 "+sum);
		
	}

}
