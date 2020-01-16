package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자열 입력해주세요 : ");
		String str = br.readLine();
		
		System.out.print("정수 입력해주세요 : ");
		int aa = Integer.parseInt(br.readLine());
		
		System.out.print("실수 입력해주세요 : ");
		double bb = Double.parseDouble(br.readLine());
		
		System.out.println(str);
		System.out.println(aa);
		System.out.println(bb);
		
	}

}
