package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx4 {
	public int calcAksu(int num) {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MethodEx4 m = new MethodEx4();
		System.out.println("숫자 입력: ");
		int num = Integer.parseInt(br.readLine());
		int sum = m.calcAksu(num);
		System.out.println(num+"의 약수들의 합은"+sum);

	}

}
