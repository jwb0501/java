package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_Gugudan {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan, i;
		System.out.print("원하는 단을 입력 : ");
		dan = Integer.parseInt(br.readLine());

		for(i=1; i<=9;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}

	}

}
