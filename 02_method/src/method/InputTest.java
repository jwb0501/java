package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���ڿ� �Է����ּ��� : ");
		String str = br.readLine();
		
		System.out.print("���� �Է����ּ��� : ");
		int aa = Integer.parseInt(br.readLine());
		
		System.out.print("�Ǽ� �Է����ּ��� : ");
		double bb = Double.parseDouble(br.readLine());
		
		System.out.println(str);
		System.out.println(aa);
		System.out.println(bb);
		
	}

}
