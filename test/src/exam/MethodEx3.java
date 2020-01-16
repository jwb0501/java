package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx3 {
	public void summarize(int max) {
		int num = 1;
		int sum = 0;
		while(true) {
			sum+=num;
			if(sum>=max) {
				break;
			}
			num+=2;
		}
		System.out.println(max+"보다 최초로 커지는 홀수는 "+num+"이고 거기까지의 총합은 "+sum);
	}
	
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MethodEx3 m = new MethodEx3();
		System.out.print("숫자 입력 : ");
		int max = Integer.parseInt(br.readLine());
		m.summarize(max);
		
	}

}
