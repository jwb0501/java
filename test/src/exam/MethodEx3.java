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
		System.out.println(max+"���� ���ʷ� Ŀ���� Ȧ���� "+num+"�̰� �ű������ ������ "+sum);
	}
	
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MethodEx3 m = new MethodEx3();
		System.out.print("���� �Է� : ");
		int max = Integer.parseInt(br.readLine());
		m.summarize(max);
		
	}

}
